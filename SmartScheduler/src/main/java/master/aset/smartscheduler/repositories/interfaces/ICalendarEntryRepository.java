package master.aset.smartscheduler.repositories.interfaces;

import java.util.Date;
import java.util.List;

import master.aset.smartscheduler.entities.calendar.Calendar;
import master.aset.smartscheduler.entities.calendar.CalendarEntry;

public interface ICalendarEntryRepository extends IRepository<CalendarEntry> {

    CalendarEntry getEntryFromCalendar(int calendarId, String name, Date startDate, Date endDate);

    boolean create(CalendarEntry event);

    List<CalendarEntry> getByCalendar(Calendar calendar);

    List<CalendarEntry> getListByName(String name);
}
