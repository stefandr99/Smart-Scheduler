package master.aset.smartscheduler.entities.calendar;

import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import master.aset.smartscheduler.entities.calendar.Calendar;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-11-08T14:08:20")
@StaticMetamodel(CalendarEntries.class)
public class CalendarEntries_ { 

    public static volatile SingularAttribute<CalendarEntries, Calendar> calendar;
    public static volatile SingularAttribute<CalendarEntries, String> name;
    public static volatile SingularAttribute<CalendarEntries, Date> finishDate;
    public static volatile SingularAttribute<CalendarEntries, Integer> id;
    public static volatile SingularAttribute<CalendarEntries, Date> startDate;

}