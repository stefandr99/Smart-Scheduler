package master.aset.smartscheduler.repositories.interfaces;

import master.aset.smartscheduler.entities.user.User;

public interface IUserRepository extends IRepository<User> {
       
    User getByEmail(String username);
}
