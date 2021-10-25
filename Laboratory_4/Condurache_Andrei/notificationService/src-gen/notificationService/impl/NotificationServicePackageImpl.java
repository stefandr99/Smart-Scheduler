/**
 */
package notificationService.impl;

import notificationService.AppNotifier;
import notificationService.CalendarEntry;
import notificationService.ChromeNotifier;
import notificationService.EmailNotifier;
import notificationService.INotifyObserver;
import notificationService.NotificationServiceFactory;
import notificationService.NotificationServicePackage;
import notificationService.NotifyManager;
import notificationService.Reminder;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NotificationServicePackageImpl extends EPackageImpl implements NotificationServicePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iNotifyObserverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emailNotifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appNotifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chromeNotifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notifyManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calendarEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reminderEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see notificationService.NotificationServicePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NotificationServicePackageImpl() {
		super(eNS_URI, NotificationServiceFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link NotificationServicePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NotificationServicePackage init() {
		if (isInited)
			return (NotificationServicePackage) EPackage.Registry.INSTANCE
					.getEPackage(NotificationServicePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredNotificationServicePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		NotificationServicePackageImpl theNotificationServicePackage = registeredNotificationServicePackage instanceof NotificationServicePackageImpl
				? (NotificationServicePackageImpl) registeredNotificationServicePackage
				: new NotificationServicePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theNotificationServicePackage.createPackageContents();

		// Initialize created meta-data
		theNotificationServicePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNotificationServicePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NotificationServicePackage.eNS_URI, theNotificationServicePackage);
		return theNotificationServicePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getINotifyObserver() {
		return iNotifyObserverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getINotifyObserver__Notify() {
		return iNotifyObserverEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmailNotifier() {
		return emailNotifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmailNotifier__Notify() {
		return emailNotifierEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppNotifier() {
		return appNotifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAppNotifier__Notify() {
		return appNotifierEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChromeNotifier() {
		return chromeNotifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChromeNotifier__Notify() {
		return chromeNotifierEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotifyManager() {
		return notifyManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotifyManager_Inotifyobserver() {
		return (EReference) notifyManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotifyManager_ObserversList() {
		return (EAttribute) notifyManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNotifyManager__AddService__INotifyObserver() {
		return notifyManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNotifyManager__RemoveService__INotifyObserver() {
		return notifyManagerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNotifyManager__SendNotifications() {
		return notifyManagerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalendarEntry() {
		return calendarEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalendarEntry_BeginningDate() {
		return (EAttribute) calendarEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalendarEntry_Name() {
		return (EAttribute) calendarEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalendarEntry_EndDate() {
		return (EAttribute) calendarEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReminder() {
		return reminderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReminder_Notifymanager() {
		return (EReference) reminderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReminder_Calendarentry() {
		return (EReference) reminderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReminder__ChooseNotificationTypes__EList() {
		return reminderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReminder__Remind__CalendarEntry() {
		return reminderEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationServiceFactory getNotificationServiceFactory() {
		return (NotificationServiceFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		iNotifyObserverEClass = createEClass(INOTIFY_OBSERVER);
		createEOperation(iNotifyObserverEClass, INOTIFY_OBSERVER___NOTIFY);

		emailNotifierEClass = createEClass(EMAIL_NOTIFIER);
		createEOperation(emailNotifierEClass, EMAIL_NOTIFIER___NOTIFY);

		appNotifierEClass = createEClass(APP_NOTIFIER);
		createEOperation(appNotifierEClass, APP_NOTIFIER___NOTIFY);

		chromeNotifierEClass = createEClass(CHROME_NOTIFIER);
		createEOperation(chromeNotifierEClass, CHROME_NOTIFIER___NOTIFY);

		notifyManagerEClass = createEClass(NOTIFY_MANAGER);
		createEReference(notifyManagerEClass, NOTIFY_MANAGER__INOTIFYOBSERVER);
		createEAttribute(notifyManagerEClass, NOTIFY_MANAGER__OBSERVERS_LIST);
		createEOperation(notifyManagerEClass, NOTIFY_MANAGER___ADD_SERVICE__INOTIFYOBSERVER);
		createEOperation(notifyManagerEClass, NOTIFY_MANAGER___REMOVE_SERVICE__INOTIFYOBSERVER);
		createEOperation(notifyManagerEClass, NOTIFY_MANAGER___SEND_NOTIFICATIONS);

		calendarEntryEClass = createEClass(CALENDAR_ENTRY);
		createEAttribute(calendarEntryEClass, CALENDAR_ENTRY__BEGINNING_DATE);
		createEAttribute(calendarEntryEClass, CALENDAR_ENTRY__NAME);
		createEAttribute(calendarEntryEClass, CALENDAR_ENTRY__END_DATE);

		reminderEClass = createEClass(REMINDER);
		createEReference(reminderEClass, REMINDER__NOTIFYMANAGER);
		createEReference(reminderEClass, REMINDER__CALENDARENTRY);
		createEOperation(reminderEClass, REMINDER___CHOOSE_NOTIFICATION_TYPES__ELIST);
		createEOperation(reminderEClass, REMINDER___REMIND__CALENDARENTRY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		emailNotifierEClass.getESuperTypes().add(this.getINotifyObserver());
		appNotifierEClass.getESuperTypes().add(this.getINotifyObserver());
		chromeNotifierEClass.getESuperTypes().add(this.getINotifyObserver());

		// Initialize classes, features, and operations; add parameters
		initEClass(iNotifyObserverEClass, INotifyObserver.class, "INotifyObserver", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getINotifyObserver__Notify(), null, "notify", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(emailNotifierEClass, EmailNotifier.class, "EmailNotifier", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getEmailNotifier__Notify(), null, "notify", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(appNotifierEClass, AppNotifier.class, "AppNotifier", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getAppNotifier__Notify(), null, "notify", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(chromeNotifierEClass, ChromeNotifier.class, "ChromeNotifier", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getChromeNotifier__Notify(), null, "notify", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(notifyManagerEClass, NotifyManager.class, "NotifyManager", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNotifyManager_Inotifyobserver(), this.getINotifyObserver(), null, "inotifyobserver", null, 0,
				-1, NotifyManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotifyManager_ObserversList(), theXMLTypePackage.getENTITIES(), "observersList", null, 0, 1,
				NotifyManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getNotifyManager__AddService__INotifyObserver(), null, "addService", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getINotifyObserver(), "observer", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNotifyManager__RemoveService__INotifyObserver(), null, "removeService", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getINotifyObserver(), "observer", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getNotifyManager__SendNotifications(), null, "sendNotifications", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(calendarEntryEClass, CalendarEntry.class, "CalendarEntry", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCalendarEntry_BeginningDate(), theXMLTypePackage.getDate(), "beginningDate", null, 0, 1,
				CalendarEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalendarEntry_Name(), ecorePackage.getEString(), "name", null, 0, 1, CalendarEntry.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalendarEntry_EndDate(), theXMLTypePackage.getDate(), "endDate", null, 0, 1,
				CalendarEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(reminderEClass, Reminder.class, "Reminder", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReminder_Notifymanager(), this.getNotifyManager(), null, "notifymanager", null, 0, 1,
				Reminder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReminder_Calendarentry(), this.getCalendarEntry(), null, "calendarentry", null, 0, 1,
				Reminder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getReminder__ChooseNotificationTypes__EList(), null, "chooseNotificationTypes", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEEList());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "types", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getReminder__Remind__CalendarEntry(), null, "remind", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCalendarEntry(), "entry", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //NotificationServicePackageImpl
