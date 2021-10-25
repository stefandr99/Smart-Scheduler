/**
 */
package notificationService;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see notificationService.NotificationServiceFactory
 * @model kind="package"
 * @generated
 */
public interface NotificationServicePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "notificationService";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/notificationService";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "notificationService";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NotificationServicePackage eINSTANCE = notificationService.impl.NotificationServicePackageImpl.init();

	/**
	 * The meta object id for the '{@link notificationService.INotifyObserver <em>INotify Observer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notificationService.INotifyObserver
	 * @see notificationService.impl.NotificationServicePackageImpl#getINotifyObserver()
	 * @generated
	 */
	int INOTIFY_OBSERVER = 0;

	/**
	 * The number of structural features of the '<em>INotify Observer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INOTIFY_OBSERVER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Notify</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INOTIFY_OBSERVER___NOTIFY = 0;

	/**
	 * The number of operations of the '<em>INotify Observer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INOTIFY_OBSERVER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link notificationService.impl.EmailNotifierImpl <em>Email Notifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notificationService.impl.EmailNotifierImpl
	 * @see notificationService.impl.NotificationServicePackageImpl#getEmailNotifier()
	 * @generated
	 */
	int EMAIL_NOTIFIER = 1;

	/**
	 * The number of structural features of the '<em>Email Notifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_NOTIFIER_FEATURE_COUNT = INOTIFY_OBSERVER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_NOTIFIER___NOTIFY = INOTIFY_OBSERVER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Email Notifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_NOTIFIER_OPERATION_COUNT = INOTIFY_OBSERVER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link notificationService.impl.AppNotifierImpl <em>App Notifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notificationService.impl.AppNotifierImpl
	 * @see notificationService.impl.NotificationServicePackageImpl#getAppNotifier()
	 * @generated
	 */
	int APP_NOTIFIER = 2;

	/**
	 * The number of structural features of the '<em>App Notifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_NOTIFIER_FEATURE_COUNT = INOTIFY_OBSERVER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_NOTIFIER___NOTIFY = INOTIFY_OBSERVER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>App Notifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_NOTIFIER_OPERATION_COUNT = INOTIFY_OBSERVER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link notificationService.impl.ChromeNotifierImpl <em>Chrome Notifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notificationService.impl.ChromeNotifierImpl
	 * @see notificationService.impl.NotificationServicePackageImpl#getChromeNotifier()
	 * @generated
	 */
	int CHROME_NOTIFIER = 3;

	/**
	 * The number of structural features of the '<em>Chrome Notifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHROME_NOTIFIER_FEATURE_COUNT = INOTIFY_OBSERVER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Notify</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHROME_NOTIFIER___NOTIFY = INOTIFY_OBSERVER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Chrome Notifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHROME_NOTIFIER_OPERATION_COUNT = INOTIFY_OBSERVER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link notificationService.impl.NotifyManagerImpl <em>Notify Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notificationService.impl.NotifyManagerImpl
	 * @see notificationService.impl.NotificationServicePackageImpl#getNotifyManager()
	 * @generated
	 */
	int NOTIFY_MANAGER = 4;

	/**
	 * The feature id for the '<em><b>Inotifyobserver</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFY_MANAGER__INOTIFYOBSERVER = 0;

	/**
	 * The feature id for the '<em><b>Observers List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFY_MANAGER__OBSERVERS_LIST = 1;

	/**
	 * The number of structural features of the '<em>Notify Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFY_MANAGER_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Add Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFY_MANAGER___ADD_SERVICE__INOTIFYOBSERVER = 0;

	/**
	 * The operation id for the '<em>Remove Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFY_MANAGER___REMOVE_SERVICE__INOTIFYOBSERVER = 1;

	/**
	 * The operation id for the '<em>Send Notifications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFY_MANAGER___SEND_NOTIFICATIONS = 2;

	/**
	 * The number of operations of the '<em>Notify Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFY_MANAGER_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link notificationService.impl.CalendarEntryImpl <em>Calendar Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notificationService.impl.CalendarEntryImpl
	 * @see notificationService.impl.NotificationServicePackageImpl#getCalendarEntry()
	 * @generated
	 */
	int CALENDAR_ENTRY = 5;

	/**
	 * The feature id for the '<em><b>Beginning Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_ENTRY__BEGINNING_DATE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_ENTRY__NAME = 1;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_ENTRY__END_DATE = 2;

	/**
	 * The number of structural features of the '<em>Calendar Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_ENTRY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Calendar Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link notificationService.impl.ReminderImpl <em>Reminder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notificationService.impl.ReminderImpl
	 * @see notificationService.impl.NotificationServicePackageImpl#getReminder()
	 * @generated
	 */
	int REMINDER = 6;

	/**
	 * The feature id for the '<em><b>Notifymanager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMINDER__NOTIFYMANAGER = 0;

	/**
	 * The feature id for the '<em><b>Calendarentry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMINDER__CALENDARENTRY = 1;

	/**
	 * The number of structural features of the '<em>Reminder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMINDER_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Choose Notification Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMINDER___CHOOSE_NOTIFICATION_TYPES__ELIST = 0;

	/**
	 * The operation id for the '<em>Remind</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMINDER___REMIND__CALENDARENTRY = 1;

	/**
	 * The number of operations of the '<em>Reminder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMINDER_OPERATION_COUNT = 2;

	/**
	 * Returns the meta object for class '{@link notificationService.INotifyObserver <em>INotify Observer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>INotify Observer</em>'.
	 * @see notificationService.INotifyObserver
	 * @generated
	 */
	EClass getINotifyObserver();

	/**
	 * Returns the meta object for the '{@link notificationService.INotifyObserver#notify() <em>Notify</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Notify</em>' operation.
	 * @see notificationService.INotifyObserver#notify()
	 * @generated
	 */
	EOperation getINotifyObserver__Notify();

	/**
	 * Returns the meta object for class '{@link notificationService.EmailNotifier <em>Email Notifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Email Notifier</em>'.
	 * @see notificationService.EmailNotifier
	 * @generated
	 */
	EClass getEmailNotifier();

	/**
	 * Returns the meta object for the '{@link notificationService.EmailNotifier#notify() <em>Notify</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Notify</em>' operation.
	 * @see notificationService.EmailNotifier#notify()
	 * @generated
	 */
	EOperation getEmailNotifier__Notify();

	/**
	 * Returns the meta object for class '{@link notificationService.AppNotifier <em>App Notifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App Notifier</em>'.
	 * @see notificationService.AppNotifier
	 * @generated
	 */
	EClass getAppNotifier();

	/**
	 * Returns the meta object for the '{@link notificationService.AppNotifier#notify() <em>Notify</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Notify</em>' operation.
	 * @see notificationService.AppNotifier#notify()
	 * @generated
	 */
	EOperation getAppNotifier__Notify();

	/**
	 * Returns the meta object for class '{@link notificationService.ChromeNotifier <em>Chrome Notifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chrome Notifier</em>'.
	 * @see notificationService.ChromeNotifier
	 * @generated
	 */
	EClass getChromeNotifier();

	/**
	 * Returns the meta object for the '{@link notificationService.ChromeNotifier#notify() <em>Notify</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Notify</em>' operation.
	 * @see notificationService.ChromeNotifier#notify()
	 * @generated
	 */
	EOperation getChromeNotifier__Notify();

	/**
	 * Returns the meta object for class '{@link notificationService.NotifyManager <em>Notify Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notify Manager</em>'.
	 * @see notificationService.NotifyManager
	 * @generated
	 */
	EClass getNotifyManager();

	/**
	 * Returns the meta object for the containment reference list '{@link notificationService.NotifyManager#getInotifyobserver <em>Inotifyobserver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inotifyobserver</em>'.
	 * @see notificationService.NotifyManager#getInotifyobserver()
	 * @see #getNotifyManager()
	 * @generated
	 */
	EReference getNotifyManager_Inotifyobserver();

	/**
	 * Returns the meta object for the attribute '{@link notificationService.NotifyManager#getObserversList <em>Observers List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Observers List</em>'.
	 * @see notificationService.NotifyManager#getObserversList()
	 * @see #getNotifyManager()
	 * @generated
	 */
	EAttribute getNotifyManager_ObserversList();

	/**
	 * Returns the meta object for the '{@link notificationService.NotifyManager#addService(notificationService.INotifyObserver) <em>Add Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Service</em>' operation.
	 * @see notificationService.NotifyManager#addService(notificationService.INotifyObserver)
	 * @generated
	 */
	EOperation getNotifyManager__AddService__INotifyObserver();

	/**
	 * Returns the meta object for the '{@link notificationService.NotifyManager#removeService(notificationService.INotifyObserver) <em>Remove Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Service</em>' operation.
	 * @see notificationService.NotifyManager#removeService(notificationService.INotifyObserver)
	 * @generated
	 */
	EOperation getNotifyManager__RemoveService__INotifyObserver();

	/**
	 * Returns the meta object for the '{@link notificationService.NotifyManager#sendNotifications() <em>Send Notifications</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send Notifications</em>' operation.
	 * @see notificationService.NotifyManager#sendNotifications()
	 * @generated
	 */
	EOperation getNotifyManager__SendNotifications();

	/**
	 * Returns the meta object for class '{@link notificationService.CalendarEntry <em>Calendar Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calendar Entry</em>'.
	 * @see notificationService.CalendarEntry
	 * @generated
	 */
	EClass getCalendarEntry();

	/**
	 * Returns the meta object for the attribute '{@link notificationService.CalendarEntry#getBeginningDate <em>Beginning Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beginning Date</em>'.
	 * @see notificationService.CalendarEntry#getBeginningDate()
	 * @see #getCalendarEntry()
	 * @generated
	 */
	EAttribute getCalendarEntry_BeginningDate();

	/**
	 * Returns the meta object for the attribute '{@link notificationService.CalendarEntry#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see notificationService.CalendarEntry#getName()
	 * @see #getCalendarEntry()
	 * @generated
	 */
	EAttribute getCalendarEntry_Name();

	/**
	 * Returns the meta object for the attribute '{@link notificationService.CalendarEntry#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see notificationService.CalendarEntry#getEndDate()
	 * @see #getCalendarEntry()
	 * @generated
	 */
	EAttribute getCalendarEntry_EndDate();

	/**
	 * Returns the meta object for class '{@link notificationService.Reminder <em>Reminder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reminder</em>'.
	 * @see notificationService.Reminder
	 * @generated
	 */
	EClass getReminder();

	/**
	 * Returns the meta object for the reference '{@link notificationService.Reminder#getNotifymanager <em>Notifymanager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Notifymanager</em>'.
	 * @see notificationService.Reminder#getNotifymanager()
	 * @see #getReminder()
	 * @generated
	 */
	EReference getReminder_Notifymanager();

	/**
	 * Returns the meta object for the reference '{@link notificationService.Reminder#getCalendarentry <em>Calendarentry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Calendarentry</em>'.
	 * @see notificationService.Reminder#getCalendarentry()
	 * @see #getReminder()
	 * @generated
	 */
	EReference getReminder_Calendarentry();

	/**
	 * Returns the meta object for the '{@link notificationService.Reminder#chooseNotificationTypes(org.eclipse.emf.common.util.EList) <em>Choose Notification Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Choose Notification Types</em>' operation.
	 * @see notificationService.Reminder#chooseNotificationTypes(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getReminder__ChooseNotificationTypes__EList();

	/**
	 * Returns the meta object for the '{@link notificationService.Reminder#remind(notificationService.CalendarEntry) <em>Remind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remind</em>' operation.
	 * @see notificationService.Reminder#remind(notificationService.CalendarEntry)
	 * @generated
	 */
	EOperation getReminder__Remind__CalendarEntry();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NotificationServiceFactory getNotificationServiceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link notificationService.INotifyObserver <em>INotify Observer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notificationService.INotifyObserver
		 * @see notificationService.impl.NotificationServicePackageImpl#getINotifyObserver()
		 * @generated
		 */
		EClass INOTIFY_OBSERVER = eINSTANCE.getINotifyObserver();

		/**
		 * The meta object literal for the '<em><b>Notify</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INOTIFY_OBSERVER___NOTIFY = eINSTANCE.getINotifyObserver__Notify();

		/**
		 * The meta object literal for the '{@link notificationService.impl.EmailNotifierImpl <em>Email Notifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notificationService.impl.EmailNotifierImpl
		 * @see notificationService.impl.NotificationServicePackageImpl#getEmailNotifier()
		 * @generated
		 */
		EClass EMAIL_NOTIFIER = eINSTANCE.getEmailNotifier();

		/**
		 * The meta object literal for the '<em><b>Notify</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMAIL_NOTIFIER___NOTIFY = eINSTANCE.getEmailNotifier__Notify();

		/**
		 * The meta object literal for the '{@link notificationService.impl.AppNotifierImpl <em>App Notifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notificationService.impl.AppNotifierImpl
		 * @see notificationService.impl.NotificationServicePackageImpl#getAppNotifier()
		 * @generated
		 */
		EClass APP_NOTIFIER = eINSTANCE.getAppNotifier();

		/**
		 * The meta object literal for the '<em><b>Notify</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APP_NOTIFIER___NOTIFY = eINSTANCE.getAppNotifier__Notify();

		/**
		 * The meta object literal for the '{@link notificationService.impl.ChromeNotifierImpl <em>Chrome Notifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notificationService.impl.ChromeNotifierImpl
		 * @see notificationService.impl.NotificationServicePackageImpl#getChromeNotifier()
		 * @generated
		 */
		EClass CHROME_NOTIFIER = eINSTANCE.getChromeNotifier();

		/**
		 * The meta object literal for the '<em><b>Notify</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CHROME_NOTIFIER___NOTIFY = eINSTANCE.getChromeNotifier__Notify();

		/**
		 * The meta object literal for the '{@link notificationService.impl.NotifyManagerImpl <em>Notify Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notificationService.impl.NotifyManagerImpl
		 * @see notificationService.impl.NotificationServicePackageImpl#getNotifyManager()
		 * @generated
		 */
		EClass NOTIFY_MANAGER = eINSTANCE.getNotifyManager();

		/**
		 * The meta object literal for the '<em><b>Inotifyobserver</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTIFY_MANAGER__INOTIFYOBSERVER = eINSTANCE.getNotifyManager_Inotifyobserver();

		/**
		 * The meta object literal for the '<em><b>Observers List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFY_MANAGER__OBSERVERS_LIST = eINSTANCE.getNotifyManager_ObserversList();

		/**
		 * The meta object literal for the '<em><b>Add Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NOTIFY_MANAGER___ADD_SERVICE__INOTIFYOBSERVER = eINSTANCE
				.getNotifyManager__AddService__INotifyObserver();

		/**
		 * The meta object literal for the '<em><b>Remove Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NOTIFY_MANAGER___REMOVE_SERVICE__INOTIFYOBSERVER = eINSTANCE
				.getNotifyManager__RemoveService__INotifyObserver();

		/**
		 * The meta object literal for the '<em><b>Send Notifications</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NOTIFY_MANAGER___SEND_NOTIFICATIONS = eINSTANCE.getNotifyManager__SendNotifications();

		/**
		 * The meta object literal for the '{@link notificationService.impl.CalendarEntryImpl <em>Calendar Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notificationService.impl.CalendarEntryImpl
		 * @see notificationService.impl.NotificationServicePackageImpl#getCalendarEntry()
		 * @generated
		 */
		EClass CALENDAR_ENTRY = eINSTANCE.getCalendarEntry();

		/**
		 * The meta object literal for the '<em><b>Beginning Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR_ENTRY__BEGINNING_DATE = eINSTANCE.getCalendarEntry_BeginningDate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR_ENTRY__NAME = eINSTANCE.getCalendarEntry_Name();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR_ENTRY__END_DATE = eINSTANCE.getCalendarEntry_EndDate();

		/**
		 * The meta object literal for the '{@link notificationService.impl.ReminderImpl <em>Reminder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notificationService.impl.ReminderImpl
		 * @see notificationService.impl.NotificationServicePackageImpl#getReminder()
		 * @generated
		 */
		EClass REMINDER = eINSTANCE.getReminder();

		/**
		 * The meta object literal for the '<em><b>Notifymanager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMINDER__NOTIFYMANAGER = eINSTANCE.getReminder_Notifymanager();

		/**
		 * The meta object literal for the '<em><b>Calendarentry</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMINDER__CALENDARENTRY = eINSTANCE.getReminder_Calendarentry();

		/**
		 * The meta object literal for the '<em><b>Choose Notification Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REMINDER___CHOOSE_NOTIFICATION_TYPES__ELIST = eINSTANCE
				.getReminder__ChooseNotificationTypes__EList();

		/**
		 * The meta object literal for the '<em><b>Remind</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REMINDER___REMIND__CALENDARENTRY = eINSTANCE.getReminder__Remind__CalendarEntry();

	}

} //NotificationServicePackage
