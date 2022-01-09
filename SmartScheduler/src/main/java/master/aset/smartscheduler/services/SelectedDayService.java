package master.aset.smartscheduler.services;

import java.sql.Timestamp;
import org.apache.commons.lang.time.DateUtils;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import org.primefaces.event.SelectEvent;

@Named(value = "selectedDayService")
@ApplicationScoped
public class SelectedDayService {
    private Date selectedDate = new Date();
    
    public String getSelectedDateString() {
        if(DateUtils.isSameDay(selectedDate, new Date())) {
            return "Today";
        }
        Format formatter = new SimpleDateFormat("MMMM DD"); 
        return formatter.format(new Date());
    }
    
    private String getDateString(Date inputDate) {
        if(DateUtils.isSameDay(inputDate, new Date())) {
            return "Today";
        }
        Format formatter = new SimpleDateFormat("MMMM DD"); 
        return formatter.format(new Date());
    }
    
   public void onDateSelect(SelectEvent<LocalDateTime> selectEvent) {
        this.selectedDate = Timestamp.valueOf(selectEvent.getObject());
    }

    public List<CurrentDayEvent> getTodayEvents() {
        CurrentDayEvent e1 = new CurrentDayEvent("Design call", "Today, 07:19");
        CurrentDayEvent e2 = new CurrentDayEvent("Design call", "Today, 10:19");
        return Arrays.asList(e1, e2);
    }
    
}
