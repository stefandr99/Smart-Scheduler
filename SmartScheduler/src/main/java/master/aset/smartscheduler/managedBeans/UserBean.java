package master.aset.smartscheduler.managedBeans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
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
    
    private String email;
    private String password;
    private Integer userRole;
    
//    public void addUser() {
//        userService.add(email, password, userRole);
//    }
//        
    public void addUser() {
        System.out.println(".....Method called.......");
        User user = new User(email, password, userRole);
        userRepository.create(user);
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
