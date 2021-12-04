package master.aset.smartscheduler.entities.calendar;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

@Entity(name="CalendarEntry")
@Table(name="calendar_entries")
@NamedQueries({
        @NamedQuery(name = "CalendarEntries.getByName", query = "select ce from CalendarEntry ce where ce.name = :name"),
        @NamedQuery(name = "CalendarEntries.getAll", query = "select ce from CalendarEntry ce")
})
public class CalendarEntry implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Date startDate;

    private Date finishDate;

    @ManyToOne
    private Calendar calendar;
    
      public CalendarEntry(String name, Date startDate, Date finishDate) {
        this.name = name;
        this.startDate = startDate;
        this.finishDate = finishDate;
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

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }
    
    
    
    public CalendarEntry() {}
}
