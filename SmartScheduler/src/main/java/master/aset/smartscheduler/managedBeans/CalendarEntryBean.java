/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package master.aset.smartscheduler.managedBeans;

import java.io.Serializable;
import java.sql.Date;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import master.aset.smartscheduler.entities.calendar.CalendarEntry;
import master.aset.smartscheduler.repositories.interfaces.ICalendarEntryRepository;
import master.aset.smartscheduler.repositories.interfaces.IUserRepository;

/**
 *
 * @author Stefan
 */
@Named(value = "calendarEntryBean")
@SessionScoped
public class CalendarEntryBean implements Serializable{

    @Inject
    ICalendarEntryRepository calendarEntryRepository;
    
    private String name;

    private Date startDate;

    private Date finishDate;
    
   public String addEvent() {
      // CalendarEntry event = new CalendarEntry(name,startDate,finishDate);
       //calendarEntryRepository.create(event);
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
