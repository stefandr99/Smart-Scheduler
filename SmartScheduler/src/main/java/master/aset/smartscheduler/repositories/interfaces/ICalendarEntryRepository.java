package master.aset.smartscheduler.repositories.interfaces;

import java.util.Date;
import master.aset.smartscheduler.entities.calendar.CalendarEntry;
import master.aset.smartscheduler.entities.user.User;

public interface ICalendarEntryRepository extends IRepository<CalendarEntry> {
    
    CalendarEntry getEntryFromCalendar(int calendarId, String name, Date startDate, Date endDate);
}
