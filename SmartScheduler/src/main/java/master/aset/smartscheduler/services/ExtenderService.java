
package master.aset.smartscheduler.services;

import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import net.fortuna.ical4j.model.Component;
import org.primefaces.model.DefaultScheduleModel;
import org.primefaces.model.ScheduleModel;
import net.fortuna.ical4j.model.Calendar;
import net.fortuna.ical4j.model.Component;
import net.fortuna.ical4j.model.parameter.Value;
import org.primefaces.model.DefaultScheduleEvent;

@Named(value = "extenderService")
@ApplicationScoped
public class ExtenderService {
    
    public static ScheduleModel eventModel;
//    private static final DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss");
    private static final DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");

    public static void addCalendarInfo(Calendar calendar) throws ParseException {
        eventModel = new DefaultScheduleModel();
        for (Iterator i = calendar.getComponents().iterator(); i.hasNext();) {
            Component component = (Component) i.next();
            //new event
            Date start = dateFormat.parse(component.getProperty("DTSTART").getValue());
            Date end = dateFormat.parse(component.getProperty("DTEND").getValue());
            String summary = component.getProperty("SUMMARY").getValue();
            DefaultScheduleEvent<?> event = DefaultScheduleEvent.builder()
                .title(summary)
                .startDate(start.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime())
                .endDate(end.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime())
                .description(summary)
                .borderColor("orange")
                .build();
            eventModel.addEvent(event);
        }
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
