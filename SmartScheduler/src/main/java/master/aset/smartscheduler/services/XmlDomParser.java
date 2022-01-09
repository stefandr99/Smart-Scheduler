package master.aset.smartscheduler.services;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.PersistenceException;
import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import master.aset.smartscheduler.entities.calendar.Calendar;
import master.aset.smartscheduler.entities.calendar.CalendarEntry;
import master.aset.smartscheduler.repositories.CalendarEntryRepository;
import master.aset.smartscheduler.repositories.CalendarRepository;
import master.aset.smartscheduler.repositories.interfaces.ICalendarEntryRepository;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

@ApplicationScoped
public class XmlDomParser {
    
    @Inject
    private CalendarRepository calendarRepo;
    
    @Inject
    private ICalendarEntryRepository calendarEntryRepo;
    
    public void parse(File xmlFile, List<Date> range) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        if (range.size() != 2) {
            return;
        }
        try {
            calendarRepo.deletePublicCalendars();
            dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);

            // parse XML file
            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.parse(xmlFile);
            doc.getDocumentElement().normalize();

            NodeList eventsList = doc.getElementsByTagName("event");

            Map<String, Set<Integer>> eventMap = new HashMap<>();            
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
                        Set<Integer> calendarsId = new HashSet<>();
                        String[] actors = element.getAttribute("actors").split(",");
                        
                        for (int j = 0; j < actors.length; j++) {
                            if (!calendarMap.containsKey(actors[j])) {
                                
                                Calendar newCalendar = new Calendar();
                                newCalendar.setName(actors[j]);
                                newCalendar.setIsPublic(true);
                                
                                calendarRepo.create(newCalendar);
                                calendarMap.put(actors[j], newCalendar);
                                calendarsId.add(newCalendar.getId());
                            
                            } else {
                                calendarsId.add(calendarMap.get(actors[j]).getId());
                            }
                        }
                        eventMap.put(eventName, calendarsId);
                    }
                }
            }
            
            NodeList assignmentsList = doc.getElementsByTagName("assignment");
            int k = 0;
            for (int i = 0; i < assignmentsList.getLength(); i++) {
                Node node = assignmentsList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    String[] eventAttr = element.getAttribute("event").split("_");
                    String eventKey = element.getAttribute("event");
                    
                    Set<Integer> eventCalendarsId = eventMap.get(eventKey);

                    for (Integer calendarId : eventCalendarsId) {
                        Calendar dbCalendar = calendarRepo.get(calendarId);
                        CalendarEntry newEntry = new CalendarEntry();
                        String subjectName = eventAttr[0];
                        char type = subjectName.toCharArray()[0];

                        newEntry.setName(getSubjectTypeMapping(type) + subjectNamesMap.get(subjectName));
                        if (!getSubjectTypeMapping(type).equals("E")) {
                            newEntry.setRecurring(true);
                            newEntry.setDay(Integer.parseInt(element.getAttribute("day")));
                            newEntry.setStartDate(range.get(0));
                            newEntry.setFinishDate(range.get(1));
                            newEntry.setStartTime(element.getAttribute("startTime"));
                            newEntry.setEndTime(element.getAttribute("endTime"));
                            
                            dbCalendar.addCalendarEntry(newEntry);
                            calendarRepo.update(dbCalendar); 
                        }
                    }
                }
            }
            System.out.println(k);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
    
    private String getSubjectTypeMapping(char type) {
        switch (type) {
            case 'S':
                return "Seminar ";
            case 'C':
                return "Curs ";
            case 'E':
                return "Examen ";
            default:
                return "";
        }
    }
}
