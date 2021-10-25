/**
 */
package notificationService;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calendar Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link notificationService.CalendarEntry#getBeginningDate <em>Beginning Date</em>}</li>
 *   <li>{@link notificationService.CalendarEntry#getName <em>Name</em>}</li>
 *   <li>{@link notificationService.CalendarEntry#getEndDate <em>End Date</em>}</li>
 * </ul>
 *
 * @see notificationService.NotificationServicePackage#getCalendarEntry()
 * @model
 * @generated
 */
public interface CalendarEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Beginning Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beginning Date</em>' attribute.
	 * @see #setBeginningDate(XMLGregorianCalendar)
	 * @see notificationService.NotificationServicePackage#getCalendarEntry_BeginningDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 * @generated
	 */
	XMLGregorianCalendar getBeginningDate();

	/**
	 * Sets the value of the '{@link notificationService.CalendarEntry#getBeginningDate <em>Beginning Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beginning Date</em>' attribute.
	 * @see #getBeginningDate()
	 * @generated
	 */
	void setBeginningDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see notificationService.NotificationServicePackage#getCalendarEntry_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link notificationService.CalendarEntry#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(XMLGregorianCalendar)
	 * @see notificationService.NotificationServicePackage#getCalendarEntry_EndDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 * @generated
	 */
	XMLGregorianCalendar getEndDate();

	/**
	 * Sets the value of the '{@link notificationService.CalendarEntry#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(XMLGregorianCalendar value);

} // CalendarEntry
