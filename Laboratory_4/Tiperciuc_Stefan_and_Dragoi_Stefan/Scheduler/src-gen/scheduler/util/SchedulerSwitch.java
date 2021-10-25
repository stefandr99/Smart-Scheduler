/**
 */
package scheduler.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import scheduler.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see scheduler.SchedulerPackage
 * @generated
 */
public class SchedulerSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SchedulerPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulerSwitch() {
		if (modelPackage == null) {
			modelPackage = SchedulerPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		} else {
			List eSuperTypes = theEClass.getESuperTypes();
			return eSuperTypes.isEmpty() ? defaultCase(theEObject) : doSwitch((EClass) eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case SchedulerPackage.DATABASE_CONNECTION: {
			DatabaseConnection databaseConnection = (DatabaseConnection) theEObject;
			Object result = caseDatabaseConnection(databaseConnection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SchedulerPackage.DATABASE_USER_ENTRY: {
			DatabaseUserEntry databaseUserEntry = (DatabaseUserEntry) theEObject;
			Object result = caseDatabaseUserEntry(databaseUserEntry);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SchedulerPackage.DATABASE_CALENDAR_ENTRY: {
			DatabaseCalendarEntry databaseCalendarEntry = (DatabaseCalendarEntry) theEObject;
			Object result = caseDatabaseCalendarEntry(databaseCalendarEntry);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SchedulerPackage.IUSER_REPOSITORY: {
			IUserRepository iUserRepository = (IUserRepository) theEObject;
			Object result = caseIUserRepository(iUserRepository);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SchedulerPackage.USER_REPOSITORY: {
			UserRepository userRepository = (UserRepository) theEObject;
			Object result = caseUserRepository(userRepository);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SchedulerPackage.DAO: {
			Dao dao = (Dao) theEObject;
			Object result = caseDao(dao);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SchedulerPackage.USER_DAO: {
			UserDao userDao = (UserDao) theEObject;
			Object result = caseUserDao(userDao);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SchedulerPackage.OBJECT_POOL: {
			ObjectPool objectPool = (ObjectPool) theEObject;
			Object result = caseObjectPool(objectPool);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SchedulerPackage.JDBC_CONNECTION_POOL: {
			JDBCConnectionPool jdbcConnectionPool = (JDBCConnectionPool) theEObject;
			Object result = caseJDBCConnectionPool(jdbcConnectionPool);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDatabaseConnection(DatabaseConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database User Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database User Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDatabaseUserEntry(DatabaseUserEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database Calendar Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database Calendar Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDatabaseCalendarEntry(DatabaseCalendarEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IUser Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IUser Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIUserRepository(IUserRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUserRepository(UserRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dao</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dao</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDao(Dao object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Dao</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Dao</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUserDao(UserDao object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Pool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Pool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseObjectPool(ObjectPool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JDBC Connection Pool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JDBC Connection Pool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseJDBCConnectionPool(JDBCConnectionPool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //SchedulerSwitch
