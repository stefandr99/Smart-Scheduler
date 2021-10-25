/**
 */
package scheduler.mergebuilder;


public interface MergeSchedule extends Builder {
	
	private Calendar resultCalendar;
	private List<Calendar> importedCaledars;
	
	Calenar getResultCalendar();

	void setResultCalendar(Calendar value);

	Calendar generateCalendar();

} 
