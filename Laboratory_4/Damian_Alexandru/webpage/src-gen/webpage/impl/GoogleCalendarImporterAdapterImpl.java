/**
 */
package webpage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import webpage.CalendarData;
import webpage.CalendarMerger;
import webpage.GoogleCalendarImporterAdapter;
import webpage.WebpagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Google Calendar Importer Adapter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link webpage.impl.GoogleCalendarImporterAdapterImpl#getCalendarimporter <em>Calendarimporter</em>}</li>
 *   <li>{@link webpage.impl.GoogleCalendarImporterAdapterImpl#getMerger <em>Merger</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GoogleCalendarImporterAdapterImpl extends MinimalEObjectImpl.Container
		implements GoogleCalendarImporterAdapter {
	/**
	 * The cached value of the '{@link #getCalendarimporter() <em>Calendarimporter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalendarimporter()
	 * @generated
	 * @ordered
	 */
	protected CalendarMerger calendarimporter;

	/**
	 * The default value of the '{@link #getMerger() <em>Merger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMerger()
	 * @generated
	 * @ordered
	 */
	protected static final Object MERGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMerger() <em>Merger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMerger()
	 * @generated
	 * @ordered
	 */
	protected Object merger = MERGER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoogleCalendarImporterAdapterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return WebpagePackage.Literals.GOOGLE_CALENDAR_IMPORTER_ADAPTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalendarMerger getCalendarimporter() {
		if (calendarimporter != null && calendarimporter.eIsProxy()) {
			InternalEObject oldCalendarimporter = (InternalEObject) calendarimporter;
			calendarimporter = (CalendarMerger) eResolveProxy(oldCalendarimporter);
			if (calendarimporter != oldCalendarimporter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							WebpagePackage.GOOGLE_CALENDAR_IMPORTER_ADAPTER__CALENDARIMPORTER, oldCalendarimporter,
							calendarimporter));
			}
		}
		return calendarimporter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalendarMerger basicGetCalendarimporter() {
		return calendarimporter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalendarimporter(CalendarMerger newCalendarimporter) {
		CalendarMerger oldCalendarimporter = calendarimporter;
		calendarimporter = newCalendarimporter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					WebpagePackage.GOOGLE_CALENDAR_IMPORTER_ADAPTER__CALENDARIMPORTER, oldCalendarimporter,
					calendarimporter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getMerger() {
		return merger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMerger(Object newMerger) {
		Object oldMerger = merger;
		merger = newMerger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					WebpagePackage.GOOGLE_CALENDAR_IMPORTER_ADAPTER__MERGER, oldMerger, merger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalendarData import_(String data) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WebpagePackage.GOOGLE_CALENDAR_IMPORTER_ADAPTER__CALENDARIMPORTER:
			if (resolve)
				return getCalendarimporter();
			return basicGetCalendarimporter();
		case WebpagePackage.GOOGLE_CALENDAR_IMPORTER_ADAPTER__MERGER:
			return getMerger();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case WebpagePackage.GOOGLE_CALENDAR_IMPORTER_ADAPTER__CALENDARIMPORTER:
			setCalendarimporter((CalendarMerger) newValue);
			return;
		case WebpagePackage.GOOGLE_CALENDAR_IMPORTER_ADAPTER__MERGER:
			setMerger(newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
		case WebpagePackage.GOOGLE_CALENDAR_IMPORTER_ADAPTER__CALENDARIMPORTER:
			setCalendarimporter((CalendarMerger) null);
			return;
		case WebpagePackage.GOOGLE_CALENDAR_IMPORTER_ADAPTER__MERGER:
			setMerger(MERGER_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case WebpagePackage.GOOGLE_CALENDAR_IMPORTER_ADAPTER__CALENDARIMPORTER:
			return calendarimporter != null;
		case WebpagePackage.GOOGLE_CALENDAR_IMPORTER_ADAPTER__MERGER:
			return MERGER_EDEFAULT == null ? merger != null : !MERGER_EDEFAULT.equals(merger);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (merger: ");
		result.append(merger);
		result.append(')');
		return result.toString();
	}

} //GoogleCalendarImporterAdapterImpl
