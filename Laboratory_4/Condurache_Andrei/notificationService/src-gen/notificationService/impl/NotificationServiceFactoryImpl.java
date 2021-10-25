/**
 */
package notificationService.impl;

import notificationService.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NotificationServiceFactoryImpl extends EFactoryImpl implements NotificationServiceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NotificationServiceFactory init() {
		try {
			NotificationServiceFactory theNotificationServiceFactory = (NotificationServiceFactory) EPackage.Registry.INSTANCE
					.getEFactory(NotificationServicePackage.eNS_URI);
			if (theNotificationServiceFactory != null) {
				return theNotificationServiceFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NotificationServiceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationServiceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case NotificationServicePackage.EMAIL_NOTIFIER:
			return createEmailNotifier();
		case NotificationServicePackage.APP_NOTIFIER:
			return createAppNotifier();
		case NotificationServicePackage.CHROME_NOTIFIER:
			return createChromeNotifier();
		case NotificationServicePackage.NOTIFY_MANAGER:
			return createNotifyManager();
		case NotificationServicePackage.CALENDAR_ENTRY:
			return createCalendarEntry();
		case NotificationServicePackage.REMINDER:
			return createReminder();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmailNotifier createEmailNotifier() {
		EmailNotifierImpl emailNotifier = new EmailNotifierImpl();
		return emailNotifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppNotifier createAppNotifier() {
		AppNotifierImpl appNotifier = new AppNotifierImpl();
		return appNotifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChromeNotifier createChromeNotifier() {
		ChromeNotifierImpl chromeNotifier = new ChromeNotifierImpl();
		return chromeNotifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotifyManager createNotifyManager() {
		NotifyManagerImpl notifyManager = new NotifyManagerImpl();
		return notifyManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalendarEntry createCalendarEntry() {
		CalendarEntryImpl calendarEntry = new CalendarEntryImpl();
		return calendarEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reminder createReminder() {
		ReminderImpl reminder = new ReminderImpl();
		return reminder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationServicePackage getNotificationServicePackage() {
		return (NotificationServicePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NotificationServicePackage getPackage() {
		return NotificationServicePackage.eINSTANCE;
	}

} //NotificationServiceFactoryImpl
