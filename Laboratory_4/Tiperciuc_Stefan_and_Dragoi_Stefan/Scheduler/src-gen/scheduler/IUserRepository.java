/**
 */
package scheduler;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IUser Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see scheduler.SchedulerPackage#getIUserRepository()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IUserRepository {
	boolean registerUser(DatabaseUserEntry user);

	DatabaseUserEntry loginUser(String username, String password);

} // IUserRepository
