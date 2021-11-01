package master.aset.smartscheduler.repositories;

import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import master.aset.smartscheduler.entities.calendar.Calendar;
import master.aset.smartscheduler.repositories.interfaces.IRepository;

@ApplicationScoped
public class CalendarRepository implements IRepository<Calendar> {
    @PersistenceContext(unitName = "PU")
    EntityManager em;

    @Override
    public void create(Calendar entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Calendar> getAll(EntityManager em) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Calendar get(EntityManager em, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Calendar entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
