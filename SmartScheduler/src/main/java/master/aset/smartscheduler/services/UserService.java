package master.aset.smartscheduler.services;

import javax.inject.Inject;
import master.aset.smartscheduler.entities.user.User;
import master.aset.smartscheduler.repositories.UserRepository;
import master.aset.smartscheduler.repositories.interfaces.IUserRepository;
import master.aset.smartscheduler.services.interfaces.IUserService;
import org.springframework.security.crypto.bcrypt.BCrypt;

public class UserService implements IUserService {

    @Inject
    private IUserRepository userRepository;

    @Override
    public void add(String email, String password, String role) {
        System.out.println(".....Method called.......");
        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());
        User user = new User(email, hashedPassword, role);
        userRepository.create(user);
    }

    @Override
    public User login(String email, String password) {
        User userByUsername = userRepository.getByEmail(email);

        if (userByUsername != null) {
            if (BCrypt.checkpw(password, userByUsername.getPassword())) {
                return userByUsername;
            }
        }

        return null;
    }
}
