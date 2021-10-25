/**
 */
package webpage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see webpage.WebpageFactory
 * @model kind="package"
 * @generated
 */
public interface WebpagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "webpage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/webpage";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "webpage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WebpagePackage eINSTANCE = webpage.impl.WebpagePackageImpl.init();

	/**
	 * The meta object id for the '{@link webpage.AdapterInterface <em>Adapter Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webpage.AdapterInterface
	 * @see webpage.impl.WebpagePackageImpl#getAdapterInterface()
	 * @generated
	 */
	int ADAPTER_INTERFACE = 0;

	/**
	 * The number of structural features of the '<em>Adapter Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link webpage.impl.GoogleCalendarImporterAdapterImpl <em>Google Calendar Importer Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webpage.impl.GoogleCalendarImporterAdapterImpl
	 * @see webpage.impl.WebpagePackageImpl#getGoogleCalendarImporterAdapter()
	 * @generated
	 */
	int GOOGLE_CALENDAR_IMPORTER_ADAPTER = 1;

	/**
	 * The feature id for the '<em><b>Calendarimporter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOOGLE_CALENDAR_IMPORTER_ADAPTER__CALENDARIMPORTER = ADAPTER_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Merger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOOGLE_CALENDAR_IMPORTER_ADAPTER__MERGER = ADAPTER_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Google Calendar Importer Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOOGLE_CALENDAR_IMPORTER_ADAPTER_FEATURE_COUNT = ADAPTER_INTERFACE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link webpage.impl.CalendarMergerImpl <em>Calendar Merger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webpage.impl.CalendarMergerImpl
	 * @see webpage.impl.WebpagePackageImpl#getCalendarMerger()
	 * @generated
	 */
	int CALENDAR_MERGER = 2;

	/**
	 * The number of structural features of the '<em>Calendar Merger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_MERGER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link webpage.impl.CalendarDataImpl <em>Calendar Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webpage.impl.CalendarDataImpl
	 * @see webpage.impl.WebpagePackageImpl#getCalendarData()
	 * @generated
	 */
	int CALENDAR_DATA = 3;

	/**
	 * The number of structural features of the '<em>Calendar Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_DATA_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link webpage.impl.OutlookImporterAdapterImpl <em>Outlook Importer Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webpage.impl.OutlookImporterAdapterImpl
	 * @see webpage.impl.WebpagePackageImpl#getOutlookImporterAdapter()
	 * @generated
	 */
	int OUTLOOK_IMPORTER_ADAPTER = 4;

	/**
	 * The feature id for the '<em><b>Merger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLOOK_IMPORTER_ADAPTER__MERGER = ADAPTER_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Calendarmerger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLOOK_IMPORTER_ADAPTER__CALENDARMERGER = ADAPTER_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Outlook Importer Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLOOK_IMPORTER_ADAPTER_FEATURE_COUNT = ADAPTER_INTERFACE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link webpage.impl.CalendarExporterImpl <em>Calendar Exporter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webpage.impl.CalendarExporterImpl
	 * @see webpage.impl.WebpagePackageImpl#getCalendarExporter()
	 * @generated
	 */
	int CALENDAR_EXPORTER = 5;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_EXPORTER__STRATEGY = 0;

	/**
	 * The feature id for the '<em><b>Exportstrategy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_EXPORTER__EXPORTSTRATEGY = 1;

	/**
	 * The number of structural features of the '<em>Calendar Exporter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_EXPORTER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link webpage.ExportStrategy <em>Export Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webpage.ExportStrategy
	 * @see webpage.impl.WebpagePackageImpl#getExportStrategy()
	 * @generated
	 */
	int EXPORT_STRATEGY = 6;

	/**
	 * The number of structural features of the '<em>Export Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_STRATEGY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link webpage.impl.GoogleCalendarExportStrategyImpl <em>Google Calendar Export Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webpage.impl.GoogleCalendarExportStrategyImpl
	 * @see webpage.impl.WebpagePackageImpl#getGoogleCalendarExportStrategy()
	 * @generated
	 */
	int GOOGLE_CALENDAR_EXPORT_STRATEGY = 7;

	/**
	 * The number of structural features of the '<em>Google Calendar Export Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOOGLE_CALENDAR_EXPORT_STRATEGY_FEATURE_COUNT = EXPORT_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link webpage.impl.OutlookExportStrategyImpl <em>Outlook Export Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webpage.impl.OutlookExportStrategyImpl
	 * @see webpage.impl.WebpagePackageImpl#getOutlookExportStrategy()
	 * @generated
	 */
	int OUTLOOK_EXPORT_STRATEGY = 8;

	/**
	 * The number of structural features of the '<em>Outlook Export Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLOOK_EXPORT_STRATEGY_FEATURE_COUNT = EXPORT_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link webpage.AdapterInterface <em>Adapter Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adapter Interface</em>'.
	 * @see webpage.AdapterInterface
	 * @generated
	 */
	EClass getAdapterInterface();

	/**
	 * Returns the meta object for class '{@link webpage.GoogleCalendarImporterAdapter <em>Google Calendar Importer Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Google Calendar Importer Adapter</em>'.
	 * @see webpage.GoogleCalendarImporterAdapter
	 * @generated
	 */
	EClass getGoogleCalendarImporterAdapter();

	/**
	 * Returns the meta object for the reference '{@link webpage.GoogleCalendarImporterAdapter#getCalendarimporter <em>Calendarimporter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Calendarimporter</em>'.
	 * @see webpage.GoogleCalendarImporterAdapter#getCalendarimporter()
	 * @see #getGoogleCalendarImporterAdapter()
	 * @generated
	 */
	EReference getGoogleCalendarImporterAdapter_Calendarimporter();

	/**
	 * Returns the meta object for the attribute '{@link webpage.GoogleCalendarImporterAdapter#getMerger <em>Merger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Merger</em>'.
	 * @see webpage.GoogleCalendarImporterAdapter#getMerger()
	 * @see #getGoogleCalendarImporterAdapter()
	 * @generated
	 */
	EAttribute getGoogleCalendarImporterAdapter_Merger();

	/**
	 * Returns the meta object for class '{@link webpage.CalendarMerger <em>Calendar Merger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calendar Merger</em>'.
	 * @see webpage.CalendarMerger
	 * @generated
	 */
	EClass getCalendarMerger();

	/**
	 * Returns the meta object for class '{@link webpage.CalendarData <em>Calendar Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calendar Data</em>'.
	 * @see webpage.CalendarData
	 * @generated
	 */
	EClass getCalendarData();

	/**
	 * Returns the meta object for class '{@link webpage.OutlookImporterAdapter <em>Outlook Importer Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outlook Importer Adapter</em>'.
	 * @see webpage.OutlookImporterAdapter
	 * @generated
	 */
	EClass getOutlookImporterAdapter();

	/**
	 * Returns the meta object for the attribute '{@link webpage.OutlookImporterAdapter#getMerger <em>Merger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Merger</em>'.
	 * @see webpage.OutlookImporterAdapter#getMerger()
	 * @see #getOutlookImporterAdapter()
	 * @generated
	 */
	EAttribute getOutlookImporterAdapter_Merger();

	/**
	 * Returns the meta object for the reference '{@link webpage.OutlookImporterAdapter#getCalendarmerger <em>Calendarmerger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Calendarmerger</em>'.
	 * @see webpage.OutlookImporterAdapter#getCalendarmerger()
	 * @see #getOutlookImporterAdapter()
	 * @generated
	 */
	EReference getOutlookImporterAdapter_Calendarmerger();

	/**
	 * Returns the meta object for class '{@link webpage.CalendarExporter <em>Calendar Exporter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calendar Exporter</em>'.
	 * @see webpage.CalendarExporter
	 * @generated
	 */
	EClass getCalendarExporter();

	/**
	 * Returns the meta object for the attribute '{@link webpage.CalendarExporter#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy</em>'.
	 * @see webpage.CalendarExporter#getStrategy()
	 * @see #getCalendarExporter()
	 * @generated
	 */
	EAttribute getCalendarExporter_Strategy();

	/**
	 * Returns the meta object for the containment reference list '{@link webpage.CalendarExporter#getExportstrategy <em>Exportstrategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exportstrategy</em>'.
	 * @see webpage.CalendarExporter#getExportstrategy()
	 * @see #getCalendarExporter()
	 * @generated
	 */
	EReference getCalendarExporter_Exportstrategy();

	/**
	 * Returns the meta object for class '{@link webpage.ExportStrategy <em>Export Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Export Strategy</em>'.
	 * @see webpage.ExportStrategy
	 * @generated
	 */
	EClass getExportStrategy();

	/**
	 * Returns the meta object for class '{@link webpage.GoogleCalendarExportStrategy <em>Google Calendar Export Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Google Calendar Export Strategy</em>'.
	 * @see webpage.GoogleCalendarExportStrategy
	 * @generated
	 */
	EClass getGoogleCalendarExportStrategy();

	/**
	 * Returns the meta object for class '{@link webpage.OutlookExportStrategy <em>Outlook Export Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outlook Export Strategy</em>'.
	 * @see webpage.OutlookExportStrategy
	 * @generated
	 */
	EClass getOutlookExportStrategy();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WebpageFactory getWebpageFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link webpage.AdapterInterface <em>Adapter Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webpage.AdapterInterface
		 * @see webpage.impl.WebpagePackageImpl#getAdapterInterface()
		 * @generated
		 */
		EClass ADAPTER_INTERFACE = eINSTANCE.getAdapterInterface();

		/**
		 * The meta object literal for the '{@link webpage.impl.GoogleCalendarImporterAdapterImpl <em>Google Calendar Importer Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webpage.impl.GoogleCalendarImporterAdapterImpl
		 * @see webpage.impl.WebpagePackageImpl#getGoogleCalendarImporterAdapter()
		 * @generated
		 */
		EClass GOOGLE_CALENDAR_IMPORTER_ADAPTER = eINSTANCE.getGoogleCalendarImporterAdapter();

		/**
		 * The meta object literal for the '<em><b>Calendarimporter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOOGLE_CALENDAR_IMPORTER_ADAPTER__CALENDARIMPORTER = eINSTANCE
				.getGoogleCalendarImporterAdapter_Calendarimporter();

		/**
		 * The meta object literal for the '<em><b>Merger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOOGLE_CALENDAR_IMPORTER_ADAPTER__MERGER = eINSTANCE.getGoogleCalendarImporterAdapter_Merger();

		/**
		 * The meta object literal for the '{@link webpage.impl.CalendarMergerImpl <em>Calendar Merger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webpage.impl.CalendarMergerImpl
		 * @see webpage.impl.WebpagePackageImpl#getCalendarMerger()
		 * @generated
		 */
		EClass CALENDAR_MERGER = eINSTANCE.getCalendarMerger();

		/**
		 * The meta object literal for the '{@link webpage.impl.CalendarDataImpl <em>Calendar Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webpage.impl.CalendarDataImpl
		 * @see webpage.impl.WebpagePackageImpl#getCalendarData()
		 * @generated
		 */
		EClass CALENDAR_DATA = eINSTANCE.getCalendarData();

		/**
		 * The meta object literal for the '{@link webpage.impl.OutlookImporterAdapterImpl <em>Outlook Importer Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webpage.impl.OutlookImporterAdapterImpl
		 * @see webpage.impl.WebpagePackageImpl#getOutlookImporterAdapter()
		 * @generated
		 */
		EClass OUTLOOK_IMPORTER_ADAPTER = eINSTANCE.getOutlookImporterAdapter();

		/**
		 * The meta object literal for the '<em><b>Merger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTLOOK_IMPORTER_ADAPTER__MERGER = eINSTANCE.getOutlookImporterAdapter_Merger();

		/**
		 * The meta object literal for the '<em><b>Calendarmerger</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTLOOK_IMPORTER_ADAPTER__CALENDARMERGER = eINSTANCE.getOutlookImporterAdapter_Calendarmerger();

		/**
		 * The meta object literal for the '{@link webpage.impl.CalendarExporterImpl <em>Calendar Exporter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webpage.impl.CalendarExporterImpl
		 * @see webpage.impl.WebpagePackageImpl#getCalendarExporter()
		 * @generated
		 */
		EClass CALENDAR_EXPORTER = eINSTANCE.getCalendarExporter();

		/**
		 * The meta object literal for the '<em><b>Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR_EXPORTER__STRATEGY = eINSTANCE.getCalendarExporter_Strategy();

		/**
		 * The meta object literal for the '<em><b>Exportstrategy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALENDAR_EXPORTER__EXPORTSTRATEGY = eINSTANCE.getCalendarExporter_Exportstrategy();

		/**
		 * The meta object literal for the '{@link webpage.ExportStrategy <em>Export Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webpage.ExportStrategy
		 * @see webpage.impl.WebpagePackageImpl#getExportStrategy()
		 * @generated
		 */
		EClass EXPORT_STRATEGY = eINSTANCE.getExportStrategy();

		/**
		 * The meta object literal for the '{@link webpage.impl.GoogleCalendarExportStrategyImpl <em>Google Calendar Export Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webpage.impl.GoogleCalendarExportStrategyImpl
		 * @see webpage.impl.WebpagePackageImpl#getGoogleCalendarExportStrategy()
		 * @generated
		 */
		EClass GOOGLE_CALENDAR_EXPORT_STRATEGY = eINSTANCE.getGoogleCalendarExportStrategy();

		/**
		 * The meta object literal for the '{@link webpage.impl.OutlookExportStrategyImpl <em>Outlook Export Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webpage.impl.OutlookExportStrategyImpl
		 * @see webpage.impl.WebpagePackageImpl#getOutlookExportStrategy()
		 * @generated
		 */
		EClass OUTLOOK_EXPORT_STRATEGY = eINSTANCE.getOutlookExportStrategy();

	}

} //WebpagePackage
