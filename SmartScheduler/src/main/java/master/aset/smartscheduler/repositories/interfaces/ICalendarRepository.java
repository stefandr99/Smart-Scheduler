package master.aset.smartscheduler.repositories.interfaces;

import java.util.List;
import master.aset.smartscheduler.entities.calendar.Calendar;
import master.aset.smartscheduler.entities.calendar.CalendarEntry;

public interface ICalendarRepository extends IRepository<Calendar> {

    Calendar getCalendarOfUser(int userId, int calendarId);    
    
    List<Calendar> getPublicCalendars();
    
    void deletePublicCalendars();
    
    void addEntryToCalendar(Calendar calendar, CalendarEntry calendarEntry);
}
