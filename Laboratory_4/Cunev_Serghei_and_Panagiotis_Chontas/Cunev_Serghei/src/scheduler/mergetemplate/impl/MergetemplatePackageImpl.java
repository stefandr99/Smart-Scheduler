/**
 */
package scheduler.mergetemplate.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import scheduler.mergebuilder.MergebuilderPackage;

import scheduler.mergebuilder.impl.MergebuilderPackageImpl;

import scheduler.mergetemplate.AddToCurrentCalendar;
import scheduler.mergetemplate.MergeCalendars;
import scheduler.mergetemplate.MergeTemplate;
import scheduler.mergetemplate.MergetemplateFactory;
import scheduler.mergetemplate.MergetemplatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MergetemplatePackageImpl extends EPackageImpl implements MergetemplatePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addToCurrentCalendarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergeCalendarsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergeTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType calendarEDataType = null;

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
	 * @see scheduler.mergetemplate.MergetemplatePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MergetemplatePackageImpl() {
		super(eNS_URI, MergetemplateFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MergetemplatePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MergetemplatePackage init() {
		if (isInited) return (MergetemplatePackage)EPackage.Registry.INSTANCE.getEPackage(MergetemplatePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMergetemplatePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MergetemplatePackageImpl theMergetemplatePackage = registeredMergetemplatePackage instanceof MergetemplatePackageImpl ? (MergetemplatePackageImpl)registeredMergetemplatePackage : new MergetemplatePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MergebuilderPackage.eNS_URI);
		MergebuilderPackageImpl theMergebuilderPackage = (MergebuilderPackageImpl)(registeredPackage instanceof MergebuilderPackageImpl ? registeredPackage : MergebuilderPackage.eINSTANCE);

		// Create package meta-data objects
		theMergetemplatePackage.createPackageContents();
		theMergebuilderPackage.createPackageContents();

		// Initialize created meta-data
		theMergetemplatePackage.initializePackageContents();
		theMergebuilderPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMergetemplatePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MergetemplatePackage.eNS_URI, theMergetemplatePackage);
		return theMergetemplatePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddToCurrentCalendar() {
		return addToCurrentCalendarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMergeCalendars() {
		return mergeCalendarsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMergeTemplate() {
		return mergeTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMergeTemplate_ResultCalendar() {
		return (EAttribute)mergeTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMergeTemplate_ImportedCalendar() {
		return (EAttribute)mergeTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMergeTemplate_CurrentCalendar() {
		return (EAttribute)mergeTemplateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMergeTemplate__ImportCalendar__Object() {
		return mergeTemplateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMergeTemplate__ParseCalenar__Object() {
		return mergeTemplateEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMergeTemplate__AddActivity__Object() {
		return mergeTemplateEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMergeTemplate__GenerateCalendar() {
		return mergeTemplateEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMergeTemplate__Reset() {
		return mergeTemplateEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCalendar() {
		return calendarEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergetemplateFactory getMergetemplateFactory() {
		return (MergetemplateFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		addToCurrentCalendarEClass = createEClass(ADD_TO_CURRENT_CALENDAR);

		mergeCalendarsEClass = createEClass(MERGE_CALENDARS);

		mergeTemplateEClass = createEClass(MERGE_TEMPLATE);
		createEAttribute(mergeTemplateEClass, MERGE_TEMPLATE__RESULT_CALENDAR);
		createEAttribute(mergeTemplateEClass, MERGE_TEMPLATE__IMPORTED_CALENDAR);
		createEAttribute(mergeTemplateEClass, MERGE_TEMPLATE__CURRENT_CALENDAR);
		createEOperation(mergeTemplateEClass, MERGE_TEMPLATE___IMPORT_CALENDAR__OBJECT);
		createEOperation(mergeTemplateEClass, MERGE_TEMPLATE___PARSE_CALENAR__OBJECT);
		createEOperation(mergeTemplateEClass, MERGE_TEMPLATE___ADD_ACTIVITY__OBJECT);
		createEOperation(mergeTemplateEClass, MERGE_TEMPLATE___GENERATE_CALENDAR);
		createEOperation(mergeTemplateEClass, MERGE_TEMPLATE___RESET);

		// Create data types
		calendarEDataType = createEDataType(CALENDAR);
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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		MergebuilderPackage theMergebuilderPackage = (MergebuilderPackage)EPackage.Registry.INSTANCE.getEPackage(MergebuilderPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		addToCurrentCalendarEClass.getESuperTypes().add(this.getMergeTemplate());
		mergeCalendarsEClass.getESuperTypes().add(this.getMergeTemplate());

		// Initialize classes, features, and operations; add parameters
		initEClass(addToCurrentCalendarEClass, AddToCurrentCalendar.class, "AddToCurrentCalendar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mergeCalendarsEClass, MergeCalendars.class, "MergeCalendars", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mergeTemplateEClass, MergeTemplate.class, "MergeTemplate", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMergeTemplate_ResultCalendar(), theMergebuilderPackage.getCalendar(), "resultCalendar", null, 0, 1, MergeTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeTemplate_ImportedCalendar(), theMergebuilderPackage.getCalendar(), "importedCalendar", null, 0, 1, MergeTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeTemplate_CurrentCalendar(), theMergebuilderPackage.getCalendar(), "currentCalendar", null, 0, 1, MergeTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getMergeTemplate__ImportCalendar__Object(), null, "importCalendar", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMergebuilderPackage.getCalendar(), "calendar", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMergeTemplate__ParseCalenar__Object(), null, "parseCalenar", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMergebuilderPackage.getCalendar(), "calendar", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMergeTemplate__AddActivity__Object(), null, "addActivity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMergebuilderPackage.getCalendar(), "calendar", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMergeTemplate__GenerateCalendar(), theMergebuilderPackage.getCalendar(), "generateCalendar", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMergeTemplate__Reset(), null, "reset", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(calendarEDataType, Object.class, "Calendar", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //MergetemplatePackageImpl
