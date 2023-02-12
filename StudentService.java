package geekster.example.university_event_management_app.service;

import geekster.example.university_event_management_app.model.Student;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class StudentService {

    private static List<Student> students=new ArrayList<>();

    static {
        students.add(new Student(1,"shiv","chawade",22,"cs"));
        students.add(new Student(2,"dinu","prajapati",23,"ex"));
        students.add(new Student(3,"sagar","singh",24,"ec"));
        students.add(new Student(4,"raju","yadav",26,"me"));

    }

    public static void deleteStudent(int id) {
        Predicate<? super Student> predicate = student -> student.getStudentId() == id;
        students.removeIf(predicate);
    }

    public List<Student> findAll() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student findById(int id) {
        Predicate<? super Student> predicate = student -> student.getStudentId() == id;
        Student student = students.stream().filter(predicate).findFirst().get();
        return student;
    }
}
