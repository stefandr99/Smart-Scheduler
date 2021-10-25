/**
 */
package notificationService.util;

import notificationService.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see notificationService.NotificationServicePackage
 * @generated
 */
public class NotificationServiceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NotificationServicePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationServiceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = NotificationServicePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotificationServiceSwitch<Adapter> modelSwitch = new NotificationServiceSwitch<Adapter>() {
		@Override
		public Adapter caseINotifyObserver(INotifyObserver object) {
			return createINotifyObserverAdapter();
		}

		@Override
		public Adapter caseEmailNotifier(EmailNotifier object) {
			return createEmailNotifierAdapter();
		}

		@Override
		public Adapter caseAppNotifier(AppNotifier object) {
			return createAppNotifierAdapter();
		}

		@Override
		public Adapter caseChromeNotifier(ChromeNotifier object) {
			return createChromeNotifierAdapter();
		}

		@Override
		public Adapter caseNotifyManager(NotifyManager object) {
			return createNotifyManagerAdapter();
		}

		@Override
		public Adapter caseCalendarEntry(CalendarEntry object) {
			return createCalendarEntryAdapter();
		}

		@Override
		public Adapter caseReminder(Reminder object) {
			return createReminderAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link notificationService.INotifyObserver <em>INotify Observer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see notificationService.INotifyObserver
	 * @generated
	 */
	public Adapter createINotifyObserverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link notificationService.EmailNotifier <em>Email Notifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see notificationService.EmailNotifier
	 * @generated
	 */
	public Adapter createEmailNotifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link notificationService.AppNotifier <em>App Notifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see notificationService.AppNotifier
	 * @generated
	 */
	public Adapter createAppNotifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link notificationService.ChromeNotifier <em>Chrome Notifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see notificationService.ChromeNotifier
	 * @generated
	 */
	public Adapter createChromeNotifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link notificationService.NotifyManager <em>Notify Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see notificationService.NotifyManager
	 * @generated
	 */
	public Adapter createNotifyManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link notificationService.CalendarEntry <em>Calendar Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see notificationService.CalendarEntry
	 * @generated
	 */
	public Adapter createCalendarEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link notificationService.Reminder <em>Reminder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see notificationService.Reminder
	 * @generated
	 */
	public Adapter createReminderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //NotificationServiceAdapterFactory
