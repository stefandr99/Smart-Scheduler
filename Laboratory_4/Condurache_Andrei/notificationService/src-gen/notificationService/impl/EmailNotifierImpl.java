/**
 */
package notificationService.impl;

import java.lang.reflect.InvocationTargetException;

import notificationService.EmailNotifier;
import notificationService.NotificationServicePackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Email Notifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EmailNotifierImpl extends MinimalEObjectImpl.Container implements EmailNotifier {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmailNotifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NotificationServicePackage.Literals.EMAIL_NOTIFIER;
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
		case NotificationServicePackage.EMAIL_NOTIFIER___NOTIFY:
			notify();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //EmailNotifierImpl
