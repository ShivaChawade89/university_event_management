package geekster.example.university_event_management_app.model;


public class Event {
    int eventId;
    String eventName;
    String locationOfEvent;
    String date;
    String startTime;
    String endTime;

    public Event( int eventId,String eventName,String locationOfEvent,String date,String startTime,String endTime){
        this.eventId=eventId;
        this.eventName=eventName;
        this.locationOfEvent=locationOfEvent;
        this.date=date;
        this.startTime=startTime;
        this.endTime=endTime;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getLocationOfEvent() {
        return locationOfEvent;
    }

    public void setLocationOfEvent(String locationOfEvent) {
        this.locationOfEvent = locationOfEvent;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventId=" + eventId +
                ", eventName='" + eventName + '\'' +
                ", locationOfEvent='" + locationOfEvent + '\'' +
                ", date=" + date +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                '}';
    }
}
