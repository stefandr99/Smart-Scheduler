package master.aset.smartscheduler.repositories.interfaces;

import java.util.Date;

import master.aset.smartscheduler.entities.calendar.Calendar;
import master.aset.smartscheduler.entities.calendar.CalendarEntry;

public interface ICalendarEntryRepository extends IRepository<CalendarEntry> {

    CalendarEntry getEntryFromCalendar(int calendarId, String name, Date startDate, Date endDate);

    public boolean create(CalendarEntry event);

    public CalendarEntry getByCalendar(Calendar calendar);
}
