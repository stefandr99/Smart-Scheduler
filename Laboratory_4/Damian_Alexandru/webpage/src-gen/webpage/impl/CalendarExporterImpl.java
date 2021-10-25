/**
 */
package webpage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import webpage.CalendarExporter;
import webpage.ExportStrategy;
import webpage.WebpagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calendar Exporter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link webpage.impl.CalendarExporterImpl#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link webpage.impl.CalendarExporterImpl#getExportstrategy <em>Exportstrategy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalendarExporterImpl extends MinimalEObjectImpl.Container implements CalendarExporter {
	/**
	 * The default value of the '{@link #getStrategy() <em>Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final Object STRATEGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStrategy() <em>Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategy()
	 * @generated
	 * @ordered
	 */
	protected Object strategy = STRATEGY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExportstrategy() <em>Exportstrategy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExportstrategy()
	 * @generated
	 * @ordered
	 */
	protected EList exportstrategy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalendarExporterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return WebpagePackage.Literals.CALENDAR_EXPORTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getStrategy() {
		return strategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategy(Object newStrategy) {
		Object oldStrategy = strategy;
		strategy = newStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebpagePackage.CALENDAR_EXPORTER__STRATEGY,
					oldStrategy, strategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getExportstrategy() {
		if (exportstrategy == null) {
			exportstrategy = new EObjectContainmentEList(ExportStrategy.class, this,
					WebpagePackage.CALENDAR_EXPORTER__EXPORTSTRATEGY);
		}
		return exportstrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExportStrategy(ExportStrategy strategy) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WebpagePackage.CALENDAR_EXPORTER__EXPORTSTRATEGY:
			return ((InternalEList) getExportstrategy()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WebpagePackage.CALENDAR_EXPORTER__STRATEGY:
			return getStrategy();
		case WebpagePackage.CALENDAR_EXPORTER__EXPORTSTRATEGY:
			return getExportstrategy();
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
		case WebpagePackage.CALENDAR_EXPORTER__STRATEGY:
			setStrategy(newValue);
			return;
		case WebpagePackage.CALENDAR_EXPORTER__EXPORTSTRATEGY:
			getExportstrategy().clear();
			getExportstrategy().addAll((Collection) newValue);
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
		case WebpagePackage.CALENDAR_EXPORTER__STRATEGY:
			setStrategy(STRATEGY_EDEFAULT);
			return;
		case WebpagePackage.CALENDAR_EXPORTER__EXPORTSTRATEGY:
			getExportstrategy().clear();
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
		case WebpagePackage.CALENDAR_EXPORTER__STRATEGY:
			return STRATEGY_EDEFAULT == null ? strategy != null : !STRATEGY_EDEFAULT.equals(strategy);
		case WebpagePackage.CALENDAR_EXPORTER__EXPORTSTRATEGY:
			return exportstrategy != null && !exportstrategy.isEmpty();
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
		result.append(" (strategy: ");
		result.append(strategy);
		result.append(')');
		return result.toString();
	}

} //CalendarExporterImpl
