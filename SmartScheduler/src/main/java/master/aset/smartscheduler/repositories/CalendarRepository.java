package master.aset.smartscheduler.repositories;

import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import master.aset.smartscheduler.entities.calendar.Calendar;
import master.aset.smartscheduler.entities.calendar.CalendarEntry;
import master.aset.smartscheduler.entities.user.User;
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
    
    @Override
    public List<Calendar> getAllCalendarsOfUser(int userId) {
        return em.createNamedQuery("Calendar.allCalendarsOfUser", Calendar.class)
                    .setParameter("user_id", userId)
                    .getResultList();
    }
    
    @Transactional
    @Override
    public void addEntryToCalendar(Calendar calendar, CalendarEntry calendarEntry)
    {
        calendar.getCalendarEntries().add(calendarEntry);
        em.merge(calendar);
    }

    @Override
    public Calendar get(EntityManager em, int id) {
        return null;
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
    public Calendar getById(int id) {
        Long longId = (long) id;

        return em.createNamedQuery("Calendar.getById", Calendar.class)
                .setParameter("id", longId)
                .getSingleResult();
    }
    
    @Transactional
    @Override
    public void addCalendarToUser(User user, Calendar calendar){
        user.getCalendars().add(calendar);
        em.merge(user);
    }

    @Transactional
    @Override
    public void update(Calendar entity) {
        em.merge(entity);
    }
}
