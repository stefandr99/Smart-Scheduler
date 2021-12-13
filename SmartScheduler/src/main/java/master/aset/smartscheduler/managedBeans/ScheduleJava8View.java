package master.aset.smartscheduler.managedBeans;

import javax.inject.Named;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.security.enterprise.SecurityContext;
import master.aset.smartscheduler.entities.calendar.Calendar;
import master.aset.smartscheduler.entities.calendar.CalendarEntry;
import master.aset.smartscheduler.entities.user.User;
import master.aset.smartscheduler.repositories.interfaces.ICalendarEntryRepository;
import master.aset.smartscheduler.repositories.interfaces.ICalendarRepository;
import master.aset.smartscheduler.repositories.interfaces.IUserRepository;
import master.aset.smartscheduler.services.ExtenderService;
import org.primefaces.event.ScheduleEntryMoveEvent;
import org.primefaces.event.ScheduleEntryResizeEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.model.DefaultScheduleEvent;
import org.primefaces.model.ScheduleEvent;
import org.primefaces.model.ScheduleModel;

@Named(value = "scheduleJava8View")
@ApplicationScoped
public class ScheduleJava8View implements Serializable {

    @Inject
    private ExtenderService extenderService;
    
    @Inject
    ICalendarRepository calendarRepository;
    
    @Inject
    ICalendarEntryRepository calendarEntryRepo;
    
    @Inject
    IUserRepository userRepository;
    
    @Inject
    SecurityContext securityContext;
    
    @Inject
    private DropdownView dropdownView;
    
    private ScheduleModel eventModel;

    private ScheduleEvent<?> event = new DefaultScheduleEvent<>();
    
    private CalendarEntry selectedCalendarEntry;
    
    private User currentUser;

    private double aspectRatio = Double.MIN_VALUE;

    private String view = "timeGridWeek";
    private String height = "auto";

    @PostConstruct
    public void init() {
        eventModel = extenderService.getDefaultCalendarInfo();
        String username = securityContext.getCallerPrincipal().getName();
        this.currentUser = userRepository.getByEmail(username);
    }

    public ScheduleModel getEventModel() {
        return eventModel;
    }

    public LocalDate getInitialDate() {
        return LocalDate.now().plusDays(1);
    }

    public ScheduleEvent<?> getEvent() {
        return event;
    }

    public void setEvent(ScheduleEvent<?> event) {
        this.event = event;
    }

    public void addEvent() {
        if (event.isAllDay()) {
            if (event.getStartDate().toLocalDate().equals(event.getEndDate().toLocalDate())) {
                event.setEndDate(event.getEndDate().plusDays(1));
            }
        }

        if (event.getId() == null) {
            addNewEvent();
        }
        else {
            updateEvent();
        }

        event = new DefaultScheduleEvent<>();
    }

    public void addNewEvent() {
        eventModel.addEvent(event);
        CalendarEntry calendarEntry = new CalendarEntry(event.getTitle(),
                Date.from(event.getStartDate().atZone(ZoneId.systemDefault()).toInstant()),
                Date.from(event.getEndDate().atZone(ZoneId.systemDefault()).toInstant()));
        Calendar calendar = dropdownView.getSelectedCalendar();
        calendar.addCalendarEntry(calendarEntry);
        calendarRepository.update(calendar);
    }

    public void updateEvent() {
        eventModel.updateEvent(event);
        selectedCalendarEntry.setName(event.getTitle());
        selectedCalendarEntry.setStartDate(Date.from(event.getStartDate().atZone(ZoneId.systemDefault()).toInstant()));
        selectedCalendarEntry.setFinishDate(Date.from(event.getEndDate().atZone(ZoneId.systemDefault()).toInstant()));
        calendarEntryRepo.update(selectedCalendarEntry);
    }

    public void onEventSelect(SelectEvent<ScheduleEvent<?>> selectEvent) {
        event = selectEvent.getObject();
        if(event.getId() != null) {
            Date startDate = Date.from(event.getStartDate().atZone(ZoneId.systemDefault()).toInstant());
            Date endDate = Date.from(event.getEndDate().atZone(ZoneId.systemDefault()).toInstant());
            Calendar currentCalendar = dropdownView.getSelectedCalendar();
            selectedCalendarEntry = currentCalendar.getCalendarEntries()
                    .stream()
                    .filter( (entry) -> 
                            entry.getName().equals(event.getTitle()) 
                            && entry.getStartDate().equals(startDate) 
                            && entry.getFinishDate().equals(endDate) )
                    .findFirst()
                    .get();
        }
    }

    public void onViewChange(SelectEvent<String> selectEvent) {
        view = selectEvent.getObject();
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "View Changed", "View:" + view);
        addMessage(message);
    }

    public void onDateSelect(SelectEvent<LocalDateTime> selectEvent) {
        event = DefaultScheduleEvent.builder()
                .startDate(selectEvent.getObject())
                .endDate(selectEvent.getObject().plusHours(1))
                .build();
    }

    public void onEventMove(ScheduleEntryMoveEvent event) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Event moved",
                "Delta:" + event.getDeltaAsDuration());
        addMessage(message);
    }

    public void onEventResize(ScheduleEntryResizeEvent event) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Event resized",
                "Start-Delta:" + event.getDeltaStartAsDuration() + ", End-Delta: " + event.getDeltaEndAsDuration());

        addMessage(message);
    }

    public void onEventDelete() {
        String eventId = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("eventId");
        if (event != null) {
            ScheduleEvent<?> event = eventModel.getEvent(eventId);
            eventModel.deleteEvent(event);
        }
    }
    
    public void onCalendarChange() {
        this.eventModel.clear();
        this.eventModel = this.extenderService
                .updateCalendarInfo(dropdownView.getSelectedCalendar());
    }
    
    public Calendar getCalendar(String name) {
        if (name == null) {
            throw new IllegalArgumentException("no id provided");
        }
        for(Calendar calendar: dropdownView.getCalendars()) {
            if(name.equals(calendar.getName())) {
                return calendar;
            }
        }
        return null;
    }

    private void addMessage(FacesMessage message) {
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

    public double getAspectRatio() {
        return aspectRatio == 0 ? Double.MIN_VALUE : aspectRatio;
    }

    public void setAspectRatio(double aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }
    

    public CalendarEntry getSelectedCalendarEntry() {
        return selectedCalendarEntry;
    }

    public void setSelectedCalendarEntry(CalendarEntry selectedCalendarEntry) {
        this.selectedCalendarEntry = selectedCalendarEntry;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }
}
