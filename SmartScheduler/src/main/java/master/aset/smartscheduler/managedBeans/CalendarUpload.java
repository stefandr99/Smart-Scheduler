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
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.security.enterprise.SecurityContext;
import master.aset.smartscheduler.entities.user.User;
import master.aset.smartscheduler.repositories.interfaces.ICalendarRepository;
import master.aset.smartscheduler.repositories.interfaces.IUserRepository;
import master.aset.smartscheduler.services.ExtenderService;
import net.fortuna.ical4j.data.CalendarBuilder;
import net.fortuna.ical4j.data.ParserException;
import net.fortuna.ical4j.model.Calendar;
import org.primefaces.model.file.UploadedFile;

@Named(value = "calendarUpload")
@SessionScoped
public class CalendarUpload implements Serializable {
    
    @Inject
    ICalendarRepository calendarRepository;
    
    @Inject
    IUserRepository userRepository;
    
    @Inject
    SecurityContext securityContext;
    
    @Inject
    ExtenderService extenderService;

    private UploadedFile calendarFile;
    private List<String> calendarEntries;
    private String calendarName;

    public String getCalendarName() {
        return calendarName;
    }

    public void setCalendarName(String calendarName) {
        this.calendarName = calendarName;
    }
    
    @PostConstruct
    public void init() {
        calendarEntries = new ArrayList<String>();
    }
    public CalendarUpload() {
    }
    
    public String uploadFile() throws Exception {
        if (calendarFile != null && calendarFile.getSize() > 0 
                && this.calendarName != null && !this.calendarName.equals("")) {
            try (InputStream input = calendarFile.getInputStream()) {
                //parse and insert into db
                Path temp = Files.createTempFile("calendar", ".ics");
                Files.copy(input, temp, StandardCopyOption.REPLACE_EXISTING);
                FileInputStream fin = new FileInputStream(temp.toFile());
                CalendarBuilder builder = new CalendarBuilder();
                
                master.aset.smartscheduler.entities.calendar.Calendar exampleCalendar = new master.aset.smartscheduler.entities.calendar.Calendar();
                
                exampleCalendar.setName(this.calendarName);
                
                String username = securityContext.getCallerPrincipal().getName();
                User user = userRepository.getByEmail(username);
                exampleCalendar.addUser(user);
                
                Calendar calendar = builder.build(fin);
                extenderService.addCalendarInfo(calendar, exampleCalendar);
                calendarRepository.create(exampleCalendar);
                
                user.addCalendar(exampleCalendar);
                userRepository.update(user);
            
                fin.close();
            } catch (IOException | ParserException e) {
                e.printStackTrace();
            }
        } else {
            return "calendarParse";
        }
        return "viewCalendar";
    }
    
    public List<String> getCalendarEntries() {
        return calendarEntries;
    }

    public void setCalendarEntries(List<String> calendarEntries) {
        this.calendarEntries = calendarEntries;
    }

    public void setCalendarFile(UploadedFile calendarFile) {
        this.calendarFile = calendarFile;
    }

    public UploadedFile getCalendarFile() {
        return calendarFile;
    }
}
