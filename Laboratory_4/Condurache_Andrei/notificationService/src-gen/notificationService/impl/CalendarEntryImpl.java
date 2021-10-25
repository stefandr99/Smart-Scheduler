/**
 */
package notificationService.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import notificationService.CalendarEntry;
import notificationService.NotificationServicePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calendar Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link notificationService.impl.CalendarEntryImpl#getBeginningDate <em>Beginning Date</em>}</li>
 *   <li>{@link notificationService.impl.CalendarEntryImpl#getName <em>Name</em>}</li>
 *   <li>{@link notificationService.impl.CalendarEntryImpl#getEndDate <em>End Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalendarEntryImpl extends MinimalEObjectImpl.Container implements CalendarEntry {
	/**
	 * The default value of the '{@link #getBeginningDate() <em>Beginning Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginningDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar BEGINNING_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeginningDate() <em>Beginning Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginningDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar beginningDate = BEGINNING_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar endDate = END_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalendarEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NotificationServicePackage.Literals.CALENDAR_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getBeginningDate() {
		return beginningDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeginningDate(XMLGregorianCalendar newBeginningDate) {
		XMLGregorianCalendar oldBeginningDate = beginningDate;
		beginningDate = newBeginningDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					NotificationServicePackage.CALENDAR_ENTRY__BEGINNING_DATE, oldBeginningDate, beginningDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotificationServicePackage.CALENDAR_ENTRY__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDate(XMLGregorianCalendar newEndDate) {
		XMLGregorianCalendar oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotificationServicePackage.CALENDAR_ENTRY__END_DATE,
					oldEndDate, endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case NotificationServicePackage.CALENDAR_ENTRY__BEGINNING_DATE:
			return getBeginningDate();
		case NotificationServicePackage.CALENDAR_ENTRY__NAME:
			return getName();
		case NotificationServicePackage.CALENDAR_ENTRY__END_DATE:
			return getEndDate();
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
		case NotificationServicePackage.CALENDAR_ENTRY__BEGINNING_DATE:
			setBeginningDate((XMLGregorianCalendar) newValue);
			return;
		case NotificationServicePackage.CALENDAR_ENTRY__NAME:
			setName((String) newValue);
			return;
		case NotificationServicePackage.CALENDAR_ENTRY__END_DATE:
			setEndDate((XMLGregorianCalendar) newValue);
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
		case NotificationServicePackage.CALENDAR_ENTRY__BEGINNING_DATE:
			setBeginningDate(BEGINNING_DATE_EDEFAULT);
			return;
		case NotificationServicePackage.CALENDAR_ENTRY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case NotificationServicePackage.CALENDAR_ENTRY__END_DATE:
			setEndDate(END_DATE_EDEFAULT);
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
		case NotificationServicePackage.CALENDAR_ENTRY__BEGINNING_DATE:
			return BEGINNING_DATE_EDEFAULT == null ? beginningDate != null
					: !BEGINNING_DATE_EDEFAULT.equals(beginningDate);
		case NotificationServicePackage.CALENDAR_ENTRY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case NotificationServicePackage.CALENDAR_ENTRY__END_DATE:
			return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (beginningDate: ");
		result.append(beginningDate);
		result.append(", name: ");
		result.append(name);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(')');
		return result.toString();
	}

} //CalendarEntryImpl
