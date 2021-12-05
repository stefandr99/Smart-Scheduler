
package master.aset.smartscheduler.services;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.Date;
import java.util.Iterator;
import java.util.Properties;
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
    
//    private static final DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss");
    private final DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");

    public void addCalendarInfo(Calendar calendar, master.aset.smartscheduler.entities.calendar.Calendar dbCalendar) throws ParseException {
        for (Iterator i = calendar.getComponents().iterator(); i.hasNext();) {
            Component component = (Component) i.next();
            //new event
            Date start = dateFormat.parse(component.getProperty("DTSTART").getValue());
            Date end = dateFormat.parse(component.getProperty("DTEND").getValue());
            String summary = component.getProperty("SUMMARY").getValue();
            
            dbCalendar.addCalendarEntry(new CalendarEntry(summary, start, end));
        }
    }

    public ScheduleModel updateCalendarInfo(master.aset.smartscheduler.entities.calendar.Calendar[] calendars, ScheduleModel eventModel) {
        eventModel = new DefaultScheduleModel();
        
        for (int i = 0; i < calendars.length; i++) {
            for(CalendarEntry e : calendars[i].getCalendarEntries()) {        
                DefaultScheduleEvent<?> event = DefaultScheduleEvent.builder()
                .title(e.getName())
                .startDate(e.getStartDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime())
                .endDate(e.getFinishDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime())
                .description(e.getName())
                .borderColor("orange")
                .build();
                eventModel.addEvent(event);
            }
        }
        
        return eventModel;
    }
    
    public ScheduleModel getDefaultCalendarInfo() {
        ScheduleModel exampleModel = new DefaultScheduleModel();
        
        String username = securityContext.getCallerPrincipal().getName();
        User user = userRepository.getByEmail(username);
        master.aset.smartscheduler.entities.calendar.Calendar defaultCalendar = user.getCalendars().get(0);

        for(CalendarEntry e : defaultCalendar.getCalendarEntries()){        
                DefaultScheduleEvent<?> event = DefaultScheduleEvent.builder()
                .title(e.getName())
                .startDate(e.getStartDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime())
                .endDate(e.getFinishDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime())
                .description(e.getName())
                .borderColor("orange")
                .build();
            exampleModel.addEvent(event);
    }
        return exampleModel;
    }
    

    public static class ExtenderExample {
        private String details;
        private String html;
        private String key;
        private String link;
        private String name;
        private String value;

        public ExtenderExample(String key, Properties properties) {
            this.key = key;
            this.details = properties.getProperty(key + ".details");
            this.html = properties.getProperty(key + ".html");
            this.link = properties.getProperty(key + ".link");
            this.name = properties.getProperty(key + ".name");
            this.value = properties.getProperty(key + ".value");
        }

        public String getDetails() {
            return details;
        }

        public String getHtml() {
            return html;
        }

        public String getKey() {
            return key;
        }

        public String getLink() {
            return link;
        }

        public String getName() {
            return name;
        }

        public String getValue() {
            return value;
        }
    }
}
