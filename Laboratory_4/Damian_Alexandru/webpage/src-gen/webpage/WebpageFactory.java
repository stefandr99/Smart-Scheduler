/**
 */
package webpage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see webpage.WebpagePackage
 * @generated
 */
public interface WebpageFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WebpageFactory eINSTANCE = webpage.impl.WebpageFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Google Calendar Importer Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Google Calendar Importer Adapter</em>'.
	 * @generated
	 */
	GoogleCalendarImporterAdapter createGoogleCalendarImporterAdapter();

	/**
	 * Returns a new object of class '<em>Calendar Merger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calendar Merger</em>'.
	 * @generated
	 */
	CalendarMerger createCalendarMerger();

	/**
	 * Returns a new object of class '<em>Calendar Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calendar Data</em>'.
	 * @generated
	 */
	CalendarData createCalendarData();

	/**
	 * Returns a new object of class '<em>Outlook Importer Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Outlook Importer Adapter</em>'.
	 * @generated
	 */
	OutlookImporterAdapter createOutlookImporterAdapter();

	/**
	 * Returns a new object of class '<em>Calendar Exporter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calendar Exporter</em>'.
	 * @generated
	 */
	CalendarExporter createCalendarExporter();

	/**
	 * Returns a new object of class '<em>Google Calendar Export Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Google Calendar Export Strategy</em>'.
	 * @generated
	 */
	GoogleCalendarExportStrategy createGoogleCalendarExportStrategy();

	/**
	 * Returns a new object of class '<em>Outlook Export Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Outlook Export Strategy</em>'.
	 * @generated
	 */
	OutlookExportStrategy createOutlookExportStrategy();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WebpagePackage getWebpagePackage();

} //WebpageFactory
