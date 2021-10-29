package master.aset.smartscheduler.services;

import master.aset.smartscheduler.repositories.UserRepository;
import master.aset.smartscheduler.repositories.interfaces.IUserRepository;
import master.aset.smartscheduler.services.interfaces.IUserService;

public class UserService implements IUserService {
    private IUserRepository userRepository;

    public UserService() {
        this.userRepository = new UserRepository();
    }


}
