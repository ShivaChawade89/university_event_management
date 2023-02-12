package geekster.example.university_event_management_app.controller;

import geekster.example.university_event_management_app.model.Student;
import geekster.example.university_event_management_app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("get-All-Students")
    public List<Student>findAllStudents(){
        return studentService.findAll();
    }

    @DeleteMapping("delete-Student/id/{id}")
    public void deleteStudent(@PathVariable int id) {
        StudentService.deleteStudent(id);
    }

    @PostMapping("/add-student")
    public void addTodo(@RequestBody Student student) {
        studentService.addStudent(student);
    }

    @GetMapping("/get-student/id/{id}")
    public Student getStudentById(@PathVariable int id) {
        return studentService.findById(id);
    }




}
