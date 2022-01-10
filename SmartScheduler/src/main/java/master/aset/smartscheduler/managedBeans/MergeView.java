package master.aset.smartscheduler.managedBeans;

import master.aset.smartscheduler.entities.calendar.Calendar;
import master.aset.smartscheduler.entities.user.User;
import master.aset.smartscheduler.repositories.interfaces.ICalendarRepository;
import master.aset.smartscheduler.repositories.interfaces.IUserRepository;
import master.aset.smartscheduler.services.ConstraintService;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.inject.Named;
import javax.security.enterprise.SecurityContext;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Named(value = "mergeView")
@SessionScoped
public class MergeView implements Serializable {
    @Inject
    IUserRepository userRepository;

    @Inject
    ConstraintService constraintService;

    private Calendar[] selectedOptions;


    private List<String> selectedCalendarsPriority;


    private User currentUser;

    private List<Calendar> calendarsOptions;

    private List<Calendar> selectedPublicCalendars;



    private List<Calendar> publicCalendarsOptions;

    private List<Calendar> calendars;
    private List<Calendar> selectedCalendars;

    private String mergedCalendarName;

    @Inject
    ICalendarRepository calendarRepository;

    @Inject
    SecurityContext securityContext;

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

    public void onCalendarCreated(@Observes Calendar calendar) {
        this.init();
    }

    public String change(){
        selectedCalendarsPriority = new ArrayList<>();
        for (Calendar c: selectedCalendars)
            selectedCalendarsPriority.add(c.getName());

        return "change";
    }

    public String merge() {
        Map<String, Integer> priorities = new HashMap<>();
        int calendarsLen = selectedCalendars.size();
        int[] calendarIds = new int[calendarsLen];
        int i = 0;

        for(Calendar c : selectedCalendars) {
            calendarIds[i] = c.getId();
            i++;
        }

        for(int j = 0; j < selectedCalendars.size(); j++) {
            priorities.put(selectedCalendarsPriority.get(j), calendarsLen - j);
        }

        constraintService.mergeCalendars(calendarIds, priorities, mergedCalendarName);

        mergedCalendarName = "";

        return "extender";
    }

    public IUserRepository getUserRepository() {
        return userRepository;
    }

    public void setUserRepository(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public ConstraintService getConstraintService() {
        return constraintService;
    }

    public void setConstraintService(ConstraintService constraintService) {
        this.constraintService = constraintService;
    }

    public Calendar[] getSelectedOptions() {
        return selectedOptions;
    }

    public void setSelectedOptions(Calendar[] selectedOptions) {
        this.selectedOptions = selectedOptions;
    }

    public List<String> getSelectedCalendarsPriority() {
        return selectedCalendarsPriority;
    }

    public void setSelectedCalendarsPriority(List<String> selectedCalendarsPriority) {
        this.selectedCalendarsPriority = selectedCalendarsPriority;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public List<Calendar> getCalendarsOptions() {
        return calendarsOptions;
    }

    public void setCalendarsOptions(List<Calendar> calendarsOptions) {
        this.calendarsOptions = calendarsOptions;
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

    public List<Calendar> getCalendars() {
        return calendars;
    }

    public void setCalendars(List<Calendar> calendars) {
        this.calendars = calendars;
    }

    public List<Calendar> getSelectedCalendars() {
        return selectedCalendars;
    }

    public void setSelectedCalendars(List<Calendar> selectedCalendars) {
        this.selectedCalendars = selectedCalendars;
    }

    public String getMergedCalendarName() {
        return mergedCalendarName;
    }

    public void setMergedCalendarName(String mergedCalendarName) {
        this.mergedCalendarName = mergedCalendarName;
    }

    public ICalendarRepository getCalendarRepository() {
        return calendarRepository;
    }

    public void setCalendarRepository(ICalendarRepository calendarRepository) {
        this.calendarRepository = calendarRepository;
    }

    public SecurityContext getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(SecurityContext securityContext) {
        this.securityContext = securityContext;
    }
}
