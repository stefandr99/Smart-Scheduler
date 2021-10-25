/**
 */
package notificationService.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.List;

import notificationService.INotifyObserver;
import notificationService.NotificationServicePackage;
import notificationService.NotifyManager;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Notify Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link notificationService.impl.NotifyManagerImpl#getInotifyobserver <em>Inotifyobserver</em>}</li>
 *   <li>{@link notificationService.impl.NotifyManagerImpl#getObserversList <em>Observers List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NotifyManagerImpl extends MinimalEObjectImpl.Container implements NotifyManager {
	/**
	 * The cached value of the '{@link #getInotifyobserver() <em>Inotifyobserver</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInotifyobserver()
	 * @generated
	 * @ordered
	 */
	protected EList<INotifyObserver> inotifyobserver;

	/**
	 * The default value of the '{@link #getObserversList() <em>Observers List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObserversList()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> OBSERVERS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObserversList() <em>Observers List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObserversList()
	 * @generated
	 * @ordered
	 */
	protected List<String> observersList = OBSERVERS_LIST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotifyManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NotificationServicePackage.Literals.NOTIFY_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<INotifyObserver> getInotifyobserver() {
		if (inotifyobserver == null) {
			inotifyobserver = new EObjectContainmentEList<INotifyObserver>(INotifyObserver.class, this,
					NotificationServicePackage.NOTIFY_MANAGER__INOTIFYOBSERVER);
		}
		return inotifyobserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getObserversList() {
		return observersList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObserversList(List<String> newObserversList) {
		List<String> oldObserversList = observersList;
		observersList = newObserversList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					NotificationServicePackage.NOTIFY_MANAGER__OBSERVERS_LIST, oldObserversList, observersList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addService(INotifyObserver observer) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeService(INotifyObserver observer) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void sendNotifications() {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case NotificationServicePackage.NOTIFY_MANAGER__INOTIFYOBSERVER:
			return ((InternalEList<?>) getInotifyobserver()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case NotificationServicePackage.NOTIFY_MANAGER__INOTIFYOBSERVER:
			return getInotifyobserver();
		case NotificationServicePackage.NOTIFY_MANAGER__OBSERVERS_LIST:
			return getObserversList();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case NotificationServicePackage.NOTIFY_MANAGER__INOTIFYOBSERVER:
			getInotifyobserver().clear();
			getInotifyobserver().addAll((Collection<? extends INotifyObserver>) newValue);
			return;
		case NotificationServicePackage.NOTIFY_MANAGER__OBSERVERS_LIST:
			setObserversList((List<String>) newValue);
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
		case NotificationServicePackage.NOTIFY_MANAGER__INOTIFYOBSERVER:
			getInotifyobserver().clear();
			return;
		case NotificationServicePackage.NOTIFY_MANAGER__OBSERVERS_LIST:
			setObserversList(OBSERVERS_LIST_EDEFAULT);
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
		case NotificationServicePackage.NOTIFY_MANAGER__INOTIFYOBSERVER:
			return inotifyobserver != null && !inotifyobserver.isEmpty();
		case NotificationServicePackage.NOTIFY_MANAGER__OBSERVERS_LIST:
			return OBSERVERS_LIST_EDEFAULT == null ? observersList != null
					: !OBSERVERS_LIST_EDEFAULT.equals(observersList);
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
		case NotificationServicePackage.NOTIFY_MANAGER___ADD_SERVICE__INOTIFYOBSERVER:
			addService((INotifyObserver) arguments.get(0));
			return null;
		case NotificationServicePackage.NOTIFY_MANAGER___REMOVE_SERVICE__INOTIFYOBSERVER:
			removeService((INotifyObserver) arguments.get(0));
			return null;
		case NotificationServicePackage.NOTIFY_MANAGER___SEND_NOTIFICATIONS:
			sendNotifications();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (observersList: ");
		result.append(observersList);
		result.append(')');
		return result.toString();
	}

} //NotifyManagerImpl
