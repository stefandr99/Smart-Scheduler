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
import java.util.Iterator;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
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
        FacesContext facesContext = FacesContext.getCurrentInstance();

        if (calendarFile == null || calendarFile.getSize() <= 0) {
            facesContext.addMessage(null, 
                    new FacesMessage(FacesMessage.SEVERITY_ERROR, 
                            "You must upload a valid calendar file", 
                            "file is invalid"));
            return "calendarParse";
        }
        
        if (this.calendarName == null || this.calendarName.equals("")) {
            facesContext.addMessage(null, 
                    new FacesMessage(FacesMessage.SEVERITY_ERROR, 
                            "The name of the calendar should not be empty", 
                            "calendar name is invalid"));
            return "calendarParse";
        }
       
        try (InputStream input = calendarFile.getInputStream()) {
            CalendarBuilder builder = new CalendarBuilder();
            FileInputStream fin = getCalendarFileStream(input);

            User user = getCurrentUser();
            master.aset.smartscheduler.entities.calendar.Calendar exampleCalendar = createCalendarWithUser(user);
            if (exampleCalendar == null) {
                facesContext.addMessage(null, 
                        new FacesMessage(FacesMessage.SEVERITY_WARN, 
                                "There is already a calendar registered with the name " + calendarName, 
                                "Duplicate value"));
                fin.close();
                return "calendarParse";
            }
            Calendar calendar = builder.build(fin);
            extenderService.addCalendarInfo(calendar, exampleCalendar);
            calendarRepository.create(exampleCalendar);

            updateUser(user, exampleCalendar);

            fin.close();
        } catch (IOException | ParserException e) {
            e.printStackTrace();
        }
        
        return "viewCalendar";
    }

    public FileInputStream getCalendarFileStream(InputStream input) throws IOException {
        Path temp = Files.createTempFile("calendar", ".ics");
        Files.copy(input, temp, StandardCopyOption.REPLACE_EXISTING);

        return new FileInputStream(temp.toFile());
    }

    public master.aset.smartscheduler.entities.calendar.Calendar createCalendarWithUser(User user) {
        boolean foundDuplicatedCalendar = user.getCalendars().stream().anyMatch(c -> c.getName().equals(this.calendarName));
        if (!foundDuplicatedCalendar) {
            master.aset.smartscheduler.entities.calendar.Calendar exampleCalendar = new master.aset.smartscheduler.entities.calendar.Calendar();
            exampleCalendar.setName(this.calendarName);
            exampleCalendar.addUser(user);
            return exampleCalendar;
        }
        return null;
    }

    public User getCurrentUser() {
        String username = securityContext.getCallerPrincipal().getName();

        return userRepository.getByEmail(username);
    }

    public void updateUser(User user, master.aset.smartscheduler.entities.calendar.Calendar exampleCalendar) {
        user.addCalendar(exampleCalendar);
        userRepository.update(user);
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
