package master.aset.smartscheduler.repositories;

import master.aset.smartscheduler.entities.user.User;
import master.aset.smartscheduler.repositories.interfaces.IUserRepository;

import javax.persistence.EntityManager;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@ApplicationScoped
public class UserRepository implements IUserRepository {
    
    @PersistenceContext(unitName = "PU")
    EntityManager em;

    public UserRepository() {
    }
    
    @Transactional
    @Override
    public void create(User user) {
        em.persist(user);
        em.flush();
    }

    @Override
    public List<User> getAll(EntityManager em) {
        return null;
    }

    @Override
    public User get(EntityManager em, int id) {
        return null;
    }

    @Override
    public void update(User entity) {

    }

    @Override
    public boolean login(String username, String password) {
        return false;
    }
}
