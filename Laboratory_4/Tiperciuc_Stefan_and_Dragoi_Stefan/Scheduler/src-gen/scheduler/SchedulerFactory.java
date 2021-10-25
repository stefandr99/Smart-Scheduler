/**
 */
package scheduler;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see scheduler.SchedulerPackage
 * @generated
 */
public interface SchedulerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SchedulerFactory eINSTANCE = scheduler.impl.SchedulerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Database Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Database Connection</em>'.
	 * @generated
	 */
	DatabaseConnection createDatabaseConnection();

	/**
	 * Returns a new object of class '<em>Database User Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Database User Entry</em>'.
	 * @generated
	 */
	DatabaseUserEntry createDatabaseUserEntry();

	/**
	 * Returns a new object of class '<em>Database Calendar Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Database Calendar Entry</em>'.
	 * @generated
	 */
	DatabaseCalendarEntry createDatabaseCalendarEntry();

	/**
	 * Returns a new object of class '<em>User Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Repository</em>'.
	 * @generated
	 */
	UserRepository createUserRepository();

	/**
	 * Returns a new object of class '<em>User Dao</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Dao</em>'.
	 * @generated
	 */
	UserDao createUserDao();

	/**
	 * Returns a new object of class '<em>JDBC Connection Pool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JDBC Connection Pool</em>'.
	 * @generated
	 */
	JDBCConnectionPool createJDBCConnectionPool();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SchedulerPackage getSchedulerPackage();

} //SchedulerFactory
