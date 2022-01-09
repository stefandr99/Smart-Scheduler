package master.aset.smartscheduler.services;

public class CurrentDayEvent {
    private String name;
    private String date;
    
    public CurrentDayEvent(String name, String date) {
        this.name = name;
        this.date = date;
    }
    
    public String getName() {
        return name;
    }
    
    public String getDate() {
        return date;
    }
}
