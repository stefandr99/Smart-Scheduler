/**
 */
package scheduler;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JDBC Connection Pool</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see scheduler.SchedulerPackage#getJDBCConnectionPool()
 * @model
 * @generated
 */
public class JDBCConnectionPool implements ObjectPool<Connection> {
	JDBCConnectionPool(String driver, String dsn, String usr, String pwd)
    {
        super();
        try {
            Class.forName(driver).newInstance();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        this.dsn = dsn;
        this.usr = usr;
        this.pwd = pwd;
    }
	
	void create() {
		try {
            return (DriverManager.getConnection(dsn, usr, pwd));
        }
        catch (SQLException e) {
            e.printStackTrace();
            return (null);
        }
	}
	
	boolean validate(Connection conn) {
		{
	        try {
	            return (!((Connection)o).isClosed());
	        }
	        catch (SQLException e) {
	            e.printStackTrace();
	            return (false);
	        }
	    }
	}

	void dead(Connection conn) {
		try {
            ((Connection)o).close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
	}

} // JDBCConnectionPool
