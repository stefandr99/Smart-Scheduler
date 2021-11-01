package master.aset.smartscheduler.entities.calendar;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "calendar_entries")
public class CalendarEntries implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private Date startDate;

    private Date finishDate;

    @JoinColumn(name = "calendar_id")
    @ManyToOne
    private Calendar calendar;

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
}
