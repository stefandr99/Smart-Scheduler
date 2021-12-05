package smartschedulertests;

import master.aset.smartscheduler.entities.user.User;
import master.aset.smartscheduler.managedBeans.UserBean;
import master.aset.smartscheduler.managedBeans.UserLogin;
import master.aset.smartscheduler.repositories.UserRepository;
import org.glassfish.soteria.SecurityContextImpl;
import org.glassfish.soteria.identitystores.hash.Pbkdf2PasswordHashImpl;
import org.junit.Rule;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.security.enterprise.AuthenticationStatus;
import javax.security.enterprise.SecurityContext;
import javax.security.enterprise.identitystore.Pbkdf2PasswordHash;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class UserUnitTests {
    UserRepository userRepository;
    UserBean userBean;
    UserLogin userLogin;
    Pbkdf2PasswordHash passwordHasher;

    public UserUnitTests() {
        this.userRepository = mock(UserRepository.class);
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        passwordHasher = new Pbkdf2PasswordHashImpl();
        this.userBean = new UserBean();
        this.userLogin = new UserLogin();
        this.userBean.setUserRepository(this.userRepository);
        this.userBean.setPasswordHasher(this.passwordHasher);

        this.userBean.setFacesContext(mock(FacesContext.class));
        this.userLogin.setFacesContext(ContextMocker.mockFacesContext());
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void given_addUser_when_correctCredentialsAreSent_then_userIsRegisteredSuccessfully() {
        // arrange
        userBean.setEmail("jack.mallen@gmail.com");
        userBean.setPassword("StringPassword2021+");
        userBean.setPasswordConfirm("StringPassword2021+");
        User user = new User(userBean.getEmail(),
                passwordHasher.generate(userBean.getPassword().toCharArray()), userBean.getUserRole());
        when(userRepository.create(user))
                .thenReturn(true);
        when(userRepository.getByEmail(userBean.getEmail()))
                .thenReturn(null);

        // act
        String result = userBean.addUser();

        // assert
        assertEquals(result, "authenticate");
        verify(userRepository, times(1)).create(user);
        assertTrue(userRepository.create(user));
        assertEquals(userBean.getUserRole(), "student");
    }

    @Test
    public void given_addUser_when_passwordsDoNotMatch_then_registrationIsUnsuccessfullyAndNullIsReturned() {
        // arrange
        userBean.setEmail("jack.mallen@gmail.com");
        userBean.setPassword("StringPassword2021+");
        userBean.setPasswordConfirm("StringPassw");
        User user = new User(userBean.getEmail(),
                passwordHasher.generate(userBean.getPassword().toCharArray()), userBean.getUserRole());

        // act
        String result = userBean.addUser();

        // assert
        assertNull(result);
        verify(userRepository, times(0)).create(user);
    }

    @Test
    public void given_addUser_when_userWithThisEmailAlreadyExists_then_registrationIsUnsuccessfullyAndNullIsReturned() {
        // arrange
        userBean.setEmail("jack.mallen@gmail.com");
        userBean.setPassword("StringPassword2021+");
        userBean.setPasswordConfirm("StringPassw");
        User user = new User(userBean.getEmail(),
                passwordHasher.generate(userBean.getPassword().toCharArray()), userBean.getUserRole());
        when(userRepository.getByEmail(userBean.getEmail()))
                .thenReturn(null);

        // act
        String result = userBean.addUser();

        // assert
        assertNull(result);
        verify(userRepository, times(0)).create(user);
    }

    @Test
    public void given_logout_when_logoutIsSuccessfully_then_newActionIsReturned() throws ServletException {
        // arrange
        when(userLogin.logout())
                .thenReturn("/login.xhtml?faces-redirect=true");

        // act
        String action = userLogin.logout();

        // assert
        assertEquals(action, "/login.xhtml?faces-redirect=true");
    }

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();
    @Test
    public void given_logout_when_logoutThrowsServletException_then_logoutIsUnsuccessfully() throws ServletException {
        // arrange
        when(userLogin.logout())
                .thenThrow(new ServletException("Logout failed!"));

        // assert
        expectedEx.expect(ServletException.class);
        expectedEx.expectMessage("Logout failed!");
        Exception ex = assertThrows(ServletException.class, () -> userLogin.logout());
        assertTrue(ex.getMessage().contains("Logout failed"));
    }

    @Test
    public void given_execute_when_anExceptionOccurs_then_IOExceptionIsThrown() throws IOException {
        // arrange
        this.userLogin = mock(UserLogin.class);
        doThrow(new IOException("Exception")).when(userLogin).execute();

        // assert
        expectedEx.expect(IOException.class);
        expectedEx.expectMessage("Exception");
        Exception ex = assertThrows(Exception.class, () -> userLogin.execute());
        assertTrue(ex.getMessage().contains("Exception"));
    }


}

abstract class ContextMocker extends FacesContext {
    private ContextMocker() {
    }

    private static final Release RELEASE = new Release();

    private static class Release implements Answer<Void> {
        @Override
        public Void answer(InvocationOnMock invocation) throws Throwable {
            setCurrentInstance(null);
            return null;
        }
    }

    public static FacesContext mockFacesContext() {
        FacesContext context = Mockito.mock(FacesContext.class);
        setCurrentInstance(context);
        Mockito.doAnswer(RELEASE)
                .when(context)
                .release();
        return context;
    }
}
