/**
 */
package notificationService.util;

import notificationService.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see notificationService.NotificationServicePackage
 * @generated
 */
public class NotificationServiceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NotificationServicePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationServiceSwitch() {
		if (modelPackage == null) {
			modelPackage = NotificationServicePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case NotificationServicePackage.INOTIFY_OBSERVER: {
			INotifyObserver iNotifyObserver = (INotifyObserver) theEObject;
			T result = caseINotifyObserver(iNotifyObserver);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case NotificationServicePackage.EMAIL_NOTIFIER: {
			EmailNotifier emailNotifier = (EmailNotifier) theEObject;
			T result = caseEmailNotifier(emailNotifier);
			if (result == null)
				result = caseINotifyObserver(emailNotifier);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case NotificationServicePackage.APP_NOTIFIER: {
			AppNotifier appNotifier = (AppNotifier) theEObject;
			T result = caseAppNotifier(appNotifier);
			if (result == null)
				result = caseINotifyObserver(appNotifier);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case NotificationServicePackage.CHROME_NOTIFIER: {
			ChromeNotifier chromeNotifier = (ChromeNotifier) theEObject;
			T result = caseChromeNotifier(chromeNotifier);
			if (result == null)
				result = caseINotifyObserver(chromeNotifier);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case NotificationServicePackage.NOTIFY_MANAGER: {
			NotifyManager notifyManager = (NotifyManager) theEObject;
			T result = caseNotifyManager(notifyManager);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case NotificationServicePackage.CALENDAR_ENTRY: {
			CalendarEntry calendarEntry = (CalendarEntry) theEObject;
			T result = caseCalendarEntry(calendarEntry);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case NotificationServicePackage.REMINDER: {
			Reminder reminder = (Reminder) theEObject;
			T result = caseReminder(reminder);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>INotify Observer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>INotify Observer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseINotifyObserver(INotifyObserver object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Email Notifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Email Notifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmailNotifier(EmailNotifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>App Notifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>App Notifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppNotifier(AppNotifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chrome Notifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chrome Notifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChromeNotifier(ChromeNotifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Notify Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Notify Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotifyManager(NotifyManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calendar Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calendar Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalendarEntry(CalendarEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reminder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reminder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReminder(Reminder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //NotificationServiceSwitch
