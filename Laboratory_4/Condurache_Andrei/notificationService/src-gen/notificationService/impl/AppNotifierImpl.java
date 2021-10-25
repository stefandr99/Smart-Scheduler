/**
 */
package notificationService.impl;

import java.lang.reflect.InvocationTargetException;

import notificationService.AppNotifier;
import notificationService.NotificationServicePackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>App Notifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AppNotifierImpl extends MinimalEObjectImpl.Container implements AppNotifier {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppNotifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NotificationServicePackage.Literals.APP_NOTIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void notify() {
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case NotificationServicePackage.APP_NOTIFIER___NOTIFY:
			notify();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //AppNotifierImpl
