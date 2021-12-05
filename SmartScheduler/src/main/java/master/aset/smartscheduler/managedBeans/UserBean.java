package master.aset.smartscheduler.managedBeans;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
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

    private FacesContext facesContext = FacesContext.getCurrentInstance();

    @Inject
    IUserRepository userRepository;

    @Inject
    Pbkdf2PasswordHash passwordHasher;

    private String email;
    private String password;
    private String passwordConfirm;
    private String userRole = "student";

    public String addUser() {
        if(checkUserExists()) {
            facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "User already exists"));
            return null;
        }
        if (!checkPasswordMatch()) {
            facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Password doesn't match"));
            return null;
        } else {
            User user = new User(email, passwordHasher.generate(password.toCharArray()), userRole);
            userRepository.create(user);
            return "authenticate";
        }
    }

    public boolean checkPasswordMatch() {
        return password.equals(passwordConfirm);
    }
    
    public boolean checkUserExists() {
        return userRepository.getByEmail(email) != null;
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

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    public IUserRepository getUserRepository() {
        return userRepository;
    }

    public void setUserRepository(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Pbkdf2PasswordHash getPasswordHasher() {
        return passwordHasher;
    }

    public void setPasswordHasher(Pbkdf2PasswordHash passwordHasher) {
        this.passwordHasher = passwordHasher;
    }

    public FacesContext getFacesContext() {
        return facesContext;
    }

    public void setFacesContext(FacesContext facesContext) {
        this.facesContext = facesContext;
    }
}
