/**
 */
package webpage.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import webpage.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see webpage.WebpagePackage
 * @generated
 */
public class WebpageSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WebpagePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebpageSwitch() {
		if (modelPackage == null) {
			modelPackage = WebpagePackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		} else {
			List eSuperTypes = theEClass.getESuperTypes();
			return eSuperTypes.isEmpty() ? defaultCase(theEObject) : doSwitch((EClass) eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case WebpagePackage.ADAPTER_INTERFACE: {
			AdapterInterface adapterInterface = (AdapterInterface) theEObject;
			Object result = caseAdapterInterface(adapterInterface);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WebpagePackage.GOOGLE_CALENDAR_IMPORTER_ADAPTER: {
			GoogleCalendarImporterAdapter googleCalendarImporterAdapter = (GoogleCalendarImporterAdapter) theEObject;
			Object result = caseGoogleCalendarImporterAdapter(googleCalendarImporterAdapter);
			if (result == null)
				result = caseAdapterInterface(googleCalendarImporterAdapter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WebpagePackage.CALENDAR_MERGER: {
			CalendarMerger calendarMerger = (CalendarMerger) theEObject;
			Object result = caseCalendarMerger(calendarMerger);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WebpagePackage.CALENDAR_DATA: {
			CalendarData calendarData = (CalendarData) theEObject;
			Object result = caseCalendarData(calendarData);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WebpagePackage.OUTLOOK_IMPORTER_ADAPTER: {
			OutlookImporterAdapter outlookImporterAdapter = (OutlookImporterAdapter) theEObject;
			Object result = caseOutlookImporterAdapter(outlookImporterAdapter);
			if (result == null)
				result = caseAdapterInterface(outlookImporterAdapter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WebpagePackage.CALENDAR_EXPORTER: {
			CalendarExporter calendarExporter = (CalendarExporter) theEObject;
			Object result = caseCalendarExporter(calendarExporter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WebpagePackage.EXPORT_STRATEGY: {
			ExportStrategy exportStrategy = (ExportStrategy) theEObject;
			Object result = caseExportStrategy(exportStrategy);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WebpagePackage.GOOGLE_CALENDAR_EXPORT_STRATEGY: {
			GoogleCalendarExportStrategy googleCalendarExportStrategy = (GoogleCalendarExportStrategy) theEObject;
			Object result = caseGoogleCalendarExportStrategy(googleCalendarExportStrategy);
			if (result == null)
				result = caseExportStrategy(googleCalendarExportStrategy);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WebpagePackage.OUTLOOK_EXPORT_STRATEGY: {
			OutlookExportStrategy outlookExportStrategy = (OutlookExportStrategy) theEObject;
			Object result = caseOutlookExportStrategy(outlookExportStrategy);
			if (result == null)
				result = caseExportStrategy(outlookExportStrategy);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adapter Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adapter Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAdapterInterface(AdapterInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Google Calendar Importer Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Google Calendar Importer Adapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGoogleCalendarImporterAdapter(GoogleCalendarImporterAdapter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calendar Merger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calendar Merger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCalendarMerger(CalendarMerger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calendar Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calendar Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCalendarData(CalendarData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Outlook Importer Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Outlook Importer Adapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOutlookImporterAdapter(OutlookImporterAdapter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calendar Exporter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calendar Exporter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCalendarExporter(CalendarExporter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Export Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Export Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExportStrategy(ExportStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Google Calendar Export Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Google Calendar Export Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGoogleCalendarExportStrategy(GoogleCalendarExportStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Outlook Export Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Outlook Export Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOutlookExportStrategy(OutlookExportStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //WebpageSwitch
