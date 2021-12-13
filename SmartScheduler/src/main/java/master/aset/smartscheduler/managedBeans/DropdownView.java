package master.aset.smartscheduler.managedBeans;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.security.enterprise.SecurityContext;
import master.aset.smartscheduler.entities.calendar.Calendar;
import master.aset.smartscheduler.entities.user.User;
import master.aset.smartscheduler.repositories.interfaces.IUserRepository;


@Named(value = "dropdownView")
@ViewScoped
public class DropdownView implements Serializable {
    @Inject
    IUserRepository userRepository;
    
    @Inject
    SecurityContext securityContext;
    
    private Calendar[] selectedOptions;
    
    private Calendar[] selectedCalendars;
    
    private List<Calendar> calendars;
    
    private User currentUser;
    
    private Calendar selectedCalendar;
    
    public DropdownView() {
    }
    
    @PostConstruct
    public void init() {
        String username = securityContext.getCallerPrincipal().getName();
        this.currentUser = userRepository.getByEmail(username);
        this.calendars = currentUser.getCalendars();
        this.selectedCalendar = this.calendars.get(0);
    }
    
    public Calendar[] getSelectedOptions() {
        return selectedOptions;
    }

    public void setSelectedOptions(Calendar[] selectedOptions) {
        this.selectedOptions = selectedOptions;
    }

    public Calendar[] getSelectedCalendars() {
        return selectedCalendars;
    }

    public void setSelectedCalendars(Calendar[] selectedCalendars) {
        this.selectedCalendars = selectedCalendars;
    }

    public List<Calendar> getCalendars() {
        return calendars;
    }
    
    public void setCalendars(List<Calendar> calendars) {
        this.calendars = calendars;
    }
    
    public Calendar getSelectedCalendar() {
        if (selectedCalendar == null) {
            return this.calendars.get(0);
        }
        return selectedCalendar;
    }

    public void setSelectedCalendar(Calendar selectedCalendar) {
        this.selectedCalendar = selectedCalendar;
    }
}
