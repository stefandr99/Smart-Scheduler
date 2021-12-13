package master.aset.smartscheduler.managedBeans;

import java.io.IOException;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.security.enterprise.AuthenticationStatus;
import javax.security.enterprise.SecurityContext;
import javax.security.enterprise.authentication.mechanism.http.AuthenticationParameters;
import javax.security.enterprise.credential.UsernamePasswordCredential;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.NotNull;

@RequestScoped
@Named("userLogin")
public class UserLogin {

    @NotNull
    private String email;
    
    @NotNull
    private String password;
    
    @Inject
    FacesContext facesContext;
    
    @Inject
    SecurityContext securityContext;
    
    public void execute() throws IOException {
        switch(processAuthentication()){
            case SEND_CONTINUE:
                facesContext.responseComplete();
                break;
            case SEND_FAILURE:
                facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Invalid Credentials", null));
                break;
            case SUCCESS:
                getExternalContext().redirect(getExternalContext().getRequestContextPath() + "/faces/app/calendarParse.xhtml");
                break;
        }
    }
    
    public AuthenticationStatus processAuthentication() {
        ExternalContext ec = getExternalContext();
        return securityContext.authenticate((HttpServletRequest)ec.getRequest(), 
                                            (HttpServletResponse)ec.getResponse(), 
                                            AuthenticationParameters.withParams()
                                                        .credential(new UsernamePasswordCredential(email, password)));
    }
    
    private ExternalContext getExternalContext() {
        return facesContext.getExternalContext();
    }

    public String logout() throws ServletException {
        ExternalContext ec = facesContext.getExternalContext();
        ((HttpServletRequest)ec.getRequest()).logout();
        return "/login.xhtml?faces-redirect=true";
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

    public FacesContext getFacesContext() {
        return facesContext;
    }

    public void setFacesContext(FacesContext facesContext) {
        this.facesContext = facesContext;
    }

    public SecurityContext getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(SecurityContext securityContext) {
        this.securityContext = securityContext;
    }
}
