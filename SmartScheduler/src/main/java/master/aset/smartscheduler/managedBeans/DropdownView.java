package master.aset.smartscheduler.managedBeans;

import java.io.Serializable;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
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


@Named(value = "dropdownView")
@ApplicationScoped
public class DropdownView implements Serializable {

    @Inject
    IUserRepository userRepository;
    
    @Inject
    ConstraintService constraintService;
    
    private Calendar[] selectedOptions;
    
    private List<Calendar> selectedCalendars;

    @Inject
    ICalendarRepository calendarRepository;
    
    @Inject
    SecurityContext securityContext;

    
    private List<Calendar> calendars;
    
    private User currentUser;
    
    private List<Calendar> calendarsOptions;
    
    public List<Calendar> getCalendarsOptions() {
        return calendarsOptions;
    }

    public void setCalendarsOptions(List<Calendar> calendarsOptions) {
        this.calendarsOptions = calendarsOptions;
    }
    
    
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
        this.calendarsOptions.addAll(calendarRepository.getPublicCalendars());
    }
    
    public void onCalendarCreated(@Observes Calendar calendar) {
        this.init();
    }

    public void merge() {
        int[] calendarIds = new int[selectedCalendars.size()];
        int i = 0;

        for(Calendar c : selectedCalendars) {
            calendarIds[i] = c.getId();
            i++;
        }

        constraintService.mergeCalendars(calendarIds);
    }
    
    public Calendar[] getSelectedOptions() {
        return selectedOptions;
    }

    public void setSelectedOptions(Calendar[] selectedOptions) {
        this.selectedOptions = selectedOptions;
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
}
