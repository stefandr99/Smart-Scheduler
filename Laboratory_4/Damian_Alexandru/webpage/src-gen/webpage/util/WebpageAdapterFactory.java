/**
 */
package webpage.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import webpage.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see webpage.WebpagePackage
 * @generated
 */
public class WebpageAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WebpagePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebpageAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = WebpagePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebpageSwitch modelSwitch = new WebpageSwitch() {
		public Object caseAdapterInterface(AdapterInterface object) {
			return createAdapterInterfaceAdapter();
		}

		public Object caseGoogleCalendarImporterAdapter(GoogleCalendarImporterAdapter object) {
			return createGoogleCalendarImporterAdapterAdapter();
		}

		public Object caseCalendarMerger(CalendarMerger object) {
			return createCalendarMergerAdapter();
		}

		public Object caseCalendarData(CalendarData object) {
			return createCalendarDataAdapter();
		}

		public Object caseOutlookImporterAdapter(OutlookImporterAdapter object) {
			return createOutlookImporterAdapterAdapter();
		}

		public Object caseCalendarExporter(CalendarExporter object) {
			return createCalendarExporterAdapter();
		}

		public Object caseExportStrategy(ExportStrategy object) {
			return createExportStrategyAdapter();
		}

		public Object caseGoogleCalendarExportStrategy(GoogleCalendarExportStrategy object) {
			return createGoogleCalendarExportStrategyAdapter();
		}

		public Object caseOutlookExportStrategy(OutlookExportStrategy object) {
			return createOutlookExportStrategyAdapter();
		}

		public Object defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter) modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link webpage.AdapterInterface <em>Adapter Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webpage.AdapterInterface
	 * @generated
	 */
	public Adapter createAdapterInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webpage.GoogleCalendarImporterAdapter <em>Google Calendar Importer Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webpage.GoogleCalendarImporterAdapter
	 * @generated
	 */
	public Adapter createGoogleCalendarImporterAdapterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webpage.CalendarMerger <em>Calendar Merger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webpage.CalendarMerger
	 * @generated
	 */
	public Adapter createCalendarMergerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webpage.CalendarData <em>Calendar Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webpage.CalendarData
	 * @generated
	 */
	public Adapter createCalendarDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webpage.OutlookImporterAdapter <em>Outlook Importer Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webpage.OutlookImporterAdapter
	 * @generated
	 */
	public Adapter createOutlookImporterAdapterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webpage.CalendarExporter <em>Calendar Exporter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webpage.CalendarExporter
	 * @generated
	 */
	public Adapter createCalendarExporterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webpage.ExportStrategy <em>Export Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webpage.ExportStrategy
	 * @generated
	 */
	public Adapter createExportStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webpage.GoogleCalendarExportStrategy <em>Google Calendar Export Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webpage.GoogleCalendarExportStrategy
	 * @generated
	 */
	public Adapter createGoogleCalendarExportStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link webpage.OutlookExportStrategy <em>Outlook Export Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see webpage.OutlookExportStrategy
	 * @generated
	 */
	public Adapter createOutlookExportStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //WebpageAdapterFactory
