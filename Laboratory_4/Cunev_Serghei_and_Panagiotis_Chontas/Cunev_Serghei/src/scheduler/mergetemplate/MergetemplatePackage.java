/**
 */
package scheduler.mergetemplate;

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
 * @see scheduler.mergetemplate.MergetemplateFactory
 * @model kind="package"
 * @generated
 */
public interface MergetemplatePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mergetemplate";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "mergetemplate";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mergetemplate";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MergetemplatePackage eINSTANCE = scheduler.mergetemplate.impl.MergetemplatePackageImpl.init();

	/**
	 * The meta object id for the '{@link scheduler.mergetemplate.impl.MergeTemplateImpl <em>Merge Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scheduler.mergetemplate.impl.MergeTemplateImpl
	 * @see scheduler.mergetemplate.impl.MergetemplatePackageImpl#getMergeTemplate()
	 * @generated
	 */
	int MERGE_TEMPLATE = 2;

	/**
	 * The feature id for the '<em><b>Result Calendar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_TEMPLATE__RESULT_CALENDAR = 0;

	/**
	 * The feature id for the '<em><b>Imported Calendar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_TEMPLATE__IMPORTED_CALENDAR = 1;

	/**
	 * The feature id for the '<em><b>Current Calendar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_TEMPLATE__CURRENT_CALENDAR = 2;

	/**
	 * The number of structural features of the '<em>Merge Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_TEMPLATE_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Import Calendar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_TEMPLATE___IMPORT_CALENDAR__OBJECT = 0;

	/**
	 * The operation id for the '<em>Parse Calenar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_TEMPLATE___PARSE_CALENAR__OBJECT = 1;

	/**
	 * The operation id for the '<em>Add Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_TEMPLATE___ADD_ACTIVITY__OBJECT = 2;

	/**
	 * The operation id for the '<em>Generate Calendar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_TEMPLATE___GENERATE_CALENDAR = 3;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_TEMPLATE___RESET = 4;

	/**
	 * The number of operations of the '<em>Merge Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_TEMPLATE_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link scheduler.mergetemplate.impl.AddToCurrentCalendarImpl <em>Add To Current Calendar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scheduler.mergetemplate.impl.AddToCurrentCalendarImpl
	 * @see scheduler.mergetemplate.impl.MergetemplatePackageImpl#getAddToCurrentCalendar()
	 * @generated
	 */
	int ADD_TO_CURRENT_CALENDAR = 0;

	/**
	 * The feature id for the '<em><b>Result Calendar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TO_CURRENT_CALENDAR__RESULT_CALENDAR = MERGE_TEMPLATE__RESULT_CALENDAR;

	/**
	 * The feature id for the '<em><b>Imported Calendar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TO_CURRENT_CALENDAR__IMPORTED_CALENDAR = MERGE_TEMPLATE__IMPORTED_CALENDAR;

	/**
	 * The feature id for the '<em><b>Current Calendar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TO_CURRENT_CALENDAR__CURRENT_CALENDAR = MERGE_TEMPLATE__CURRENT_CALENDAR;

	/**
	 * The number of structural features of the '<em>Add To Current Calendar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TO_CURRENT_CALENDAR_FEATURE_COUNT = MERGE_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Import Calendar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TO_CURRENT_CALENDAR___IMPORT_CALENDAR__OBJECT = MERGE_TEMPLATE___IMPORT_CALENDAR__OBJECT;

	/**
	 * The operation id for the '<em>Parse Calenar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TO_CURRENT_CALENDAR___PARSE_CALENAR__OBJECT = MERGE_TEMPLATE___PARSE_CALENAR__OBJECT;

	/**
	 * The operation id for the '<em>Add Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TO_CURRENT_CALENDAR___ADD_ACTIVITY__OBJECT = MERGE_TEMPLATE___ADD_ACTIVITY__OBJECT;

	/**
	 * The operation id for the '<em>Generate Calendar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TO_CURRENT_CALENDAR___GENERATE_CALENDAR = MERGE_TEMPLATE___GENERATE_CALENDAR;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TO_CURRENT_CALENDAR___RESET = MERGE_TEMPLATE___RESET;

	/**
	 * The number of operations of the '<em>Add To Current Calendar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TO_CURRENT_CALENDAR_OPERATION_COUNT = MERGE_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link scheduler.mergetemplate.impl.MergeCalendarsImpl <em>Merge Calendars</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scheduler.mergetemplate.impl.MergeCalendarsImpl
	 * @see scheduler.mergetemplate.impl.MergetemplatePackageImpl#getMergeCalendars()
	 * @generated
	 */
	int MERGE_CALENDARS = 1;

	/**
	 * The feature id for the '<em><b>Result Calendar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_CALENDARS__RESULT_CALENDAR = MERGE_TEMPLATE__RESULT_CALENDAR;

	/**
	 * The feature id for the '<em><b>Imported Calendar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_CALENDARS__IMPORTED_CALENDAR = MERGE_TEMPLATE__IMPORTED_CALENDAR;

	/**
	 * The feature id for the '<em><b>Current Calendar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_CALENDARS__CURRENT_CALENDAR = MERGE_TEMPLATE__CURRENT_CALENDAR;

	/**
	 * The number of structural features of the '<em>Merge Calendars</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_CALENDARS_FEATURE_COUNT = MERGE_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Import Calendar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_CALENDARS___IMPORT_CALENDAR__OBJECT = MERGE_TEMPLATE___IMPORT_CALENDAR__OBJECT;

	/**
	 * The operation id for the '<em>Parse Calenar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_CALENDARS___PARSE_CALENAR__OBJECT = MERGE_TEMPLATE___PARSE_CALENAR__OBJECT;

	/**
	 * The operation id for the '<em>Add Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_CALENDARS___ADD_ACTIVITY__OBJECT = MERGE_TEMPLATE___ADD_ACTIVITY__OBJECT;

	/**
	 * The operation id for the '<em>Generate Calendar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_CALENDARS___GENERATE_CALENDAR = MERGE_TEMPLATE___GENERATE_CALENDAR;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_CALENDARS___RESET = MERGE_TEMPLATE___RESET;

	/**
	 * The number of operations of the '<em>Merge Calendars</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_CALENDARS_OPERATION_COUNT = MERGE_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Calendar</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see scheduler.mergetemplate.impl.MergetemplatePackageImpl#getCalendar()
	 * @generated
	 */
	int CALENDAR = 3;


	/**
	 * Returns the meta object for class '{@link scheduler.mergetemplate.AddToCurrentCalendar <em>Add To Current Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add To Current Calendar</em>'.
	 * @see scheduler.mergetemplate.AddToCurrentCalendar
	 * @generated
	 */
	EClass getAddToCurrentCalendar();

	/**
	 * Returns the meta object for class '{@link scheduler.mergetemplate.MergeCalendars <em>Merge Calendars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge Calendars</em>'.
	 * @see scheduler.mergetemplate.MergeCalendars
	 * @generated
	 */
	EClass getMergeCalendars();

	/**
	 * Returns the meta object for class '{@link scheduler.mergetemplate.MergeTemplate <em>Merge Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge Template</em>'.
	 * @see scheduler.mergetemplate.MergeTemplate
	 * @generated
	 */
	EClass getMergeTemplate();

	/**
	 * Returns the meta object for the attribute '{@link scheduler.mergetemplate.MergeTemplate#getResultCalendar <em>Result Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Calendar</em>'.
	 * @see scheduler.mergetemplate.MergeTemplate#getResultCalendar()
	 * @see #getMergeTemplate()
	 * @generated
	 */
	EAttribute getMergeTemplate_ResultCalendar();

	/**
	 * Returns the meta object for the attribute '{@link scheduler.mergetemplate.MergeTemplate#getImportedCalendar <em>Imported Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imported Calendar</em>'.
	 * @see scheduler.mergetemplate.MergeTemplate#getImportedCalendar()
	 * @see #getMergeTemplate()
	 * @generated
	 */
	EAttribute getMergeTemplate_ImportedCalendar();

	/**
	 * Returns the meta object for the attribute '{@link scheduler.mergetemplate.MergeTemplate#getCurrentCalendar <em>Current Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Calendar</em>'.
	 * @see scheduler.mergetemplate.MergeTemplate#getCurrentCalendar()
	 * @see #getMergeTemplate()
	 * @generated
	 */
	EAttribute getMergeTemplate_CurrentCalendar();

	/**
	 * Returns the meta object for the '{@link scheduler.mergetemplate.MergeTemplate#importCalendar(java.lang.Object) <em>Import Calendar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Import Calendar</em>' operation.
	 * @see scheduler.mergetemplate.MergeTemplate#importCalendar(java.lang.Object)
	 * @generated
	 */
	EOperation getMergeTemplate__ImportCalendar__Object();

	/**
	 * Returns the meta object for the '{@link scheduler.mergetemplate.MergeTemplate#parseCalenar(java.lang.Object) <em>Parse Calenar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Parse Calenar</em>' operation.
	 * @see scheduler.mergetemplate.MergeTemplate#parseCalenar(java.lang.Object)
	 * @generated
	 */
	EOperation getMergeTemplate__ParseCalenar__Object();

	/**
	 * Returns the meta object for the '{@link scheduler.mergetemplate.MergeTemplate#addActivity(java.lang.Object) <em>Add Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Activity</em>' operation.
	 * @see scheduler.mergetemplate.MergeTemplate#addActivity(java.lang.Object)
	 * @generated
	 */
	EOperation getMergeTemplate__AddActivity__Object();

	/**
	 * Returns the meta object for the '{@link scheduler.mergetemplate.MergeTemplate#generateCalendar() <em>Generate Calendar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Calendar</em>' operation.
	 * @see scheduler.mergetemplate.MergeTemplate#generateCalendar()
	 * @generated
	 */
	EOperation getMergeTemplate__GenerateCalendar();

	/**
	 * Returns the meta object for the '{@link scheduler.mergetemplate.MergeTemplate#reset() <em>Reset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reset</em>' operation.
	 * @see scheduler.mergetemplate.MergeTemplate#reset()
	 * @generated
	 */
	EOperation getMergeTemplate__Reset();

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
	MergetemplateFactory getMergetemplateFactory();

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
		 * The meta object literal for the '{@link scheduler.mergetemplate.impl.AddToCurrentCalendarImpl <em>Add To Current Calendar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scheduler.mergetemplate.impl.AddToCurrentCalendarImpl
		 * @see scheduler.mergetemplate.impl.MergetemplatePackageImpl#getAddToCurrentCalendar()
		 * @generated
		 */
		EClass ADD_TO_CURRENT_CALENDAR = eINSTANCE.getAddToCurrentCalendar();

		/**
		 * The meta object literal for the '{@link scheduler.mergetemplate.impl.MergeCalendarsImpl <em>Merge Calendars</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scheduler.mergetemplate.impl.MergeCalendarsImpl
		 * @see scheduler.mergetemplate.impl.MergetemplatePackageImpl#getMergeCalendars()
		 * @generated
		 */
		EClass MERGE_CALENDARS = eINSTANCE.getMergeCalendars();

		/**
		 * The meta object literal for the '{@link scheduler.mergetemplate.impl.MergeTemplateImpl <em>Merge Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scheduler.mergetemplate.impl.MergeTemplateImpl
		 * @see scheduler.mergetemplate.impl.MergetemplatePackageImpl#getMergeTemplate()
		 * @generated
		 */
		EClass MERGE_TEMPLATE = eINSTANCE.getMergeTemplate();

		/**
		 * The meta object literal for the '<em><b>Result Calendar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_TEMPLATE__RESULT_CALENDAR = eINSTANCE.getMergeTemplate_ResultCalendar();

		/**
		 * The meta object literal for the '<em><b>Imported Calendar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_TEMPLATE__IMPORTED_CALENDAR = eINSTANCE.getMergeTemplate_ImportedCalendar();

		/**
		 * The meta object literal for the '<em><b>Current Calendar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_TEMPLATE__CURRENT_CALENDAR = eINSTANCE.getMergeTemplate_CurrentCalendar();

		/**
		 * The meta object literal for the '<em><b>Import Calendar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MERGE_TEMPLATE___IMPORT_CALENDAR__OBJECT = eINSTANCE.getMergeTemplate__ImportCalendar__Object();

		/**
		 * The meta object literal for the '<em><b>Parse Calenar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MERGE_TEMPLATE___PARSE_CALENAR__OBJECT = eINSTANCE.getMergeTemplate__ParseCalenar__Object();

		/**
		 * The meta object literal for the '<em><b>Add Activity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MERGE_TEMPLATE___ADD_ACTIVITY__OBJECT = eINSTANCE.getMergeTemplate__AddActivity__Object();

		/**
		 * The meta object literal for the '<em><b>Generate Calendar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MERGE_TEMPLATE___GENERATE_CALENDAR = eINSTANCE.getMergeTemplate__GenerateCalendar();

		/**
		 * The meta object literal for the '<em><b>Reset</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MERGE_TEMPLATE___RESET = eINSTANCE.getMergeTemplate__Reset();

		/**
		 * The meta object literal for the '<em>Calendar</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see scheduler.mergetemplate.impl.MergetemplatePackageImpl#getCalendar()
		 * @generated
		 */
		EDataType CALENDAR = eINSTANCE.getCalendar();

	}

} //MergetemplatePackage
