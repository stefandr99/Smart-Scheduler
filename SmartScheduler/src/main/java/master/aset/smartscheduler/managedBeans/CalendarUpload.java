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
import javax.inject.Inject;
import javax.servlet.http.Part;
import master.aset.smartscheduler.entities.calendar.CalendarEntry;
import master.aset.smartscheduler.repositories.CalendarRepository;
import master.aset.smartscheduler.repositories.interfaces.ICalendarRepository;
import master.aset.smartscheduler.services.ExtenderService;
import net.fortuna.ical4j.data.CalendarBuilder;
import net.fortuna.ical4j.data.ParserException;
import net.fortuna.ical4j.model.Calendar;
import net.fortuna.ical4j.model.Component;
import net.fortuna.ical4j.model.parameter.Value;


@Named(value = "calendarUpload")
@SessionScoped
public class CalendarUpload implements Serializable {
    
    @Inject
    ICalendarRepository calendarRepository;
    
    private Part calendarFile;
    private List<String> calendarEntries;

    public List<String> getCalendarEntries() {
        return calendarEntries;
    }

    public void setCalendarEntries(List<String> calendarEntries) {
        this.calendarEntries = calendarEntries;
    }



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
    
    public String uploadFile() throws Exception {
        boolean file1Success = false;
        
        if (calendarFile != null && calendarFile.getSize() > 0) {
            try (InputStream input = calendarFile.getInputStream()) {
                //parse and insert into db
                Path temp = Files.createTempFile("calendar", ".ics");
                Files.copy(input, temp, StandardCopyOption.REPLACE_EXISTING);
                FileInputStream fin = new FileInputStream(temp.toFile());
                CalendarBuilder builder = new CalendarBuilder();
                master.aset.smartscheduler.entities.calendar.Calendar exampleCalendar = new master.aset.smartscheduler.entities.calendar.Calendar();
                exampleCalendar.setName("TestCalendar");
                Calendar calendar = builder.build(fin);
                ExtenderService.addCalendarInfo(calendar, exampleCalendar);
                calendarRepository.create(exampleCalendar);
                fin.close();
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
