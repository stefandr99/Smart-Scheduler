package master.aset.smartscheduler.entities.calendar;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import master.aset.smartscheduler.entities.user.User;

@Entity(name="Calendar")
@Table(name = "calendars")
@NamedQueries({
    @NamedQuery(name = "Calendar.getByName", query = "select c from Calendar c where c.name = :name"),
    @NamedQuery(name = "Calendar.getAll", query = "select c from Calendar c"),
    @NamedQuery(name="Calendar.calendarOfUser", query = "SELECT c FROM Calendar c INNER JOIN c.users u WHERE c.id = :cal_id AND u.id = :user_id")
})
public class Calendar implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="name")
    private String name;
    
    @OneToMany(mappedBy="calendar", cascade = CascadeType.PERSIST)
    private List<CalendarEntry> calendarEntries = new ArrayList<>();
    
    @ManyToMany(mappedBy = "calendars")
    private List<User> users = new ArrayList<>();

    public void addCalendarEntry(CalendarEntry entry) {
        calendarEntries.add(entry);
        entry.setCalendar(this);
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
    
    public List<User> getUsers() {
        return this.users;
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

    @Override
    public String toString() {
        return name;
    }
}
