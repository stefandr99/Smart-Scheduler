/**
 */
package scheduler.mergebuilder.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import scheduler.mergebuilder.Builder;
import scheduler.mergebuilder.Director;
import scheduler.mergebuilder.MergeSchedule;
import scheduler.mergebuilder.MergebuilderFactory;
import scheduler.mergebuilder.MergebuilderPackage;

import scheduler.mergetemplate.MergetemplatePackage;

import scheduler.mergetemplate.impl.MergetemplatePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MergebuilderPackageImpl extends EPackageImpl implements MergebuilderPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass builderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergeScheduleEClass = null;

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
	 * @see scheduler.mergebuilder.MergebuilderPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MergebuilderPackageImpl() {
		super(eNS_URI, MergebuilderFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MergebuilderPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MergebuilderPackage init() {
		if (isInited) return (MergebuilderPackage)EPackage.Registry.INSTANCE.getEPackage(MergebuilderPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMergebuilderPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MergebuilderPackageImpl theMergebuilderPackage = registeredMergebuilderPackage instanceof MergebuilderPackageImpl ? (MergebuilderPackageImpl)registeredMergebuilderPackage : new MergebuilderPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MergetemplatePackage.eNS_URI);
		MergetemplatePackageImpl theMergetemplatePackage = (MergetemplatePackageImpl)(registeredPackage instanceof MergetemplatePackageImpl ? registeredPackage : MergetemplatePackage.eINSTANCE);

		// Create package meta-data objects
		theMergebuilderPackage.createPackageContents();
		theMergetemplatePackage.createPackageContents();

		// Initialize created meta-data
		theMergebuilderPackage.initializePackageContents();
		theMergetemplatePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMergebuilderPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MergebuilderPackage.eNS_URI, theMergebuilderPackage);
		return theMergebuilderPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirector() {
		return directorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDirector__MergeSchedule__Builder() {
		return directorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuilder() {
		return builderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBuilder__Reset() {
		return builderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBuilder__ImportCalendar__Object() {
		return builderEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBuilder__ParseCalenar__Object() {
		return builderEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBuilder__AddActivity__Object() {
		return builderEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMergeSchedule() {
		return mergeScheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMergeSchedule_ResultCalendar() {
		return (EAttribute)mergeScheduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMergeSchedule__GenerateCalendar() {
		return mergeScheduleEClass.getEOperations().get(0);
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
	public MergebuilderFactory getMergebuilderFactory() {
		return (MergebuilderFactory)getEFactoryInstance();
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
		directorEClass = createEClass(DIRECTOR);
		createEOperation(directorEClass, DIRECTOR___MERGE_SCHEDULE__BUILDER);

		builderEClass = createEClass(BUILDER);
		createEOperation(builderEClass, BUILDER___RESET);
		createEOperation(builderEClass, BUILDER___IMPORT_CALENDAR__OBJECT);
		createEOperation(builderEClass, BUILDER___PARSE_CALENAR__OBJECT);
		createEOperation(builderEClass, BUILDER___ADD_ACTIVITY__OBJECT);

		mergeScheduleEClass = createEClass(MERGE_SCHEDULE);
		createEAttribute(mergeScheduleEClass, MERGE_SCHEDULE__RESULT_CALENDAR);
		createEOperation(mergeScheduleEClass, MERGE_SCHEDULE___GENERATE_CALENDAR);

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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mergeScheduleEClass.getESuperTypes().add(this.getBuilder());

		// Initialize classes, features, and operations; add parameters
		initEClass(directorEClass, Director.class, "Director", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getDirector__MergeSchedule__Builder(), null, "mergeSchedule", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBuilder(), "builder", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(builderEClass, Builder.class, "Builder", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getBuilder__Reset(), null, "reset", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBuilder__ImportCalendar__Object(), null, "importCalendar", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCalendar(), "calendar", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBuilder__ParseCalenar__Object(), null, "parseCalenar", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCalendar(), "calendar", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBuilder__AddActivity__Object(), null, "addActivity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCalendar(), "calenar", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mergeScheduleEClass, MergeSchedule.class, "MergeSchedule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMergeSchedule_ResultCalendar(), this.getCalendar(), "resultCalendar", null, 0, 1, MergeSchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getMergeSchedule__GenerateCalendar(), this.getCalendar(), "generateCalendar", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(calendarEDataType, Object.class, "Calendar", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //MergebuilderPackageImpl
