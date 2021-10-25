/**
 */
package notificationService.impl;

import java.lang.reflect.InvocationTargetException;

import notificationService.CalendarEntry;
import notificationService.NotificationServicePackage;
import notificationService.NotifyManager;
import notificationService.Reminder;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reminder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link notificationService.impl.ReminderImpl#getNotifymanager <em>Notifymanager</em>}</li>
 *   <li>{@link notificationService.impl.ReminderImpl#getCalendarentry <em>Calendarentry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReminderImpl extends MinimalEObjectImpl.Container implements Reminder {
	/**
	 * The cached value of the '{@link #getNotifymanager() <em>Notifymanager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotifymanager()
	 * @generated
	 * @ordered
	 */
	protected NotifyManager notifymanager;

	/**
	 * The cached value of the '{@link #getCalendarentry() <em>Calendarentry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalendarentry()
	 * @generated
	 * @ordered
	 */
	protected CalendarEntry calendarentry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReminderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NotificationServicePackage.Literals.REMINDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotifyManager getNotifymanager() {
		if (notifymanager != null && notifymanager.eIsProxy()) {
			InternalEObject oldNotifymanager = (InternalEObject) notifymanager;
			notifymanager = (NotifyManager) eResolveProxy(oldNotifymanager);
			if (notifymanager != oldNotifymanager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							NotificationServicePackage.REMINDER__NOTIFYMANAGER, oldNotifymanager, notifymanager));
			}
		}
		return notifymanager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotifyManager basicGetNotifymanager() {
		return notifymanager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotifymanager(NotifyManager newNotifymanager) {
		NotifyManager oldNotifymanager = notifymanager;
		notifymanager = newNotifymanager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotificationServicePackage.REMINDER__NOTIFYMANAGER,
					oldNotifymanager, notifymanager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalendarEntry getCalendarentry() {
		if (calendarentry != null && calendarentry.eIsProxy()) {
			InternalEObject oldCalendarentry = (InternalEObject) calendarentry;
			calendarentry = (CalendarEntry) eResolveProxy(oldCalendarentry);
			if (calendarentry != oldCalendarentry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							NotificationServicePackage.REMINDER__CALENDARENTRY, oldCalendarentry, calendarentry));
			}
		}
		return calendarentry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalendarEntry basicGetCalendarentry() {
		return calendarentry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalendarentry(CalendarEntry newCalendarentry) {
		CalendarEntry oldCalendarentry = calendarentry;
		calendarentry = newCalendarentry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotificationServicePackage.REMINDER__CALENDARENTRY,
					oldCalendarentry, calendarentry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void chooseNotificationTypes(EList<?> types) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void remind(CalendarEntry entry) {
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
		case NotificationServicePackage.REMINDER__NOTIFYMANAGER:
			if (resolve)
				return getNotifymanager();
			return basicGetNotifymanager();
		case NotificationServicePackage.REMINDER__CALENDARENTRY:
			if (resolve)
				return getCalendarentry();
			return basicGetCalendarentry();
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
		case NotificationServicePackage.REMINDER__NOTIFYMANAGER:
			setNotifymanager((NotifyManager) newValue);
			return;
		case NotificationServicePackage.REMINDER__CALENDARENTRY:
			setCalendarentry((CalendarEntry) newValue);
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
		case NotificationServicePackage.REMINDER__NOTIFYMANAGER:
			setNotifymanager((NotifyManager) null);
			return;
		case NotificationServicePackage.REMINDER__CALENDARENTRY:
			setCalendarentry((CalendarEntry) null);
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
		case NotificationServicePackage.REMINDER__NOTIFYMANAGER:
			return notifymanager != null;
		case NotificationServicePackage.REMINDER__CALENDARENTRY:
			return calendarentry != null;
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
		case NotificationServicePackage.REMINDER___CHOOSE_NOTIFICATION_TYPES__ELIST:
			chooseNotificationTypes((EList<?>) arguments.get(0));
			return null;
		case NotificationServicePackage.REMINDER___REMIND__CALENDARENTRY:
			remind((CalendarEntry) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ReminderImpl
