package master.aset.smartscheduler.entities.usercalendars;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import master.aset.smartscheduler.entities.calendar.Calendar;
import master.aset.smartscheduler.entities.user.User;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-11-17T17:42:39")
@StaticMetamodel(UserCalendar.class)
public class UserCalendar_ { 

    public static volatile SingularAttribute<UserCalendar, Calendar> calendar;
    public static volatile SingularAttribute<UserCalendar, Integer> id;
    public static volatile SingularAttribute<UserCalendar, User> user;

}