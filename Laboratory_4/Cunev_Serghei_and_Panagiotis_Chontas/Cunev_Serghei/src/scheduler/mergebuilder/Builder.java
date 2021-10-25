/**
 */
package scheduler.mergebuilder;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Builder</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see scheduler.mergebuilder.MergebuilderPackage#getBuilder()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Builder extends EObject {

	void reset();

	void importCalendar(Calendar calendar);


	void parseCalenar(Calendar calendar);


	void addActivity(Caledar calenar);

} // Builder
