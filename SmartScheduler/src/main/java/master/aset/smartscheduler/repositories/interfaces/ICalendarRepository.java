package master.aset.smartscheduler.repositories.interfaces;

import master.aset.smartscheduler.entities.calendar.Calendar;
import master.aset.smartscheduler.entities.calendar.CalendarEntry;

public interface ICalendarRepository extends IRepository<Calendar> {

    Calendar getCalendarOfUser(int userId, int calendarId);
    
    void addEntryToCalendar(Calendar calendar, CalendarEntry calendarEntry);

    Calendar getById(int id);
}
