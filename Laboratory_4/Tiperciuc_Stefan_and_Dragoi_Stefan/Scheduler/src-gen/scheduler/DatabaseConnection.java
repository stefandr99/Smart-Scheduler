/**
 */
package scheduler;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see scheduler.SchedulerPackage#getDatabaseConnection()
 * @model
 * @generated
 */
public class DatabaseConnection {
	private static DatabaseConnection instance = null;
	public Connection connection;
	
	private void DatabaseConnection() {
		Class.forName(driver).newInstance();
		connection = DriverManager.getConnection("localhost", "user", "root")
	}

	public static DatabaseConnection getInstance() {
		if (connection == null)
			connection = new DatabaseConnection();
 
        return connection;
	}

} // DatabaseConnection
