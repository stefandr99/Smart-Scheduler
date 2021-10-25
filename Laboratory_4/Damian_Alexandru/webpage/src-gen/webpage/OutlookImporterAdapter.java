/**
 */
package webpage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Outlook Importer Adapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webpage.OutlookImporterAdapter#getMerger <em>Merger</em>}</li>
 *   <li>{@link webpage.OutlookImporterAdapter#getCalendarmerger <em>Calendarmerger</em>}</li>
 * </ul>
 *
 * @see webpage.WebpagePackage#getOutlookImporterAdapter()
 * @model
 * @generated
 */
public interface OutlookImporterAdapter extends AdapterInterface {
	/**
	 * Returns the value of the '<em><b>Merger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merger</em>' attribute.
	 * @see #setMerger(Object)
	 * @see webpage.WebpagePackage#getOutlookImporterAdapter_Merger()
	 * @model
	 * @generated
	 */
	Object getMerger();

	/**
	 * Sets the value of the '{@link webpage.OutlookImporterAdapter#getMerger <em>Merger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merger</em>' attribute.
	 * @see #getMerger()
	 * @generated
	 */
	void setMerger(Object value);

	/**
	 * Returns the value of the '<em><b>Calendarmerger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calendarmerger</em>' reference.
	 * @see #setCalendarmerger(CalendarMerger)
	 * @see webpage.WebpagePackage#getOutlookImporterAdapter_Calendarmerger()
	 * @model
	 * @generated
	 */
	CalendarMerger getCalendarmerger();

	/**
	 * Sets the value of the '{@link webpage.OutlookImporterAdapter#getCalendarmerger <em>Calendarmerger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calendarmerger</em>' reference.
	 * @see #getCalendarmerger()
	 * @generated
	 */
	void setCalendarmerger(CalendarMerger value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CalendarData import_(String data);

} // OutlookImporterAdapter
