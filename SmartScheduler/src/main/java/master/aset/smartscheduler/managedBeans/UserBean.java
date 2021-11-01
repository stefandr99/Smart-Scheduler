/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package master.aset.smartscheduler.managedBeans;

import javax.ejb.EJB;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import master.aset.smartscheduler.entities.user.User;
import master.aset.smartscheduler.repositories.interfaces.IUserRepository;

/**
 *
 * @author Andrei
 */
@RequestScoped
@Named("userBean")
public class UserBean {
    
    private IUserRepository userRepo;
    
    private String email;
    private String password;
    private Integer userRole;
    
    public void addUser() {
        User user = new User(email, password, userRole);
        userRepo.create(user);
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
