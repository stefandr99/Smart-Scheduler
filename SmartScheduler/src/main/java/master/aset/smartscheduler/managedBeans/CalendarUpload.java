package master.aset.smartscheduler.managedBeans;

import java.io.FileInputStream;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.servlet.http.Part;
import master.aset.smartscheduler.entities.calendar.CalendarEntries;
import net.fortuna.ical4j.data.CalendarBuilder;
import net.fortuna.ical4j.data.ParserException;
import net.fortuna.ical4j.model.Calendar;
import net.fortuna.ical4j.model.Component;
import net.fortuna.ical4j.model.parameter.Value;


@Named(value = "calendarUpload")
@SessionScoped
public class CalendarUpload implements Serializable {
    private Part calendarFile;
    private List<String> calendarEntries;

    public List<String> getCalendarEntries() {
        return calendarEntries;
    }

    public void setCalendarEntries(List<String> calendarEntries) {
        this.calendarEntries = calendarEntries;
    }

//    private static final DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss");
    private static final DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");

    public void setCalendarFile(Part calendarFile) {
        this.calendarFile = calendarFile;
    }

    public Part getCalendarFile() {
        return calendarFile;
    }
    @PostConstruct
    public void init() {
        calendarEntries = new ArrayList<String>();
    }
    public CalendarUpload() {
    }
    
    public String uploadFile() throws IOException, ParserException {
        boolean file1Success = false;
        
        if (calendarFile != null && calendarFile.getSize() > 0) {
            try (InputStream input = calendarFile.getInputStream()) {
                //parse and insert into db
                Path temp = Files.createTempFile("calendar", ".ics");
                Files.copy(input, temp, StandardCopyOption.REPLACE_EXISTING);
                FileInputStream fin = new FileInputStream(temp.toFile());
                CalendarBuilder builder = new CalendarBuilder();
                Calendar calendar = builder.build(fin);
                
                for (Iterator i = calendar.getComponents().iterator(); i.hasNext();) {
                    Component component = (Component) i.next();
                    //new event
                    Date start = dateFormat.parse(component.getProperty("DTSTART").getValue());
                    Date end = dateFormat.parse(component.getProperty("DTEND").getValue());
                    String summary = component.getProperty("SUMMARY").getValue();
                    calendarEntries.add(summary + " Start time: " + start + " End time:" + end); 
                }

                fin.close();
            } catch (ParseException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ParserException e) {
                e.printStackTrace();
            }
            file1Success = true;
        }

        boolean file2Success = false;
        return "viewCalendar";
    }
}
