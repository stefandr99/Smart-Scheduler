package master.aset.smartscheduler.repositories.interfaces;

import javax.persistence.EntityManager;
import java.util.List;

public interface IRepository<T> {
    
    boolean create(T entity);

    List<T> getAll(EntityManager em);

    T get(int id);

    void update(T entity);
    
    void remove(T entity);
}
