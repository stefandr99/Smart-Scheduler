package master.aset.smartscheduler.repositories;

import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import master.aset.smartscheduler.entities.calendar.Calendar;
import master.aset.smartscheduler.entities.calendar.CalendarEntry;
import master.aset.smartscheduler.repositories.interfaces.ICalendarRepository;

@ApplicationScoped
public class CalendarRepository implements ICalendarRepository {

    @PersistenceContext(unitName = "PU")
    EntityManager em;

    @Transactional
    @Override
    public boolean create(Calendar entity) {
        em.persist(entity);
        em.flush();

        return true;
    }

    @Override
    public Calendar getCalendarOfUser(int userId, int calendarId) {
        return em.createNamedQuery("Calendar.calendarOfUser", Calendar.class)
                .setParameter("cal_id", calendarId)
                .setParameter("user_id", userId)
                .getResultList()
                .get(0);
    }
    
    @Transactional
    @Override
    public void addEntryToCalendar(Calendar calendar, CalendarEntry calendarEntry)
    {
        calendarEntry.setCalendar(calendar);
        em.persist(calendarEntry);
    }

    @Transactional
    @Override
    public Calendar get(int id) {
        return em.find(Calendar.class, id);
    }

    @Transactional
    @Override
    public List<Calendar> getAll(EntityManager em) {
        return em.createNamedQuery("Calendar.getAll", Calendar.class)
                .getResultList();
    }

    @Transactional
    public Calendar getByName(String name) {
        return em.createNamedQuery("Calendar.getByName", Calendar.class)
                .setParameter("name", name)
                .getSingleResult(); //To change body of generated methods, choose Tools | Templates.
    }

    @Transactional
    @Override
    public void update(Calendar entity) {
        try {
            em.merge(entity);
            em.flush();
        } catch (Exception ex) {
            System.out.println("possible error when updating the calendar occurred: " + ex.getMessage());
        }
    }

    @Override
    public List<Calendar> getPublicCalendars() {
        return em.createNamedQuery("Calendar.getPublicCalendars", Calendar.class).getResultList();
    }

    @Transactional
    @Override
    public void deletePublicCalendars() {
        List<Calendar> publicCalendars = this.getPublicCalendars();
        publicCalendars.forEach(c -> {
            em.remove(c);
        });
    }
}
