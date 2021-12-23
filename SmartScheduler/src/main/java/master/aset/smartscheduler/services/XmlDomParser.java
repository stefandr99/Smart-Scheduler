package master.aset.smartscheduler.services;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import master.aset.smartscheduler.entities.calendar.Calendar;
import master.aset.smartscheduler.entities.calendar.CalendarEntry;
import master.aset.smartscheduler.repositories.CalendarRepository;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

@ApplicationScoped
public class XmlDomParser {
    
    @Inject
    private CalendarRepository calendarRepo;
    
    public void parse(File xmlFile) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
//            TODO: calendarRepo.deleteFacultyCalendars();
            dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);

            // parse XML file
            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.parse(xmlFile);
            doc.getDocumentElement().normalize();

            NodeList eventsList = doc.getElementsByTagName("event");

            Map<String, List<Calendar>> eventMap = new HashMap<>();            
            Map<String, Calendar> calendarMap = new HashMap<>();           
            Map<String, String> subjectNamesMap = new HashMap<>();

            for (int i = 0; i < eventsList.getLength(); i++) {
                Node node = eventsList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    String subjectName = element.getAttribute("abbr").split("_")[0];
                    if (!subjectNamesMap.containsKey(subjectName)) {
                        String fullName = element.getAttribute("name");
                        subjectNamesMap.put(subjectName, fullName);
                    }
                    String eventName = element.getAttribute("abbr");
                    
                    if (!eventMap.containsKey(eventName)) {
                        List<Calendar> calendars = new ArrayList<>();
                        String[] actors = element.getAttribute("actors").split(",");
                        for (int j = 0; j < actors.length; j++) {
                            if (!calendarMap.containsKey(actors[j])) {
                                
                                Calendar newCalendar = new Calendar();
                                newCalendar.setName(actors[j]);
                                
                                calendarRepo.create(newCalendar);
                                calendarMap.put(actors[j], newCalendar);
                                calendars.add(newCalendar);
                            } else {
                                calendars.add(calendarMap.get(actors[j]));
                            }
                        }
                        eventMap.put(eventName, calendars);
                    }
                    
                }
            }
            
            NodeList assignmentsList = doc.getElementsByTagName("assignment");
            for (int i = 0; i < assignmentsList.getLength(); i++) {
                Node node = assignmentsList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    String[] eventAttr = element.getAttribute("event").split("_");
                    String eventKey = element.getAttribute("event");
                    
                    CalendarEntry newEntry = new CalendarEntry();
                    String subjectName = eventAttr[0];

                    newEntry.setName(subjectNamesMap.get(subjectName));
//                    newEntry.setStartDate(startDate);
//                    newEntry.setStartDate(startDate);
                    
                    List<Calendar> eventCalendars = eventMap.get(eventKey);
                    for (Calendar c : eventCalendars) {
                        newEntry.setCalendar(c);
                        c.addCalendarEntry(newEntry);
                        calendarRepo.update(c);
                    }
                }
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
}
