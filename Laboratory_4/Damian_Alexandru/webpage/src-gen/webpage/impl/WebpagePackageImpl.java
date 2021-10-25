/**
 */
package webpage.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import webpage.AdapterInterface;
import webpage.CalendarData;
import webpage.CalendarExporter;
import webpage.CalendarMerger;
import webpage.ExportStrategy;
import webpage.GoogleCalendarExportStrategy;
import webpage.GoogleCalendarImporterAdapter;
import webpage.OutlookExportStrategy;
import webpage.OutlookImporterAdapter;
import webpage.WebpageFactory;
import webpage.WebpagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WebpagePackageImpl extends EPackageImpl implements WebpagePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adapterInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass googleCalendarImporterAdapterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calendarMergerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calendarDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outlookImporterAdapterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calendarExporterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exportStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass googleCalendarExportStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outlookExportStrategyEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see webpage.WebpagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WebpagePackageImpl() {
		super(eNS_URI, WebpageFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link WebpagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WebpagePackage init() {
		if (isInited)
			return (WebpagePackage) EPackage.Registry.INSTANCE.getEPackage(WebpagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredWebpagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		WebpagePackageImpl theWebpagePackage = registeredWebpagePackage instanceof WebpagePackageImpl
				? (WebpagePackageImpl) registeredWebpagePackage
				: new WebpagePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theWebpagePackage.createPackageContents();

		// Initialize created meta-data
		theWebpagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWebpagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WebpagePackage.eNS_URI, theWebpagePackage);
		return theWebpagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdapterInterface() {
		return adapterInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoogleCalendarImporterAdapter() {
		return googleCalendarImporterAdapterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoogleCalendarImporterAdapter_Calendarimporter() {
		return (EReference) googleCalendarImporterAdapterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGoogleCalendarImporterAdapter_Merger() {
		return (EAttribute) googleCalendarImporterAdapterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalendarMerger() {
		return calendarMergerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalendarData() {
		return calendarDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutlookImporterAdapter() {
		return outlookImporterAdapterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutlookImporterAdapter_Merger() {
		return (EAttribute) outlookImporterAdapterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutlookImporterAdapter_Calendarmerger() {
		return (EReference) outlookImporterAdapterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalendarExporter() {
		return calendarExporterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalendarExporter_Strategy() {
		return (EAttribute) calendarExporterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalendarExporter_Exportstrategy() {
		return (EReference) calendarExporterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExportStrategy() {
		return exportStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoogleCalendarExportStrategy() {
		return googleCalendarExportStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutlookExportStrategy() {
		return outlookExportStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebpageFactory getWebpageFactory() {
		return (WebpageFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		adapterInterfaceEClass = createEClass(ADAPTER_INTERFACE);

		googleCalendarImporterAdapterEClass = createEClass(GOOGLE_CALENDAR_IMPORTER_ADAPTER);
		createEReference(googleCalendarImporterAdapterEClass, GOOGLE_CALENDAR_IMPORTER_ADAPTER__CALENDARIMPORTER);
		createEAttribute(googleCalendarImporterAdapterEClass, GOOGLE_CALENDAR_IMPORTER_ADAPTER__MERGER);

		calendarMergerEClass = createEClass(CALENDAR_MERGER);

		calendarDataEClass = createEClass(CALENDAR_DATA);

		outlookImporterAdapterEClass = createEClass(OUTLOOK_IMPORTER_ADAPTER);
		createEAttribute(outlookImporterAdapterEClass, OUTLOOK_IMPORTER_ADAPTER__MERGER);
		createEReference(outlookImporterAdapterEClass, OUTLOOK_IMPORTER_ADAPTER__CALENDARMERGER);

		calendarExporterEClass = createEClass(CALENDAR_EXPORTER);
		createEAttribute(calendarExporterEClass, CALENDAR_EXPORTER__STRATEGY);
		createEReference(calendarExporterEClass, CALENDAR_EXPORTER__EXPORTSTRATEGY);

		exportStrategyEClass = createEClass(EXPORT_STRATEGY);

		googleCalendarExportStrategyEClass = createEClass(GOOGLE_CALENDAR_EXPORT_STRATEGY);

		outlookExportStrategyEClass = createEClass(OUTLOOK_EXPORT_STRATEGY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Add supertypes to classes
		googleCalendarImporterAdapterEClass.getESuperTypes().add(this.getAdapterInterface());
		outlookImporterAdapterEClass.getESuperTypes().add(this.getAdapterInterface());
		googleCalendarExportStrategyEClass.getESuperTypes().add(this.getExportStrategy());
		outlookExportStrategyEClass.getESuperTypes().add(this.getExportStrategy());

		// Initialize classes and features; add operations and parameters
		initEClass(adapterInterfaceEClass, AdapterInterface.class, "AdapterInterface", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(adapterInterfaceEClass, null, "import_");
		addEParameter(op, ecorePackage.getEString(), "data", 0, 1);

		initEClass(googleCalendarImporterAdapterEClass, GoogleCalendarImporterAdapter.class,
				"GoogleCalendarImporterAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGoogleCalendarImporterAdapter_Calendarimporter(), this.getCalendarMerger(), null,
				"calendarimporter", null, 0, 1, GoogleCalendarImporterAdapter.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGoogleCalendarImporterAdapter_Merger(), ecorePackage.getEJavaObject(), "merger", null, 0, 1,
				GoogleCalendarImporterAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(googleCalendarImporterAdapterEClass, this.getCalendarData(), "import_", 0, 1);
		addEParameter(op, ecorePackage.getEString(), "data", 0, 1);

		initEClass(calendarMergerEClass, CalendarMerger.class, "CalendarMerger", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(calendarMergerEClass, null, "add");
		addEParameter(op, this.getCalendarData(), "data", 0, 1);

		initEClass(calendarDataEClass, CalendarData.class, "CalendarData", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(outlookImporterAdapterEClass, OutlookImporterAdapter.class, "OutlookImporterAdapter", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutlookImporterAdapter_Merger(), ecorePackage.getEJavaObject(), "merger", null, 0, 1,
				OutlookImporterAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutlookImporterAdapter_Calendarmerger(), this.getCalendarMerger(), null, "calendarmerger",
				null, 0, 1, OutlookImporterAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(outlookImporterAdapterEClass, this.getCalendarData(), "import_", 0, 1);
		addEParameter(op, ecorePackage.getEString(), "data", 0, 1);

		initEClass(calendarExporterEClass, CalendarExporter.class, "CalendarExporter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCalendarExporter_Strategy(), ecorePackage.getEJavaObject(), "strategy", null, 0, 1,
				CalendarExporter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getCalendarExporter_Exportstrategy(), this.getExportStrategy(), null, "exportstrategy", null, 0,
				-1, CalendarExporter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(calendarExporterEClass, null, "setExportStrategy");
		addEParameter(op, this.getExportStrategy(), "strategy", 0, 1);

		initEClass(exportStrategyEClass, ExportStrategy.class, "ExportStrategy", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(exportStrategyEClass, null, "export");
		addEParameter(op, this.getCalendarData(), "data", 0, 1);

		initEClass(googleCalendarExportStrategyEClass, GoogleCalendarExportStrategy.class,
				"GoogleCalendarExportStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(googleCalendarExportStrategyEClass, null, "export");
		addEParameter(op, this.getCalendarData(), "data", 0, 1);

		initEClass(outlookExportStrategyEClass, OutlookExportStrategy.class, "OutlookExportStrategy", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(outlookExportStrategyEClass, null, "export");
		addEParameter(op, this.getCalendarData(), "data", 0, 1);

		// Create resource
		createResource(eNS_URI);
	}

} //WebpagePackageImpl
