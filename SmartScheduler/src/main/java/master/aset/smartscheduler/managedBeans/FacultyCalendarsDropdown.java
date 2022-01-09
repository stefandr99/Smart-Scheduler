package master.aset.smartscheduler.managedBeans;

import java.io.Serializable;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Observes;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.security.enterprise.SecurityContext;
import master.aset.smartscheduler.entities.calendar.Calendar;
import master.aset.smartscheduler.entities.user.User;
import master.aset.smartscheduler.repositories.interfaces.ICalendarEntryRepository;
import master.aset.smartscheduler.repositories.interfaces.ICalendarRepository;
import master.aset.smartscheduler.repositories.interfaces.IUserRepository;
import master.aset.smartscheduler.services.ConstraintService;


@Named(value = "facultyCalendarsDropdown")
@ViewScoped
public class FacultyCalendarsDropdown implements Serializable {

    @Inject
    IUserRepository userRepository;

    @Inject
    ICalendarRepository calendarRepository;
    
    @Inject
    SecurityContext securityContext;
    
    private User currentUser;
    
    private List<Calendar> publicCalendarsOptions;

    private List<Calendar> selectedPublicCalendars;
    
    public FacultyCalendarsDropdown() {
    }
    
    @PostConstruct
    public void init() {
        String username = securityContext.getCallerPrincipal().getName();
        this.currentUser = userRepository.getByEmail(username);

        this.publicCalendarsOptions = calendarRepository.getPublicCalendars();
        
        this.publicCalendarsOptions.removeAll(currentUser.getCalendars());
    }

    public List<Calendar> getSelectedPublicCalendars() {
        return selectedPublicCalendars;
    }

    public void setSelectedPublicCalendars(List<Calendar> selectedPublicCalendars) {
        this.selectedPublicCalendars = selectedPublicCalendars;
    }
    
    public List<Calendar> getPublicCalendarsOptions() {
        return publicCalendarsOptions;
    }

    public void setPublicCalendarsOptions(List<Calendar> publicCalendarsOptions) {
        this.publicCalendarsOptions = publicCalendarsOptions;
    }
    
    public void onCalendarCreated(@Observes Calendar calendar) {
        this.init();
    }
    
    public void addPublicCalendarToUser() {
        for (Calendar c : selectedPublicCalendars) {
            this.currentUser.addCalendar(c);
            this.userRepository.update(currentUser);
        }
    }
}
