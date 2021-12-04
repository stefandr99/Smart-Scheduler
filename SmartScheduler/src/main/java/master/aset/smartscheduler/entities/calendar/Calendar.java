package master.aset.smartscheduler.entities.calendar;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import master.aset.smartscheduler.entities.user.User;

@Entity(name="Calendar")
@Table(name = "calendars")
public class Calendar implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    
    @OneToMany(mappedBy="calendar",cascade = CascadeType.PERSIST)
    private List<CalendarEntry> calendarEntries = new ArrayList<>();
    
    @ManyToMany(mappedBy = "calendars")
    private List<User> users = new ArrayList<>();

    public List<User> getUsers() {
        return this.users;
    }

    public void addUser(User user) {
        this.users.add(user);
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CalendarEntry> getCalendarEntries() {
        return calendarEntries;
    }

    public void setCalendarEntries(List<CalendarEntry> calendarEntries) {
        this.calendarEntries = calendarEntries;
    }
    
    public void addCalendarEntry(CalendarEntry entry) {
        calendarEntries.add(entry);
        entry.setCalendar(this);
    }

    @Override
    public String toString() {
        return name;
    }
}
