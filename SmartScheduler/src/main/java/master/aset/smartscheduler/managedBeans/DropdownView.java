package master.aset.smartscheduler.managedBeans;

import java.io.Serializable;
import java.util.*;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.inject.Inject;
import javax.security.enterprise.SecurityContext;
import master.aset.smartscheduler.entities.calendar.Calendar;
import master.aset.smartscheduler.entities.user.User;
import master.aset.smartscheduler.repositories.interfaces.ICalendarRepository;
import master.aset.smartscheduler.repositories.interfaces.IUserRepository;
import master.aset.smartscheduler.services.ConstraintService;

@Named(value = "dropdownView")
@ViewScoped
public class DropdownView implements Serializable {

    @Inject
    IUserRepository userRepository;
    
    private Calendar[] selectedOptions;
    
    private List<Calendar> selectedCalendars;

    private List<String> selectedCalendarsPriority;

    private List<Calendar> calendars;

    private User currentUser;

    private List<Calendar> calendarsOptions;

    private List<Calendar> selectedPublicCalendars;

    private String mergedCalendarName;

    @Inject
    ICalendarRepository calendarRepository;
    
    @Inject
    SecurityContext securityContext;

    public DropdownView() {
    }

    @PostConstruct
    public void init() {
        String username = securityContext.getCallerPrincipal().getName();
        this.currentUser = userRepository.getByEmail(username);
        this.calendars = currentUser.getCalendars();

        this.selectedCalendars = new ArrayList<>();
        this.selectedCalendars.add(calendars.get(0));
        this.calendarsOptions = currentUser.getCalendars();

        this.publicCalendarsOptions = calendarRepository.getPublicCalendars();
    }

    public List<Calendar> getSelectedPublicCalendars() {
        return selectedPublicCalendars;
    }

    public void setSelectedPublicCalendars(List<Calendar> selectedPublicCalendars) {
        this.selectedPublicCalendars = selectedPublicCalendars;
    }
    
    private List<Calendar> publicCalendarsOptions;

    public List<Calendar> getPublicCalendarsOptions() {
        return publicCalendarsOptions;
    }

    public void setPublicCalendarsOptions(List<Calendar> publicCalendarsOptions) {
        this.publicCalendarsOptions = publicCalendarsOptions;
    }
    
    public List<Calendar> getCalendarsOptions() {
        return calendarsOptions;
    }

    public void setCalendarsOptions(List<Calendar> calendarsOptions) {
        this.calendarsOptions = calendarsOptions;
    }
    
    public Calendar[] getSelectedOptions() {
        return selectedOptions;
    }

    public void setSelectedOptions(Calendar[] selectedOptions) {
        this.selectedOptions = selectedOptions;
    }

    public List<Calendar> getSelectedCalendars() {
        return selectedCalendars;
    }

    public void setSelectedCalendars(List<Calendar> selectedCalendars) {
        this.selectedCalendars = selectedCalendars;
    }
  
    public List<Calendar> getCalendars() {
        return calendars;
    }
    
    public void setCalendars(List<Calendar> calendars) {
        this.calendars = calendars;
    }
    
    public Calendar getSelectedCalendar() {
        return this.calendars.get(0);
    }
    
    public void addPublicCalendarToUser() {
        for (Calendar c : selectedPublicCalendars) {
            this.currentUser.addCalendar(c);
            this.userRepository.update(currentUser);
        }
    }

    public List<String> getSelectedCalendarsPriority() {
        return selectedCalendarsPriority;
    }

    public void setSelectedCalendarsPriority(List<String> selectedCalendarsPriority) {
        this.selectedCalendarsPriority = selectedCalendarsPriority;
    }

    public String getMergedCalendarName() {
        return mergedCalendarName;
    }

    public void setMergedCalendarName(String mergedCalendarName) {
        this.mergedCalendarName = mergedCalendarName;
    }
}
