package master.aset.smartscheduler.managedBeans;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Date;
import java.util.List;
import javax.inject.Inject;
import master.aset.smartscheduler.entities.user.User;
import master.aset.smartscheduler.services.XmlDomParser;
import net.fortuna.ical4j.data.CalendarBuilder;
import net.fortuna.ical4j.data.ParserException;
import net.fortuna.ical4j.model.Calendar;
import org.primefaces.model.file.UploadedFile;


@Named(value = "xmlCalendarUpload")
@SessionScoped
public class XmlCalendarUpload implements Serializable {
    
    @Inject
    private XmlDomParser xmlParserService;
    
    private UploadedFile calendarXmlFile;

    private List<Date> range;

    public List<Date> getRange() {
        return range;
    }

    public void setRange(List<Date> range) {
        this.range = range;
    }
    
    public UploadedFile getCalendarXmlFile() {
        return calendarXmlFile;
    }

    public void setCalendarXmlFile(UploadedFile calendarXmlFile) {
        this.calendarXmlFile = calendarXmlFile;
    }
    
    public XmlCalendarUpload() {
    }
    
    public String uploadFile() throws Exception {
        if (calendarXmlFile != null && calendarXmlFile.getSize() > 0 ) {
            try (InputStream input = calendarXmlFile.getInputStream()) {
                xmlParserService.parse(getCalendarFileStream(input), range);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            return "calendarParse";
        }

        return "viewCalendar";
    }
    
    public File getCalendarFileStream(InputStream input) throws IOException {
        Path temp = Files.createTempFile("calendar", ".xml");
        Files.copy(input, temp, StandardCopyOption.REPLACE_EXISTING);

        return temp.toFile();
    }

}
