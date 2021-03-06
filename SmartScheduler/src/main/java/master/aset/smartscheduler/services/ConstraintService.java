package master.aset.smartscheduler.services;

import master.aset.smartscheduler.entities.calendar.Calendar;
import master.aset.smartscheduler.entities.calendar.CalendarEntry;
import master.aset.smartscheduler.entities.user.User;
import master.aset.smartscheduler.repositories.interfaces.ICalendarEntryRepository;
import master.aset.smartscheduler.repositories.interfaces.ICalendarRepository;
import master.aset.smartscheduler.repositories.interfaces.IUserRepository;
import org.chocosolver.solver.Model;
import org.chocosolver.solver.variables.BoolVar;
import org.chocosolver.solver.variables.IntVar;

import javax.ejb.LocalBean;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Event;
import javax.enterprise.inject.Any;
import javax.inject.Inject;
import javax.security.enterprise.SecurityContext;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.primefaces.model.DefaultScheduleEvent;

@ApplicationScoped
public class ConstraintService {
    @Inject
    ICalendarEntryRepository calendarEntryRepository;

    @Inject
    ICalendarRepository calendarRepository;

    @Inject
    IUserRepository userRepository;

    @Inject
    SecurityContext securityContext;

    @Inject
    @Any
    Event<Calendar> calendarEvent;

    private final int numberOfWeeks = 52;

