/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package master.aset.smartscheduler.repositories.interfaces;

import master.aset.smartscheduler.entities.calendar.Calendar;
import master.aset.smartscheduler.entities.calendar.CalendarEntry;

/**
 *
 * @author sergh
 */
public interface ICalendarRepository extends IRepository<Calendar> {
    
    Calendar getCalendarOfUser(int userId, int calendarId);
    
    void addEntryToCalendar(Calendar calendar, CalendarEntry calendarEntry);
}
