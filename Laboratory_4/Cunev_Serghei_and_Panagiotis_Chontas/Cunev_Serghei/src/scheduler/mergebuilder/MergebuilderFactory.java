/**
 */
package scheduler.mergebuilder;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see scheduler.mergebuilder.MergebuilderPackage
 * @generated
 */
public interface MergebuilderFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MergebuilderFactory eINSTANCE = scheduler.mergebuilder.impl.MergebuilderFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Director</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Director</em>'.
	 * @generated
	 */
	Director createDirector();

	/**
	 * Returns a new object of class '<em>Merge Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Merge Schedule</em>'.
	 * @generated
	 */
	MergeSchedule createMergeSchedule();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MergebuilderPackage getMergebuilderPackage();

} //MergebuilderFactory
