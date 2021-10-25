/**
 */
package scheduler;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database User Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scheduler.DatabaseUserEntry#getUsername <em>Username</em>}</li>
 *   <li>{@link scheduler.DatabaseUserEntry#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @see scheduler.SchedulerPackage#getDatabaseUserEntry()
 * @model
 * @generated
 */
public class DatabaseUserEntry {
	private String username;
	private String password;
	private List<DatabaseCalendarList> calendars;
	
	public DatabaseUserEntry(String _username, String _password) {
		username = _username;
		password = _password;
	}
	
	String getUsername();

	void setUsername(String value);

	String getPassword();

	void setPassword(String value);

} // DatabaseUserEntry
