package geekster.example.university_event_management_app.service;

import geekster.example.university_event_management_app.model.Event;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventService {
    private static List<Event> events=new ArrayList<>();

    static {
        events.add(new Event(1,"ferewell","bhopal","12/02/2023","8 PM","9 PM"));
    }


    public static void addEvent(Event event) {
        events.add(event);
    }

    public static List<Event> GetAllEvents() {
        return events;
    }
}
