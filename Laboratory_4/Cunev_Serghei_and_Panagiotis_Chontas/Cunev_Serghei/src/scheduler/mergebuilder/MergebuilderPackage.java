/**
 */
package scheduler.mergebuilder;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see scheduler.mergebuilder.MergebuilderFactory
 * @model kind="package"
 * @generated
 */
public interface MergebuilderPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mergebuilder";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "brgbld";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mrgbld";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MergebuilderPackage eINSTANCE = scheduler.mergebuilder.impl.MergebuilderPackageImpl.init();

	/**
	 * The meta object id for the '{@link scheduler.mergebuilder.impl.DirectorImpl <em>Director</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scheduler.mergebuilder.impl.DirectorImpl
	 * @see scheduler.mergebuilder.impl.MergebuilderPackageImpl#getDirector()
	 * @generated
	 */
	int DIRECTOR = 0;

	/**
	 * The number of structural features of the '<em>Director</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTOR_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Merge Schedule</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTOR___MERGE_SCHEDULE__BUILDER = 0;

	/**
	 * The number of operations of the '<em>Director</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTOR_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link scheduler.mergebuilder.Builder <em>Builder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scheduler.mergebuilder.Builder
	 * @see scheduler.mergebuilder.impl.MergebuilderPackageImpl#getBuilder()
	 * @generated
	 */
	int BUILDER = 1;

	/**
	 * The number of structural features of the '<em>Builder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER___RESET = 0;

	/**
	 * The operation id for the '<em>Import Calendar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER___IMPORT_CALENDAR__OBJECT = 1;

	/**
	 * The operation id for the '<em>Parse Calenar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER___PARSE_CALENAR__OBJECT = 2;

	/**
	 * The operation id for the '<em>Add Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER___ADD_ACTIVITY__OBJECT = 3;

	/**
	 * The number of operations of the '<em>Builder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDER_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link scheduler.mergebuilder.impl.MergeScheduleImpl <em>Merge Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scheduler.mergebuilder.impl.MergeScheduleImpl
	 * @see scheduler.mergebuilder.impl.MergebuilderPackageImpl#getMergeSchedule()
	 * @generated
	 */
	int MERGE_SCHEDULE = 2;

	/**
	 * The feature id for the '<em><b>Result Calendar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_SCHEDULE__RESULT_CALENDAR = BUILDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Merge Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_SCHEDULE_FEATURE_COUNT = BUILDER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_SCHEDULE___RESET = BUILDER___RESET;

	/**
	 * The operation id for the '<em>Import Calendar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_SCHEDULE___IMPORT_CALENDAR__OBJECT = BUILDER___IMPORT_CALENDAR__OBJECT;

	/**
	 * The operation id for the '<em>Parse Calenar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_SCHEDULE___PARSE_CALENAR__OBJECT = BUILDER___PARSE_CALENAR__OBJECT;

	/**
	 * The operation id for the '<em>Add Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_SCHEDULE___ADD_ACTIVITY__OBJECT = BUILDER___ADD_ACTIVITY__OBJECT;

	/**
	 * The operation id for the '<em>Generate Calendar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_SCHEDULE___GENERATE_CALENDAR = BUILDER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Merge Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_SCHEDULE_OPERATION_COUNT = BUILDER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '<em>Calendar</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see scheduler.mergebuilder.impl.MergebuilderPackageImpl#getCalendar()
	 * @generated
	 */
	int CALENDAR = 3;


	/**
	 * Returns the meta object for class '{@link scheduler.mergebuilder.Director <em>Director</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Director</em>'.
	 * @see scheduler.mergebuilder.Director
	 * @generated
	 */
	EClass getDirector();

	/**
	 * Returns the meta object for the '{@link scheduler.mergebuilder.Director#mergeSchedule(scheduler.mergebuilder.Builder) <em>Merge Schedule</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Merge Schedule</em>' operation.
	 * @see scheduler.mergebuilder.Director#mergeSchedule(scheduler.mergebuilder.Builder)
	 * @generated
	 */
	EOperation getDirector__MergeSchedule__Builder();

	/**
	 * Returns the meta object for class '{@link scheduler.mergebuilder.Builder <em>Builder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Builder</em>'.
	 * @see scheduler.mergebuilder.Builder
	 * @generated
	 */
	EClass getBuilder();

	/**
	 * Returns the meta object for the '{@link scheduler.mergebuilder.Builder#reset() <em>Reset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reset</em>' operation.
	 * @see scheduler.mergebuilder.Builder#reset()
	 * @generated
	 */
	EOperation getBuilder__Reset();

	/**
	 * Returns the meta object for the '{@link scheduler.mergebuilder.Builder#importCalendar(java.lang.Object) <em>Import Calendar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Import Calendar</em>' operation.
	 * @see scheduler.mergebuilder.Builder#importCalendar(java.lang.Object)
	 * @generated
	 */
	EOperation getBuilder__ImportCalendar__Object();

	/**
	 * Returns the meta object for the '{@link scheduler.mergebuilder.Builder#parseCalenar(java.lang.Object) <em>Parse Calenar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Parse Calenar</em>' operation.
	 * @see scheduler.mergebuilder.Builder#parseCalenar(java.lang.Object)
	 * @generated
	 */
	EOperation getBuilder__ParseCalenar__Object();

	/**
	 * Returns the meta object for the '{@link scheduler.mergebuilder.Builder#addActivity(java.lang.Object) <em>Add Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Activity</em>' operation.
	 * @see scheduler.mergebuilder.Builder#addActivity(java.lang.Object)
	 * @generated
	 */
	EOperation getBuilder__AddActivity__Object();

	/**
	 * Returns the meta object for class '{@link scheduler.mergebuilder.MergeSchedule <em>Merge Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge Schedule</em>'.
	 * @see scheduler.mergebuilder.MergeSchedule
	 * @generated
	 */
	EClass getMergeSchedule();

	/**
	 * Returns the meta object for the attribute '{@link scheduler.mergebuilder.MergeSchedule#getResultCalendar <em>Result Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Calendar</em>'.
	 * @see scheduler.mergebuilder.MergeSchedule#getResultCalendar()
	 * @see #getMergeSchedule()
	 * @generated
	 */
	EAttribute getMergeSchedule_ResultCalendar();

	/**
	 * Returns the meta object for the '{@link scheduler.mergebuilder.MergeSchedule#generateCalendar() <em>Generate Calendar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Calendar</em>' operation.
	 * @see scheduler.mergebuilder.MergeSchedule#generateCalendar()
	 * @generated
	 */
	EOperation getMergeSchedule__GenerateCalendar();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Calendar</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getCalendar();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MergebuilderFactory getMergebuilderFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link scheduler.mergebuilder.impl.DirectorImpl <em>Director</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scheduler.mergebuilder.impl.DirectorImpl
		 * @see scheduler.mergebuilder.impl.MergebuilderPackageImpl#getDirector()
		 * @generated
		 */
		EClass DIRECTOR = eINSTANCE.getDirector();

		/**
		 * The meta object literal for the '<em><b>Merge Schedule</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIRECTOR___MERGE_SCHEDULE__BUILDER = eINSTANCE.getDirector__MergeSchedule__Builder();

		/**
		 * The meta object literal for the '{@link scheduler.mergebuilder.Builder <em>Builder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scheduler.mergebuilder.Builder
		 * @see scheduler.mergebuilder.impl.MergebuilderPackageImpl#getBuilder()
		 * @generated
		 */
		EClass BUILDER = eINSTANCE.getBuilder();

		/**
		 * The meta object literal for the '<em><b>Reset</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BUILDER___RESET = eINSTANCE.getBuilder__Reset();

		/**
		 * The meta object literal for the '<em><b>Import Calendar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BUILDER___IMPORT_CALENDAR__OBJECT = eINSTANCE.getBuilder__ImportCalendar__Object();

		/**
		 * The meta object literal for the '<em><b>Parse Calenar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BUILDER___PARSE_CALENAR__OBJECT = eINSTANCE.getBuilder__ParseCalenar__Object();

		/**
		 * The meta object literal for the '<em><b>Add Activity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BUILDER___ADD_ACTIVITY__OBJECT = eINSTANCE.getBuilder__AddActivity__Object();

		/**
		 * The meta object literal for the '{@link scheduler.mergebuilder.impl.MergeScheduleImpl <em>Merge Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scheduler.mergebuilder.impl.MergeScheduleImpl
		 * @see scheduler.mergebuilder.impl.MergebuilderPackageImpl#getMergeSchedule()
		 * @generated
		 */
		EClass MERGE_SCHEDULE = eINSTANCE.getMergeSchedule();

		/**
		 * The meta object literal for the '<em><b>Result Calendar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_SCHEDULE__RESULT_CALENDAR = eINSTANCE.getMergeSchedule_ResultCalendar();

		/**
		 * The meta object literal for the '<em><b>Generate Calendar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MERGE_SCHEDULE___GENERATE_CALENDAR = eINSTANCE.getMergeSchedule__GenerateCalendar();

		/**
		 * The meta object literal for the '<em>Calendar</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see scheduler.mergebuilder.impl.MergebuilderPackageImpl#getCalendar()
		 * @generated
		 */
		EDataType CALENDAR = eINSTANCE.getCalendar();

	}

} //MergebuilderPackage
