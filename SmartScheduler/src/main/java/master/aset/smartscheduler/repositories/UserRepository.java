package master.aset.smartscheduler.repositories;

import master.aset.smartscheduler.entities.user.User;
import master.aset.smartscheduler.repositories.interfaces.IUserRepository;
import javax.persistence.EntityManager;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
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
    public boolean create(User user) {
        em.persist(user);
        em.flush();

        return true;
    }

    @Transactional
    @Override
    public User getByEmail(String email) {
        try{
            User userToReturn = em.createNamedQuery("User.getByEmail", User.class)
                .setParameter("email", email)
                .getSingleResult();
            return userToReturn;
        } catch(Exception ex) {
            return null;
        }
    }

    @Override
    public List<User> getAll(EntityManager em) {
        return em.createNamedQuery("User.getAll", User.class)
                .getResultList();
    }

    @Override
    public User get(EntityManager em, int id) {
        return null;
    }

    @Transactional
    @Override
    public void update(User entity) {
        em.merge(entity);
        em.flush();
    }
}
