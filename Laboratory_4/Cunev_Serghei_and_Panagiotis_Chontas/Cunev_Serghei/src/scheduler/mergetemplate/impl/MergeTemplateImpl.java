/**
 */
package scheduler.mergetemplate.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import scheduler.mergetemplate.MergeTemplate;
import scheduler.mergetemplate.MergetemplatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Merge Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link scheduler.mergetemplate.impl.MergeTemplateImpl#getResultCalendar <em>Result Calendar</em>}</li>
 *   <li>{@link scheduler.mergetemplate.impl.MergeTemplateImpl#getImportedCalendar <em>Imported Calendar</em>}</li>
 *   <li>{@link scheduler.mergetemplate.impl.MergeTemplateImpl#getCurrentCalendar <em>Current Calendar</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MergeTemplateImpl extends MinimalEObjectImpl.Container implements MergeTemplate {
	/**
	 * The cached value of the '{@link #getResultCalendar() <em>Result Calendar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultCalendar()
	 * @generated
	 * @ordered
	 */
	protected Object resultCalendar;

	/**
	 * The cached value of the '{@link #getImportedCalendar() <em>Imported Calendar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedCalendar()
	 * @generated
	 * @ordered
	 */
	protected Object importedCalendar;

	/**
	 * The cached value of the '{@link #getCurrentCalendar() <em>Current Calendar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentCalendar()
	 * @generated
	 * @ordered
	 */
	protected Object currentCalendar;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MergeTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MergetemplatePackage.Literals.MERGE_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getResultCalendar() {
		return resultCalendar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultCalendar(Object newResultCalendar) {
		Object oldResultCalendar = resultCalendar;
		resultCalendar = newResultCalendar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MergetemplatePackage.MERGE_TEMPLATE__RESULT_CALENDAR, oldResultCalendar, resultCalendar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImportedCalendar() {
		return importedCalendar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedCalendar(Object newImportedCalendar) {
		Object oldImportedCalendar = importedCalendar;
		importedCalendar = newImportedCalendar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MergetemplatePackage.MERGE_TEMPLATE__IMPORTED_CALENDAR, oldImportedCalendar, importedCalendar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getCurrentCalendar() {
		return currentCalendar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentCalendar(Object newCurrentCalendar) {
		Object oldCurrentCalendar = currentCalendar;
		currentCalendar = newCurrentCalendar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MergetemplatePackage.MERGE_TEMPLATE__CURRENT_CALENDAR, oldCurrentCalendar, currentCalendar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void importCalendar(Object calendar) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void parseCalenar(Object calendar) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addActivity(Object calendar) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object generateCalendar() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void reset() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MergetemplatePackage.MERGE_TEMPLATE__RESULT_CALENDAR:
				return getResultCalendar();
			case MergetemplatePackage.MERGE_TEMPLATE__IMPORTED_CALENDAR:
				return getImportedCalendar();
			case MergetemplatePackage.MERGE_TEMPLATE__CURRENT_CALENDAR:
				return getCurrentCalendar();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MergetemplatePackage.MERGE_TEMPLATE__RESULT_CALENDAR:
				setResultCalendar(newValue);
				return;
			case MergetemplatePackage.MERGE_TEMPLATE__IMPORTED_CALENDAR:
				setImportedCalendar(newValue);
				return;
			case MergetemplatePackage.MERGE_TEMPLATE__CURRENT_CALENDAR:
				setCurrentCalendar(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MergetemplatePackage.MERGE_TEMPLATE__RESULT_CALENDAR:
				setResultCalendar((Object)null);
				return;
			case MergetemplatePackage.MERGE_TEMPLATE__IMPORTED_CALENDAR:
				setImportedCalendar((Object)null);
				return;
			case MergetemplatePackage.MERGE_TEMPLATE__CURRENT_CALENDAR:
				setCurrentCalendar((Object)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MergetemplatePackage.MERGE_TEMPLATE__RESULT_CALENDAR:
				return resultCalendar != null;
			case MergetemplatePackage.MERGE_TEMPLATE__IMPORTED_CALENDAR:
				return importedCalendar != null;
			case MergetemplatePackage.MERGE_TEMPLATE__CURRENT_CALENDAR:
				return currentCalendar != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case MergetemplatePackage.MERGE_TEMPLATE___IMPORT_CALENDAR__OBJECT:
				importCalendar(arguments.get(0));
				return null;
			case MergetemplatePackage.MERGE_TEMPLATE___PARSE_CALENAR__OBJECT:
				parseCalenar(arguments.get(0));
				return null;
			case MergetemplatePackage.MERGE_TEMPLATE___ADD_ACTIVITY__OBJECT:
				addActivity(arguments.get(0));
				return null;
			case MergetemplatePackage.MERGE_TEMPLATE___GENERATE_CALENDAR:
				return generateCalendar();
			case MergetemplatePackage.MERGE_TEMPLATE___RESET:
				reset();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (resultCalendar: ");
		result.append(resultCalendar);
		result.append(", importedCalendar: ");
		result.append(importedCalendar);
		result.append(", currentCalendar: ");
		result.append(currentCalendar);
		result.append(')');
		return result.toString();
	}

} //MergeTemplateImpl
