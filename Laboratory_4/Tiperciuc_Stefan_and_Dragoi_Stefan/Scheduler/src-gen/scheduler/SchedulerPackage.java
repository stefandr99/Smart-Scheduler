/**
 */
package scheduler;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see scheduler.SchedulerFactory
 * @model kind="package"
 * @generated
 */
public interface SchedulerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "scheduler";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/scheduler";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "scheduler";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SchedulerPackage eINSTANCE = scheduler.impl.SchedulerPackageImpl.init();

	/**
	 * The meta object id for the '{@link scheduler.impl.DatabaseConnectionImpl <em>Database Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scheduler.impl.DatabaseConnectionImpl
	 * @see scheduler.impl.SchedulerPackageImpl#getDatabaseConnection()
	 * @generated
	 */
	int DATABASE_CONNECTION = 0;

	/**
	 * The number of structural features of the '<em>Database Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CONNECTION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link scheduler.impl.DatabaseUserEntryImpl <em>Database User Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scheduler.impl.DatabaseUserEntryImpl
	 * @see scheduler.impl.SchedulerPackageImpl#getDatabaseUserEntry()
	 * @generated
	 */
	int DATABASE_USER_ENTRY = 1;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_USER_ENTRY__USERNAME = 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_USER_ENTRY__PASSWORD = 1;

	/**
	 * The number of structural features of the '<em>Database User Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_USER_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link scheduler.impl.DatabaseCalendarEntryImpl <em>Database Calendar Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scheduler.impl.DatabaseCalendarEntryImpl
	 * @see scheduler.impl.SchedulerPackageImpl#getDatabaseCalendarEntry()
	 * @generated
	 */
	int DATABASE_CALENDAR_ENTRY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CALENDAR_ENTRY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CALENDAR_ENTRY__START_DATE = 1;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CALENDAR_ENTRY__END_DATE = 2;

	/**
	 * The number of structural features of the '<em>Database Calendar Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CALENDAR_ENTRY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link scheduler.IUserRepository <em>IUser Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scheduler.IUserRepository
	 * @see scheduler.impl.SchedulerPackageImpl#getIUserRepository()
	 * @generated
	 */
	int IUSER_REPOSITORY = 3;

	/**
	 * The number of structural features of the '<em>IUser Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IUSER_REPOSITORY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link scheduler.impl.UserRepositoryImpl <em>User Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scheduler.impl.UserRepositoryImpl
	 * @see scheduler.impl.SchedulerPackageImpl#getUserRepository()
	 * @generated
	 */
	int USER_REPOSITORY = 4;

	/**
	 * The number of structural features of the '<em>User Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_REPOSITORY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link scheduler.Dao <em>Dao</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scheduler.Dao
	 * @see scheduler.impl.SchedulerPackageImpl#getDao()
	 * @generated
	 */
	int DAO = 5;

	/**
	 * The number of structural features of the '<em>Dao</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAO_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link scheduler.impl.UserDaoImpl <em>User Dao</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scheduler.impl.UserDaoImpl
	 * @see scheduler.impl.SchedulerPackageImpl#getUserDao()
	 * @generated
	 */
	int USER_DAO = 6;

	/**
	 * The number of structural features of the '<em>User Dao</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DAO_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link scheduler.impl.ObjectPoolImpl <em>Object Pool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scheduler.impl.ObjectPoolImpl
	 * @see scheduler.impl.SchedulerPackageImpl#getObjectPool()
	 * @generated
	 */
	int OBJECT_POOL = 7;

	/**
	 * The number of structural features of the '<em>Object Pool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_POOL_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link scheduler.impl.JDBCConnectionPoolImpl <em>JDBC Connection Pool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scheduler.impl.JDBCConnectionPoolImpl
	 * @see scheduler.impl.SchedulerPackageImpl#getJDBCConnectionPool()
	 * @generated
	 */
	int JDBC_CONNECTION_POOL = 8;

	/**
	 * The number of structural features of the '<em>JDBC Connection Pool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDBC_CONNECTION_POOL_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '<em>Calendar</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Calendar
	 * @see scheduler.impl.SchedulerPackageImpl#getCalendar()
	 * @generated
	 */
	int CALENDAR = 9;

	/**
	 * Returns the meta object for class '{@link scheduler.DatabaseConnection <em>Database Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Connection</em>'.
	 * @see scheduler.DatabaseConnection
	 * @generated
	 */
	EClass getDatabaseConnection();

	/**
	 * Returns the meta object for class '{@link scheduler.DatabaseUserEntry <em>Database User Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database User Entry</em>'.
	 * @see scheduler.DatabaseUserEntry
	 * @generated
	 */
	EClass getDatabaseUserEntry();

	/**
	 * Returns the meta object for the attribute '{@link scheduler.DatabaseUserEntry#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see scheduler.DatabaseUserEntry#getUsername()
	 * @see #getDatabaseUserEntry()
	 * @generated
	 */
	EAttribute getDatabaseUserEntry_Username();

	/**
	 * Returns the meta object for the attribute '{@link scheduler.DatabaseUserEntry#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see scheduler.DatabaseUserEntry#getPassword()
	 * @see #getDatabaseUserEntry()
	 * @generated
	 */
	EAttribute getDatabaseUserEntry_Password();

	/**
	 * Returns the meta object for class '{@link scheduler.DatabaseCalendarEntry <em>Database Calendar Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Calendar Entry</em>'.
	 * @see scheduler.DatabaseCalendarEntry
	 * @generated
	 */
	EClass getDatabaseCalendarEntry();

	/**
	 * Returns the meta object for the attribute '{@link scheduler.DatabaseCalendarEntry#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see scheduler.DatabaseCalendarEntry#getName()
	 * @see #getDatabaseCalendarEntry()
	 * @generated
	 */
	EAttribute getDatabaseCalendarEntry_Name();

	/**
	 * Returns the meta object for the attribute '{@link scheduler.DatabaseCalendarEntry#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see scheduler.DatabaseCalendarEntry#getStartDate()
	 * @see #getDatabaseCalendarEntry()
	 * @generated
	 */
	EAttribute getDatabaseCalendarEntry_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link scheduler.DatabaseCalendarEntry#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see scheduler.DatabaseCalendarEntry#getEndDate()
	 * @see #getDatabaseCalendarEntry()
	 * @generated
	 */
	EAttribute getDatabaseCalendarEntry_EndDate();

	/**
	 * Returns the meta object for class '{@link scheduler.IUserRepository <em>IUser Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IUser Repository</em>'.
	 * @see scheduler.IUserRepository
	 * @generated
	 */
	EClass getIUserRepository();

	/**
	 * Returns the meta object for class '{@link scheduler.UserRepository <em>User Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Repository</em>'.
	 * @see scheduler.UserRepository
	 * @generated
	 */
	EClass getUserRepository();

	/**
	 * Returns the meta object for class '{@link scheduler.Dao <em>Dao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dao</em>'.
	 * @see scheduler.Dao
	 * @generated
	 */
	EClass getDao();

	/**
	 * Returns the meta object for class '{@link scheduler.UserDao <em>User Dao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Dao</em>'.
	 * @see scheduler.UserDao
	 * @generated
	 */
	EClass getUserDao();

	/**
	 * Returns the meta object for class '{@link scheduler.ObjectPool <em>Object Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Pool</em>'.
	 * @see scheduler.ObjectPool
	 * @generated
	 */
	EClass getObjectPool();

	/**
	 * Returns the meta object for class '{@link scheduler.JDBCConnectionPool <em>JDBC Connection Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JDBC Connection Pool</em>'.
	 * @see scheduler.JDBCConnectionPool
	 * @generated
	 */
	EClass getJDBCConnectionPool();

	/**
	 * Returns the meta object for data type '{@link java.lang.Calendar <em>Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Calendar</em>'.
	 * @see java.lang.Calendar
	 * @model instanceClass="java.lang.Calendar"
	 * @generated
	 */
	EDataType getCalendar();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SchedulerFactory getSchedulerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link scheduler.impl.DatabaseConnectionImpl <em>Database Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scheduler.impl.DatabaseConnectionImpl
		 * @see scheduler.impl.SchedulerPackageImpl#getDatabaseConnection()
		 * @generated
		 */
		EClass DATABASE_CONNECTION = eINSTANCE.getDatabaseConnection();

		/**
		 * The meta object literal for the '{@link scheduler.impl.DatabaseUserEntryImpl <em>Database User Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scheduler.impl.DatabaseUserEntryImpl
		 * @see scheduler.impl.SchedulerPackageImpl#getDatabaseUserEntry()
		 * @generated
		 */
		EClass DATABASE_USER_ENTRY = eINSTANCE.getDatabaseUserEntry();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE_USER_ENTRY__USERNAME = eINSTANCE.getDatabaseUserEntry_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE_USER_ENTRY__PASSWORD = eINSTANCE.getDatabaseUserEntry_Password();

		/**
		 * The meta object literal for the '{@link scheduler.impl.DatabaseCalendarEntryImpl <em>Database Calendar Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scheduler.impl.DatabaseCalendarEntryImpl
		 * @see scheduler.impl.SchedulerPackageImpl#getDatabaseCalendarEntry()
		 * @generated
		 */
		EClass DATABASE_CALENDAR_ENTRY = eINSTANCE.getDatabaseCalendarEntry();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE_CALENDAR_ENTRY__NAME = eINSTANCE.getDatabaseCalendarEntry_Name();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE_CALENDAR_ENTRY__START_DATE = eINSTANCE.getDatabaseCalendarEntry_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE_CALENDAR_ENTRY__END_DATE = eINSTANCE.getDatabaseCalendarEntry_EndDate();

		/**
		 * The meta object literal for the '{@link scheduler.IUserRepository <em>IUser Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scheduler.IUserRepository
		 * @see scheduler.impl.SchedulerPackageImpl#getIUserRepository()
		 * @generated
		 */
		EClass IUSER_REPOSITORY = eINSTANCE.getIUserRepository();

		/**
		 * The meta object literal for the '{@link scheduler.impl.UserRepositoryImpl <em>User Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scheduler.impl.UserRepositoryImpl
		 * @see scheduler.impl.SchedulerPackageImpl#getUserRepository()
		 * @generated
		 */
		EClass USER_REPOSITORY = eINSTANCE.getUserRepository();

		/**
		 * The meta object literal for the '{@link scheduler.Dao <em>Dao</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scheduler.Dao
		 * @see scheduler.impl.SchedulerPackageImpl#getDao()
		 * @generated
		 */
		EClass DAO = eINSTANCE.getDao();

		/**
		 * The meta object literal for the '{@link scheduler.impl.UserDaoImpl <em>User Dao</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scheduler.impl.UserDaoImpl
		 * @see scheduler.impl.SchedulerPackageImpl#getUserDao()
		 * @generated
		 */
		EClass USER_DAO = eINSTANCE.getUserDao();

		/**
		 * The meta object literal for the '{@link scheduler.impl.ObjectPoolImpl <em>Object Pool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scheduler.impl.ObjectPoolImpl
		 * @see scheduler.impl.SchedulerPackageImpl#getObjectPool()
		 * @generated
		 */
		EClass OBJECT_POOL = eINSTANCE.getObjectPool();

		/**
		 * The meta object literal for the '{@link scheduler.impl.JDBCConnectionPoolImpl <em>JDBC Connection Pool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scheduler.impl.JDBCConnectionPoolImpl
		 * @see scheduler.impl.SchedulerPackageImpl#getJDBCConnectionPool()
		 * @generated
		 */
		EClass JDBC_CONNECTION_POOL = eINSTANCE.getJDBCConnectionPool();

		/**
		 * The meta object literal for the '<em>Calendar</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Calendar
		 * @see scheduler.impl.SchedulerPackageImpl#getCalendar()
		 * @generated
		 */
		EDataType CALENDAR = eINSTANCE.getCalendar();

	}

} //SchedulerPackage
