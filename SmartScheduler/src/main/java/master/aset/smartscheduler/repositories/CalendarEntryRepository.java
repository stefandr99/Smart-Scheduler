package master.aset.smartscheduler.repositories;

import java.util.Date;
import javax.persistence.EntityManager;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import master.aset.smartscheduler.entities.calendar.Calendar;
import master.aset.smartscheduler.entities.calendar.CalendarEntry;
import master.aset.smartscheduler.repositories.interfaces.ICalendarEntryRepository;

@ApplicationScoped
public class CalendarEntryRepository implements ICalendarEntryRepository {

    @PersistenceContext(unitName = "PU")
    EntityManager em;

    @Transactional
    @Override
    public boolean create(CalendarEntry event) {
        em.persist(event);
        em.flush();

        return true;
    }

    @Override
    @Transactional
    public CalendarEntry getEntryFromCalendar(int calendarId, String name, Date startDate, Date endDate) {
        return em.createNamedQuery("CalendarEntries.getSpecificEntry", CalendarEntry.class)
                .setParameter("calendarId", calendarId)
                .setParameter("name", name)
                .setParameter("startDate", startDate)
                .setParameter("finishDate", endDate)
                .getSingleResult();
    }

    @Transactional
    public CalendarEntry getByName(String name) {
        return em.createNamedQuery("CalendarEntries.getByName", CalendarEntry.class)
                .setParameter("name", name)
                .getSingleResult();
    }

    @Transactional
    public List<CalendarEntry> getListByName(String name) {
        return em.createNamedQuery("CalendarEntries.getByName", CalendarEntry.class)
                .setParameter("name", name)
                .getResultList();
    }

    @Transactional
    public List<CalendarEntry> getByCalendar(Calendar calendar) {
        return em.createNamedQuery("CalendarEntries.getByCalendar", CalendarEntry.class)
                .setParameter("calendar", calendar)
                .getResultList();
    }

    @Override
    public List<CalendarEntry> getAll(EntityManager em) {
        return em.createNamedQuery("CalendarEntries.getAll", CalendarEntry.class)
                .getResultList();
    }

    @Override
    public CalendarEntry get(int id) {
        return null;
    }

    @Override
    @Transactional
    public void update(CalendarEntry entity) {
        em.merge(entity);
    }

    @Transactional
    @Override
    public void remove(CalendarEntry entity) {
        if (!em.contains(entity)) {
            entity = em.merge(entity);
        }
        em.remove(entity);
    }
}
