package master.aset.smartscheduler.managedBeans;

import java.io.Serializable;
import java.sql.Date;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import master.aset.smartscheduler.repositories.interfaces.ICalendarEntryRepository;

@Named(value = "calendarEntryBean")
@SessionScoped
public class CalendarEntryBean implements Serializable{

    @Inject
    ICalendarEntryRepository calendarEntryRepository;
    
    private String name;

    private Date startDate;

    private Date finishDate;
    
   public String addEvent() {
        return "addEvent";
    }
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }
}
