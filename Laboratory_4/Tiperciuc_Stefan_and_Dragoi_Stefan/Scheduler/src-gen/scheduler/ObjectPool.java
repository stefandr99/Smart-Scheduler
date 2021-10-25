/**
 */
package scheduler;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Pool</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see scheduler.SchedulerPackage#getObjectPool()
 * @model abstract="true"
 * @generated
 */
public interface ObjectPool<T> {
	T create();

	boolean validate(T conn);

	void dead(T conn);

} // ObjectPool
