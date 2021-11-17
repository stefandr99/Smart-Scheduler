package master.aset.smartscheduler.entities.calendar;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import master.aset.smartscheduler.entities.calendar.CalendarEntry;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-11-17T17:42:39")
@StaticMetamodel(Calendar.class)
public class Calendar_ { 

    public static volatile ListAttribute<Calendar, CalendarEntry> calendarEntries;
    public static volatile SingularAttribute<Calendar, String> name;
    public static volatile SingularAttribute<Calendar, Integer> id;

}