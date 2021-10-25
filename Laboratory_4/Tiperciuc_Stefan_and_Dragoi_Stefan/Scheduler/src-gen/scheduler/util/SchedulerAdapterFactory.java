/**
 */
package scheduler.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import scheduler.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see scheduler.SchedulerPackage
 * @generated
 */
public class SchedulerAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SchedulerPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulerAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SchedulerPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchedulerSwitch modelSwitch = new SchedulerSwitch() {
		public Object caseDatabaseConnection(DatabaseConnection object) {
			return createDatabaseConnectionAdapter();
		}

		public Object caseDatabaseUserEntry(DatabaseUserEntry object) {
			return createDatabaseUserEntryAdapter();
		}

		public Object caseDatabaseCalendarEntry(DatabaseCalendarEntry object) {
			return createDatabaseCalendarEntryAdapter();
		}

		public Object caseIUserRepository(IUserRepository object) {
			return createIUserRepositoryAdapter();
		}

		public Object caseUserRepository(UserRepository object) {
			return createUserRepositoryAdapter();
		}

		public Object caseDao(Dao object) {
			return createDaoAdapter();
		}

		public Object caseUserDao(UserDao object) {
			return createUserDaoAdapter();
		}

		public Object caseObjectPool(ObjectPool object) {
			return createObjectPoolAdapter();
		}

		public Object caseJDBCConnectionPool(JDBCConnectionPool object) {
			return createJDBCConnectionPoolAdapter();
		}

		public Object defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter) modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link scheduler.DatabaseConnection <em>Database Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scheduler.DatabaseConnection
	 * @generated
	 */
	public Adapter createDatabaseConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scheduler.DatabaseUserEntry <em>Database User Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scheduler.DatabaseUserEntry
	 * @generated
	 */
	public Adapter createDatabaseUserEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scheduler.DatabaseCalendarEntry <em>Database Calendar Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scheduler.DatabaseCalendarEntry
	 * @generated
	 */
	public Adapter createDatabaseCalendarEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scheduler.IUserRepository <em>IUser Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scheduler.IUserRepository
	 * @generated
	 */
	public Adapter createIUserRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scheduler.UserRepository <em>User Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scheduler.UserRepository
	 * @generated
	 */
	public Adapter createUserRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scheduler.Dao <em>Dao</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scheduler.Dao
	 * @generated
	 */
	public Adapter createDaoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scheduler.UserDao <em>User Dao</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scheduler.UserDao
	 * @generated
	 */
	public Adapter createUserDaoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scheduler.ObjectPool <em>Object Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scheduler.ObjectPool
	 * @generated
	 */
	public Adapter createObjectPoolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scheduler.JDBCConnectionPool <em>JDBC Connection Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scheduler.JDBCConnectionPool
	 * @generated
	 */
	public Adapter createJDBCConnectionPoolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SchedulerAdapterFactory
