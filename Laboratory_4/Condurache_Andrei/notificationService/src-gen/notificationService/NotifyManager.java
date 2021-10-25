/**
 */
package notificationService;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Notify Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link notificationService.NotifyManager#getInotifyobserver <em>Inotifyobserver</em>}</li>
 *   <li>{@link notificationService.NotifyManager#getObserversList <em>Observers List</em>}</li>
 * </ul>
 *
 * @see notificationService.NotificationServicePackage#getNotifyManager()
 * @model
 * @generated
 */
public interface NotifyManager extends EObject {
	/**
	 * Returns the value of the '<em><b>Inotifyobserver</b></em>' containment reference list.
	 * The list contents are of type {@link notificationService.INotifyObserver}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inotifyobserver</em>' containment reference list.
	 * @see notificationService.NotificationServicePackage#getNotifyManager_Inotifyobserver()
	 * @model containment="true"
	 * @generated
	 */
	EList<INotifyObserver> getInotifyobserver();

	/**
	 * Returns the value of the '<em><b>Observers List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observers List</em>' attribute.
	 * @see #setObserversList(List)
	 * @see notificationService.NotificationServicePackage#getNotifyManager_ObserversList()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.ENTITIES" many="false"
	 * @generated
	 */
	List<String> getObserversList();

	/**
	 * Sets the value of the '{@link notificationService.NotifyManager#getObserversList <em>Observers List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observers List</em>' attribute.
	 * @see #getObserversList()
	 * @generated
	 */
	void setObserversList(List<String> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addService(INotifyObserver observer);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeService(INotifyObserver observer);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void sendNotifications();

} // NotifyManager
