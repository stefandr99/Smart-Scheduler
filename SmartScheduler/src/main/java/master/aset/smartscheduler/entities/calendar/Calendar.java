package master.aset.smartscheduler.entities.calendar;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.persistence.*;

@Entity(name="Calendar")
@Table(name = "calendars")
@NamedQueries({
        @NamedQuery(name = "Calendar.getByName", query = "select c from Calendar c where c.name = :name"),
        @NamedQuery(name = "Calendar.getAll", query = "select c from Calendar c")
})
public class Calendar implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    
    @OneToMany(mappedBy="calendar",cascade = CascadeType.PERSIST)
    private List<CalendarEntry> calendarEntries = new ArrayList<>();

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
    
    
}
