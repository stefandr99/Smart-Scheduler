/**
 */
package webpage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Google Calendar Importer Adapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webpage.GoogleCalendarImporterAdapter#getCalendarimporter <em>Calendarimporter</em>}</li>
 *   <li>{@link webpage.GoogleCalendarImporterAdapter#getMerger <em>Merger</em>}</li>
 * </ul>
 *
 * @see webpage.WebpagePackage#getGoogleCalendarImporterAdapter()
 * @model
 * @generated
 */
public interface GoogleCalendarImporterAdapter extends AdapterInterface {
	/**
	 * Returns the value of the '<em><b>Calendarimporter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calendarimporter</em>' reference.
	 * @see #setCalendarimporter(CalendarMerger)
	 * @see webpage.WebpagePackage#getGoogleCalendarImporterAdapter_Calendarimporter()
	 * @model
	 * @generated
	 */
	CalendarMerger getCalendarimporter();

	/**
	 * Sets the value of the '{@link webpage.GoogleCalendarImporterAdapter#getCalendarimporter <em>Calendarimporter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calendarimporter</em>' reference.
	 * @see #getCalendarimporter()
	 * @generated
	 */
	void setCalendarimporter(CalendarMerger value);

	/**
	 * Returns the value of the '<em><b>Merger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merger</em>' attribute.
	 * @see #setMerger(Object)
	 * @see webpage.WebpagePackage#getGoogleCalendarImporterAdapter_Merger()
	 * @model
	 * @generated
	 */
	Object getMerger();

	/**
	 * Sets the value of the '{@link webpage.GoogleCalendarImporterAdapter#getMerger <em>Merger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merger</em>' attribute.
	 * @see #getMerger()
	 * @generated
	 */
	void setMerger(Object value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CalendarData import_(String data);

} // GoogleCalendarImporterAdapter
