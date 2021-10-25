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
import webpage.OutlookImporterAdapter;
import webpage.WebpagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Outlook Importer Adapter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link webpage.impl.OutlookImporterAdapterImpl#getMerger <em>Merger</em>}</li>
 *   <li>{@link webpage.impl.OutlookImporterAdapterImpl#getCalendarmerger <em>Calendarmerger</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutlookImporterAdapterImpl extends MinimalEObjectImpl.Container implements OutlookImporterAdapter {
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
	 * The cached value of the '{@link #getCalendarmerger() <em>Calendarmerger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalendarmerger()
	 * @generated
	 * @ordered
	 */
	protected CalendarMerger calendarmerger;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutlookImporterAdapterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return WebpagePackage.Literals.OUTLOOK_IMPORTER_ADAPTER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebpagePackage.OUTLOOK_IMPORTER_ADAPTER__MERGER,
					oldMerger, merger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalendarMerger getCalendarmerger() {
		if (calendarmerger != null && calendarmerger.eIsProxy()) {
			InternalEObject oldCalendarmerger = (InternalEObject) calendarmerger;
			calendarmerger = (CalendarMerger) eResolveProxy(oldCalendarmerger);
			if (calendarmerger != oldCalendarmerger) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							WebpagePackage.OUTLOOK_IMPORTER_ADAPTER__CALENDARMERGER, oldCalendarmerger,
							calendarmerger));
			}
		}
		return calendarmerger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalendarMerger basicGetCalendarmerger() {
		return calendarmerger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalendarmerger(CalendarMerger newCalendarmerger) {
		CalendarMerger oldCalendarmerger = calendarmerger;
		calendarmerger = newCalendarmerger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					WebpagePackage.OUTLOOK_IMPORTER_ADAPTER__CALENDARMERGER, oldCalendarmerger, calendarmerger));
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
		case WebpagePackage.OUTLOOK_IMPORTER_ADAPTER__MERGER:
			return getMerger();
		case WebpagePackage.OUTLOOK_IMPORTER_ADAPTER__CALENDARMERGER:
			if (resolve)
				return getCalendarmerger();
			return basicGetCalendarmerger();
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
		case WebpagePackage.OUTLOOK_IMPORTER_ADAPTER__MERGER:
			setMerger(newValue);
			return;
		case WebpagePackage.OUTLOOK_IMPORTER_ADAPTER__CALENDARMERGER:
			setCalendarmerger((CalendarMerger) newValue);
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
		case WebpagePackage.OUTLOOK_IMPORTER_ADAPTER__MERGER:
			setMerger(MERGER_EDEFAULT);
			return;
		case WebpagePackage.OUTLOOK_IMPORTER_ADAPTER__CALENDARMERGER:
			setCalendarmerger((CalendarMerger) null);
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
		case WebpagePackage.OUTLOOK_IMPORTER_ADAPTER__MERGER:
			return MERGER_EDEFAULT == null ? merger != null : !MERGER_EDEFAULT.equals(merger);
		case WebpagePackage.OUTLOOK_IMPORTER_ADAPTER__CALENDARMERGER:
			return calendarmerger != null;
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

} //OutlookImporterAdapterImpl
