package geekster.example.university_event_management_app.controller;

import geekster.example.university_event_management_app.model.Event;
import geekster.example.university_event_management_app.service.EventService;
import geekster.example.university_event_management_app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/event")
public class EventController {
    @Autowired
    private StudentService studentService;
    @GetMapping("add-event")
    public void addEvent(@RequestBody Event event){
        EventService.addEvent(event);
    }

    @GetMapping("get-All-Events")
    public List<Event> findAllEvent(){
        return EventService.GetAllEvents();
    }
}
