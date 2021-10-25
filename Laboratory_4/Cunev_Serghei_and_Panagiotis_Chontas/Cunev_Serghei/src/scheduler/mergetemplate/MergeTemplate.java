/**
 */
package scheduler.mergetemplate;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Merge Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scheduler.mergetemplate.MergeTemplate#getResultCalendar <em>Result Calendar</em>}</li>
 *   <li>{@link scheduler.mergetemplate.MergeTemplate#getImportedCalendar <em>Imported Calendar</em>}</li>
 *   <li>{@link scheduler.mergetemplate.MergeTemplate#getCurrentCalendar <em>Current Calendar</em>}</li>
 * </ul>
 *
 * @see scheduler.mergetemplate.MergetemplatePackage#getMergeTemplate()
 * @model abstract="true"
 * @generated
 */
public interface MergeTemplate extends EObject {
	private Calendar resultCalendar;
	private Calendar currentCalenar;
	private List<Calendar> importedCalendar;
	
	Calendar getResultCalendar();


	void setResultCalendar(Calendar value);

	Calendar getImportedCalendar();


	void setImportedCalendar(Calendar value);


	Calendar getCurrentCalendar();


	void setCurrentCalendar(Calendar value);


	void importCalendar(Calendar calendar);


	void parseCalenar(Calendar calendar);


	void addActivity(Calendar calendar);

	Calendar generateCalendar();

	void reset();

} // MergeTemplate
