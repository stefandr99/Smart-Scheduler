package master.aset.smartscheduler.services;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.Date;
import java.util.Iterator;
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
            DefaultScheduleEvent<?> event = DefaultScheduleEvent.builder()
                    .title(entry.getName())
                    .startDate(entry.getStartDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime())
                    .endDate(entry.getFinishDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime())
                    .description(entry.getName())
                    .borderColor("orange")
                    .build();
            eventModel.addEvent(event);
        }

        return  eventModel;
    }

    public User getCurrentUser() {
        String username = securityContext.getCallerPrincipal().getName();
        return userRepository.getByEmail(username);
    }
}
