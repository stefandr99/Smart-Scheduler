package master.aset.smartscheduler.services.interfaces;

import master.aset.smartscheduler.entities.user.User;

public interface IUserService {
    void add(String email, String password, String role);

    User login(String email, String password);
}
