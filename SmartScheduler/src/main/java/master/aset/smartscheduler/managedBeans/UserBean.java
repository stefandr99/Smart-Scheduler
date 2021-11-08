package master.aset.smartscheduler.managedBeans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.security.enterprise.identitystore.Pbkdf2PasswordHash;
import master.aset.smartscheduler.entities.user.User;
import master.aset.smartscheduler.repositories.interfaces.IUserRepository;
import master.aset.smartscheduler.services.interfaces.IUserService;

/**
 *
 * @author Andrei
 */
@RequestScoped
@Named("userBean")
public class UserBean {
    
    private IUserService userService;
    
    @Inject
    IUserRepository userRepository;
    
    @Inject
    Pbkdf2PasswordHash passwordHasher;
    
    private String email;
    private String password;
    private Integer userRole = 0;
    
//    public void addUser() {
//        userService.add(email, password, userRole);
//    }
//        
    public String addUser() {
        User user = new User(email, passwordHasher.generate(password.toCharArray()), userRole);
        userRepository.create(user);
        return "authenticate";
    }
    

    public void loginUser() {
        User user = userService.login(email, password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getUserRole() {
        return userRole;
    }

    public void setUserRole(Integer userRole) {
        this.userRole = userRole;
    }
}
