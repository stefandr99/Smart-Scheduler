package master.aset.smartscheduler.services;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.security.enterprise.SecurityContext;
import master.aset.smartscheduler.entities.calendar.CalendarEntry;
import master.aset.smartscheduler.entities.user.User;
import master.aset.smartscheduler.repositories.interfaces.IUserRepository;
import org.primefaces.model.DefaultScheduleModel;
import org.primefaces.model.ScheduleModel;
import net.fortuna.ical4j.model.Calendar;
import net.fortuna.ical4j.model.Component;
import org.primefaces.model.DefaultScheduleEvent;

@Named(value = "extenderService")
@ApplicationScoped
public class ExtenderService {

    @Inject
    IUserRepository userRepository;

    @Inject
    SecurityContext securityContext;

    private final DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");

    public void addCalendarInfo(Calendar calendar, master.aset.smartscheduler.entities.calendar.Calendar dbCalendar) throws ParseException {
        for (Iterator i = calendar.getComponents().iterator(); i.hasNext();) {
            Component component = (Component) i.next();
            Date start = dateFormat.parse(component.getProperty("DTSTART").getValue());
            Date end = dateFormat.parse(component.getProperty("DTEND").getValue());
            String summary = component.getProperty("SUMMARY").getValue();

            dbCalendar.addCalendarEntry(new CalendarEntry(summary, start, end));
        }
    }
    
    public ScheduleModel updateCalendarInfo(master.aset.smartscheduler.entities.calendar.Calendar calendar) {
        return getEventToModel(calendar);
    }

    public ScheduleModel getDefaultCalendarInfo() {

        User user = getCurrentUser();
        master.aset.smartscheduler.entities.calendar.Calendar defaultCalendar = user.getCalendars().get(0);

        return getEventToModel(defaultCalendar);
    }

    public ScheduleModel getEventToModel(master.aset.smartscheduler.entities.calendar.Calendar calendar) {
        ScheduleModel eventModel = new DefaultScheduleModel();

        for (CalendarEntry entry : calendar.getCalendarEntries()) {
            if (entry.isRecurring()) {
                //obtain the start date day of week as a number
                int startDay = getDayNumber(entry.getStartDate());
                int finishDay = getDayNumber(entry.getFinishDate());
                
                int offset = 0;
                if (startDay > entry.getDay()) {
                    offset = 7 - startDay + entry.getDay() + 1;
                }
                java.util.Calendar c = java.util.Calendar.getInstance();
                c.setTime(entry.getStartDate());
                c.add(java.util.Calendar.DATE, offset);
                Date recurringStartDate = c.getTime();
                
                while (recurringStartDate.compareTo(entry.getFinishDate()) != -1) {
                    DefaultScheduleEvent<?> event;
                    try {
                        event = DefaultScheduleEvent.builder()
                                .title(entry.getName())
                                .startDate(addTimeToDate(recurringStartDate, entry.getStartTime()))
                                .endDate(addTimeToDate(recurringStartDate, entry.getEndTime()))
                                .description(entry.getName())
                                .borderColor("orange")
                                .build();
                        eventModel.addEvent(event);
                    } catch (ParseException ex) {
                        Logger.getLogger(ExtenderService.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    c.setTime(recurringStartDate);
                    c.add(java.util.Calendar.DATE, 7);
                    recurringStartDate = c.getTime();
                }
            } else {
                DefaultScheduleEvent<?> event = DefaultScheduleEvent.builder()
                    .title(entry.getName())
                    .startDate(entry.getStartDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime())
                    .endDate(entry.getFinishDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime())
                    .description(entry.getName())
                    .borderColor("orange")
                    .build();
                eventModel.addEvent(event);
            }
        }

        return  eventModel;
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
    
    private LocalDateTime addTimeToDate(Date date, String time) throws ParseException{
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

        DateFormat df2 = new SimpleDateFormat("MM/dd/yyyy");
        String startDateString = df2.format(date);

        startDateString = startDateString + " " + time + ":00";

        return df.parse(startDateString).toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();    
    }
}
