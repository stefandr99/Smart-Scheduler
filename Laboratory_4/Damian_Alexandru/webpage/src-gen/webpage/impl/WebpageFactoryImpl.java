/**
 */
package webpage.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import webpage.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WebpageFactoryImpl extends EFactoryImpl implements WebpageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WebpageFactory init() {
		try {
			WebpageFactory theWebpageFactory = (WebpageFactory) EPackage.Registry.INSTANCE
					.getEFactory(WebpagePackage.eNS_URI);
			if (theWebpageFactory != null) {
				return theWebpageFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WebpageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebpageFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case WebpagePackage.GOOGLE_CALENDAR_IMPORTER_ADAPTER:
			return createGoogleCalendarImporterAdapter();
		case WebpagePackage.CALENDAR_MERGER:
			return createCalendarMerger();
		case WebpagePackage.CALENDAR_DATA:
			return createCalendarData();
		case WebpagePackage.OUTLOOK_IMPORTER_ADAPTER:
			return createOutlookImporterAdapter();
		case WebpagePackage.CALENDAR_EXPORTER:
			return createCalendarExporter();
		case WebpagePackage.GOOGLE_CALENDAR_EXPORT_STRATEGY:
			return createGoogleCalendarExportStrategy();
		case WebpagePackage.OUTLOOK_EXPORT_STRATEGY:
			return createOutlookExportStrategy();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoogleCalendarImporterAdapter createGoogleCalendarImporterAdapter() {
		GoogleCalendarImporterAdapterImpl googleCalendarImporterAdapter = new GoogleCalendarImporterAdapterImpl();
		return googleCalendarImporterAdapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalendarMerger createCalendarMerger() {
		CalendarMergerImpl calendarMerger = new CalendarMergerImpl();
		return calendarMerger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalendarData createCalendarData() {
		CalendarDataImpl calendarData = new CalendarDataImpl();
		return calendarData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutlookImporterAdapter createOutlookImporterAdapter() {
		OutlookImporterAdapterImpl outlookImporterAdapter = new OutlookImporterAdapterImpl();
		return outlookImporterAdapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalendarExporter createCalendarExporter() {
		CalendarExporterImpl calendarExporter = new CalendarExporterImpl();
		return calendarExporter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoogleCalendarExportStrategy createGoogleCalendarExportStrategy() {
		GoogleCalendarExportStrategyImpl googleCalendarExportStrategy = new GoogleCalendarExportStrategyImpl();
		return googleCalendarExportStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutlookExportStrategy createOutlookExportStrategy() {
		OutlookExportStrategyImpl outlookExportStrategy = new OutlookExportStrategyImpl();
		return outlookExportStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebpagePackage getWebpagePackage() {
		return (WebpagePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static WebpagePackage getPackage() {
		return WebpagePackage.eINSTANCE;
	}

} //WebpageFactoryImpl
