/**
 */
package scheduler.mergetemplate;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see scheduler.mergetemplate.MergetemplatePackage
 * @generated
 */
public interface MergetemplateFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MergetemplateFactory eINSTANCE = scheduler.mergetemplate.impl.MergetemplateFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Add To Current Calendar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add To Current Calendar</em>'.
	 * @generated
	 */
	AddToCurrentCalendar createAddToCurrentCalendar();

	/**
	 * Returns a new object of class '<em>Merge Calendars</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Merge Calendars</em>'.
	 * @generated
	 */
	MergeCalendars createMergeCalendars();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MergetemplatePackage getMergetemplatePackage();

} //MergetemplateFactory
