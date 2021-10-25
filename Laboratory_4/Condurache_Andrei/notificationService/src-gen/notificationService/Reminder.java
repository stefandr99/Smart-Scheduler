/**
 */
package notificationService;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reminder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link notificationService.Reminder#getNotifymanager <em>Notifymanager</em>}</li>
 *   <li>{@link notificationService.Reminder#getCalendarentry <em>Calendarentry</em>}</li>
 * </ul>
 *
 * @see notificationService.NotificationServicePackage#getReminder()
 * @model
 * @generated
 */
public interface Reminder extends EObject {
	/**
	 * Returns the value of the '<em><b>Notifymanager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notifymanager</em>' reference.
	 * @see #setNotifymanager(NotifyManager)
	 * @see notificationService.NotificationServicePackage#getReminder_Notifymanager()
	 * @model
	 * @generated
	 */
	NotifyManager getNotifymanager();

	/**
	 * Sets the value of the '{@link notificationService.Reminder#getNotifymanager <em>Notifymanager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notifymanager</em>' reference.
	 * @see #getNotifymanager()
	 * @generated
	 */
	void setNotifymanager(NotifyManager value);

	/**
	 * Returns the value of the '<em><b>Calendarentry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calendarentry</em>' reference.
	 * @see #setCalendarentry(CalendarEntry)
	 * @see notificationService.NotificationServicePackage#getReminder_Calendarentry()
	 * @model
	 * @generated
	 */
	CalendarEntry getCalendarentry();

	/**
	 * Sets the value of the '{@link notificationService.Reminder#getCalendarentry <em>Calendarentry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calendarentry</em>' reference.
	 * @see #getCalendarentry()
	 * @generated
	 */
	void setCalendarentry(CalendarEntry value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model typesMany="false"
	 * @generated
	 */
	void chooseNotificationTypes(EList<?> types);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void remind(CalendarEntry entry);

} // Reminder
