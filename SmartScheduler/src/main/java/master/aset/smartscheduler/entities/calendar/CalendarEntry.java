package master.aset.smartscheduler.entities.calendar;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

@Entity(name = "CalendarEntry")
@Table(name = "calendar_entries", uniqueConstraints={@UniqueConstraint(columnNames ={"name", "startdate", "finishdate", "calendar_id"})})
@NamedQueries({
    @NamedQuery(name = "CalendarEntries.getByName", query = "select ce from CalendarEntry ce where ce.name = :name"),
    @NamedQuery(name = "CalendarEntries.getAll", query = "select ce from CalendarEntry ce"),
    @NamedQuery(name = "CalendarEntries.getByCalendar", query = "select ce from CalendarEntry ce where ce.calendar = :calendar "),
    @NamedQuery(name = "CalendarEntries.getSpecificEntry", query = "SELECT ce FROM CalendarEntry ce WHERE ce.calendar.id = :calendarId "
            + "AND ce.name = :name AND ce.startDate = :startDate AND ce.finishDate = :finishDate")
})
public class CalendarEntry implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="startdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;

    @Column(name="finishdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date finishDate;
    
    @Column(name="day")
    private Integer day;
    
    @Column(name="recurring")
    private Boolean recurring;

    @Column(name="startTime")
    private String startTime;
    
    @Column(name="endTime")
    private String endTime;
    
    @ManyToOne
    @JoinColumn(name="calendar_id")
    private Calendar calendar;

    public CalendarEntry() {
        this.recurring = false;
    }
    
    public CalendarEntry(String name, Date startDate, Date finishDate) {
        this.name = name;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.recurring = false;
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
    
    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Boolean isRecurring() {
        return recurring;
    }

    public void setRecurring(Boolean recurring) {
        this.recurring = recurring;
    }
    
        public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
