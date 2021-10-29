package master.aset.smartscheduler.managedbeans.usercalendars;

import master.aset.smartscheduler.managedbeans.calendar.Calendar;
import master.aset.smartscheduler.managedbeans.user.User;
import javax.faces.bean.ManagedBean;
import javax.persistence.*;

@Entity
@Table(name = "user_calendar")
@ManagedBean(name = "userCalendar")
public class UserCalendar {
    @Id
    private Integer id;

    @JoinColumn(name = "calendar_id")
    @ManyToOne
    private Calendar calendar;

    @JoinColumn(name = "user_id")
    @ManyToOne
    private User user;
}
