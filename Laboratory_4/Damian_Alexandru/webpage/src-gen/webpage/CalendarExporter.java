/**
 */
package webpage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calendar Exporter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webpage.CalendarExporter#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link webpage.CalendarExporter#getExportstrategy <em>Exportstrategy</em>}</li>
 * </ul>
 *
 * @see webpage.WebpagePackage#getCalendarExporter()
 * @model
 * @generated
 */
public interface CalendarExporter extends EObject {
	/**
	 * Returns the value of the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy</em>' attribute.
	 * @see #setStrategy(Object)
	 * @see webpage.WebpagePackage#getCalendarExporter_Strategy()
	 * @model
	 * @generated
	 */
	Object getStrategy();

	/**
	 * Sets the value of the '{@link webpage.CalendarExporter#getStrategy <em>Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy</em>' attribute.
	 * @see #getStrategy()
	 * @generated
	 */
	void setStrategy(Object value);

	/**
	 * Returns the value of the '<em><b>Exportstrategy</b></em>' containment reference list.
	 * The list contents are of type {@link webpage.ExportStrategy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exportstrategy</em>' containment reference list.
	 * @see webpage.WebpagePackage#getCalendarExporter_Exportstrategy()
	 * @model type="webpage.ExportStrategy" containment="true"
	 * @generated
	 */
	EList getExportstrategy();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setExportStrategy(ExportStrategy strategy);

} // CalendarExporter
