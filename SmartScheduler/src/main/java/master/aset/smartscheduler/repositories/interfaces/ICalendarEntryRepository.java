package master.aset.smartscheduler.repositories.interfaces;

import master.aset.smartscheduler.entities.calendar.CalendarEntry;
import master.aset.smartscheduler.entities.user.User;

public interface ICalendarEntryRepository extends IRepository<CalendarEntry> {
       
    CalendarEntry getByName(String name);
}
