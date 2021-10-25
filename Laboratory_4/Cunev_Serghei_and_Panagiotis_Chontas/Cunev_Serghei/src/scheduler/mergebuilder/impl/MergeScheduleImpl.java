/**
 */
package scheduler.mergebuilder.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import scheduler.mergebuilder.MergeSchedule;
import scheduler.mergebuilder.MergebuilderPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Merge Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link scheduler.mergebuilder.impl.MergeScheduleImpl#getResultCalendar <em>Result Calendar</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MergeScheduleImpl extends MinimalEObjectImpl.Container implements MergeSchedule {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MergeScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MergebuilderPackage.Literals.MERGE_SCHEDULE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MergebuilderPackage.MERGE_SCHEDULE__RESULT_CALENDAR, oldResultCalendar, resultCalendar));
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
	public void addActivity(Object calenar) {
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
			case MergebuilderPackage.MERGE_SCHEDULE__RESULT_CALENDAR:
				return getResultCalendar();
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
			case MergebuilderPackage.MERGE_SCHEDULE__RESULT_CALENDAR:
				setResultCalendar(newValue);
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
			case MergebuilderPackage.MERGE_SCHEDULE__RESULT_CALENDAR:
				setResultCalendar((Object)null);
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
			case MergebuilderPackage.MERGE_SCHEDULE__RESULT_CALENDAR:
				return resultCalendar != null;
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
			case MergebuilderPackage.MERGE_SCHEDULE___GENERATE_CALENDAR:
				return generateCalendar();
			case MergebuilderPackage.MERGE_SCHEDULE___RESET:
				reset();
				return null;
			case MergebuilderPackage.MERGE_SCHEDULE___IMPORT_CALENDAR__OBJECT:
				importCalendar(arguments.get(0));
				return null;
			case MergebuilderPackage.MERGE_SCHEDULE___PARSE_CALENAR__OBJECT:
				parseCalenar(arguments.get(0));
				return null;
			case MergebuilderPackage.MERGE_SCHEDULE___ADD_ACTIVITY__OBJECT:
				addActivity(arguments.get(0));
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
		result.append(')');
		return result.toString();
	}

} //MergeScheduleImpl
