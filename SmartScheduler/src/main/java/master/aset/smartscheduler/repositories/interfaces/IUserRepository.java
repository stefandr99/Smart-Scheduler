package master.aset.smartscheduler.repositories.interfaces;

import master.aset.smartscheduler.managedbeans.user.User;

public interface IUserRepository extends IRepository<User> {
    boolean login(String username, String password);
}