    public Calendar mergeCalendars(int[] ids, Map<String, Integer> priorities, String newCalendarName) {
        // map with event index (eventIndex) as a key and its priority as a value
        List<Integer> eventsPriority = new ArrayList<>();
        int currentCalendarPriority;

        // get first day date of current week
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.set(java.util.Calendar.DAY_OF_WEEK, cal.getActualMinimum(java.util.Calendar.DAY_OF_WEEK) + 1);
        cal.set(java.util.Calendar.HOUR_OF_DAY, 0);
        cal.set(java.util.Calendar.MINUTE, 0);
        cal.set(java.util.Calendar.SECOND, 0);
        cal.set(java.util.Calendar.MILLISECOND, 0);
        Date firstDayOfTheWeek = cal.getTime();

        List<CalendarEntry> calendarEntries = new ArrayList<>();
        Calendar finalCalendar = new Calendar();

        // retrieve all events from calendars
        for(int i = 0 ; i < ids.length; i++) {
            Calendar calendar = calendarRepository.getById(ids[i]);
            currentCalendarPriority = priorities.get(calendar.getName());

            //TODO generate recurring entries
            
            if (calendar.isIsPublic()) {
                List<CalendarEntry> publicCalendarEntries = calendarEntryRepository.getByCalendar(calendar);
                for (CalendarEntry entry : publicCalendarEntries) {
                    //obtain the start date day of week as a number
                    int startDay = getDayNumber(entry.getStartDate());
                    int entryDay = mapEntryDayToCalendarFormat(entry.getDay());
                    int offset = 0;
                    if (startDay > entryDay) {
                        offset = 7 - startDay + entryDay;
                    } else {
                        offset = entryDay - startDay;
                    }
                    java.util.Calendar c = java.util.Calendar.getInstance();
                    c.setTime(entry.getStartDate());
                    c.add(java.util.Calendar.DATE, offset);
                    Date recurringStartDate = c.getTime();

                    while (recurringStartDate.compareTo(entry.getFinishDate()) <= 0) {
                        try {
                            CalendarEntry newEntry = new CalendarEntry();
                            newEntry.setName(entry.getName());
                            newEntry.setStartDate(addTimeToDate(recurringStartDate, entry.getStartTime()));
                            newEntry.setFinishDate(addTimeToDate(recurringStartDate, entry.getEndTime()));
                            newEntry.setRecurring(false);
                            
                            calendarEntries.add(newEntry);
                            eventsPriority.add(currentCalendarPriority);
                        } catch (ParseException e) {
                            System.out.println(e.getMessage());
                        }

                        c.setTime(recurringStartDate);
                        c.add(java.util.Calendar.DATE, 7);
                        recurringStartDate = c.getTime();
                    }
                }
            } else {
                for(CalendarEntry event : calendarEntryRepository.getByCalendar(calendar)) {
                    calendarEntries.add(event);
                    eventsPriority.add(currentCalendarPriority);
                }
            }
        }
        finalCalendar.setName(newCalendarName);
        User user = getCurrentUser();
        finalCalendar.addUser(user);
        calendarRepository.create(finalCalendar);
        user.addCalendar(finalCalendar);
        userRepository.update(user);

        // get start and end day of week
        Date startWeek = firstDayOfTheWeek;
        java.util.Calendar c = java.util.Calendar.getInstance();
        c.setTime(startWeek);
        c.add(java.util.Calendar.DAY_OF_MONTH, 7);
        Date endWeek = c.getTime();

        for(int i = 0; i < numberOfWeeks; i++) {
            // filter events that occurs in the week of this iteration
            Date finalStartWeek = startWeek;
            Date finalEndWeek = endWeek;
            Predicate<CalendarEntry> inWeek = event -> event.getStartDate().after(finalStartWeek) && event.getStartDate().before(finalEndWeek);

            List<CalendarEntry> weekEvents = calendarEntries.stream().filter(inWeek)
                    .collect(Collectors.toList());

            if(weekEvents.size() > 0) {

                // group weeks by their names (for example a course that occurs on monday and friday)
                Map<String, List<CalendarEntry>> groupedEvents =
                        weekEvents.stream().collect(Collectors.groupingBy(CalendarEntry::getName));

                // set index of every event and get duration
                Map<Integer, String> index = new HashMap<>();
                List<Integer> durations = new ArrayList<>();
                int taskNumber = 0;

                List<String> eventsName = new ArrayList<>();

                for(CalendarEntry ce : calendarEntries) {
                    if(!eventsName.contains(ce.getName())) {
                        eventsName.add(ce.getName());
                    }
                }

                for (String eventName : eventsName) {
                    // set index of every event
                    index.put(taskNumber, eventName);
                    taskNumber++;

                    List<CalendarEntry> calendarEntryList = groupedEvents.get(eventName);

                    // get duration of every event
                    long diff = calendarEntryList.get(0).getFinishDate().getTime() - calendarEntryList.get(0).getStartDate().getTime();
                    TimeUnit time = TimeUnit.MINUTES;
                    long duration = time.convert(diff, TimeUnit.MILLISECONDS);
                    durations.add((int) duration);
                }

                // build occurancesMatrix by iterating every event by its name
                int[][] occurrencesMatrix = new int[taskNumber][];
                int row = 0;


                for (String eventName : eventsName) {
                    // get all occurrences of current event in week
                    List<CalendarEntry> allTaskGrouped = groupedEvents.get(eventName);

                    // instantiate a new array representing matrix row
                    int[] currentTaskOcc = new int[allTaskGrouped.size() + 1];
                    int j = 0;

                    // iterate over current event and get its occurrences in this week
                    for (CalendarEntry calendarEntry : allTaskGrouped) {
                        LocalDateTime local = calendarEntry.getStartDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
                        LocalDateTime startWeekLocal = startWeek.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();

                        int hours = (int) ChronoUnit.HOURS.between(startWeekLocal, local);

                        currentTaskOcc[j] = hours;
                        j++;
                    }

                    occurrencesMatrix[row] = currentTaskOcc;
                    occurrencesMatrix[row][currentTaskOcc.length - 1] = -1;
                    row++;
                }

                // inmultim fiecare occurrence cu 60 ca sa avem matricea in minute
                for(int k = 0; k < occurrencesMatrix.length; k++) {
                    occurrencesMatrix[k] = Arrays.stream(occurrencesMatrix[k]).map(el -> el * 60).toArray();
                }

                Model model = new Model("Scheduler");

                IntVar[] solution = IntStream
                        .range(0, taskNumber)
                        .mapToObj(in -> model.intVar("task #" + in, occurrencesMatrix[in]))
                        .toArray(IntVar[]::new);

                int[] notMember = new int[]{-60};

                for(int j = 0; j < taskNumber - 1; j++) {
                    for(int k = j + 1; k < taskNumber; k++) {

                        model.or(model.arithm(solution[k], ">=", solution[j], "+", durations.get(j)),
                                model.arithm(solution[j], ">=" , solution[k], "+", durations.get(k))).post();

                        IntVar firstEventPriority = model.intVar(eventsPriority.get(j));
                        IntVar secondEventPriority = model.intVar(eventsPriority.get(k));

                        model.ifThen(
                                model.and(
                                        model.not(model.or(model.arithm(solution[k], ">=", solution[j], "+", durations.get(j)),
                                                model.arithm(solution[j], ">=" , solution[k], "+", durations.get(k)))),
                                        model.arithm(firstEventPriority, "<", secondEventPriority)),
                                model.arithm(solution[j], "=", -60)
                        );

                        model.ifThen(
                                model.and(
                                        model.not(model.or(model.arithm(solution[k], ">=", solution[j], "+", durations.get(j)),
                                                model.arithm(solution[j], ">=" , solution[k], "+", durations.get(k)))),
                                        model.arithm(firstEventPriority, ">", secondEventPriority)),
                                model.arithm(solution[k], "=", -60));
                    }
                }

                boolean solved = model.getSolver().solve();

                for(int j = 0; j < solution.length; j++) {
                    int occurrence = solution[j].getValue() / 60;
                    String eventName = index.get(j);
                    List<CalendarEntry> events = groupedEvents.get(eventName);

                    for(CalendarEntry event : events) {
                        LocalDateTime local = event.getStartDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
                        LocalDateTime startWeekLocal = startWeek.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();

                        int hours = (int) ChronoUnit.HOURS.between(startWeekLocal, local);

                        if(hours == occurrence) {
                            calendarRepository.addEntryToCalendar(finalCalendar, event);
                            break;
                        }
                    }
                }
            }

            startWeek = endWeek;
            c = java.util.Calendar.getInstance();
            c.setTime(startWeek);
            c.add(java.util.Calendar.DAY_OF_MONTH, 7);
            endWeek = c.getTime();

            boolean flag = true;
        }

        calendarEvent.fire(finalCalendar);
        return finalCalendar;
    }

    public User getCurrentUser() {
        String username = securityContext.getCallerPrincipal().getName();

        return userRepository.getByEmail(username);
    }
    
    private int getDayNumber(Date date) {
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.setTime(date);
        return cal.get(java.util.Calendar.DAY_OF_WEEK);
    }
    
    private int mapEntryDayToCalendarFormat(int day) {
        day += 2;
        if (day > 7) return 1;
        return day;
    }
    
    private Date addTimeToDate(Date date, String time) throws ParseException{
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

        DateFormat df2 = new SimpleDateFormat("MM/dd/yyyy");
        String startDateString = df2.format(date);

        startDateString = startDateString + " " + time + ":00";

        return df.parse(startDateString);
    }
}
