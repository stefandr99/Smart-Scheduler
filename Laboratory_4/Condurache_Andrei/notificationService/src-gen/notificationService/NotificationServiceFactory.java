/**
 */
package notificationService;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see notificationService.NotificationServicePackage
 * @generated
 */
public interface NotificationServiceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NotificationServiceFactory eINSTANCE = notificationService.impl.NotificationServiceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Email Notifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Email Notifier</em>'.
	 * @generated
	 */
	EmailNotifier createEmailNotifier();

	/**
	 * Returns a new object of class '<em>App Notifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>App Notifier</em>'.
	 * @generated
	 */
	AppNotifier createAppNotifier();

	/**
	 * Returns a new object of class '<em>Chrome Notifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chrome Notifier</em>'.
	 * @generated
	 */
	ChromeNotifier createChromeNotifier();

	/**
	 * Returns a new object of class '<em>Notify Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Notify Manager</em>'.
	 * @generated
	 */
	NotifyManager createNotifyManager();

	/**
	 * Returns a new object of class '<em>Calendar Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calendar Entry</em>'.
	 * @generated
	 */
	CalendarEntry createCalendarEntry();

	/**
	 * Returns a new object of class '<em>Reminder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reminder</em>'.
	 * @generated
	 */
	Reminder createReminder();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NotificationServicePackage getNotificationServicePackage();

} //NotificationServiceFactory
