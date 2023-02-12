package geekster.example.university_event_management_app.model;

public class Student {
    int studentId;
    String first_name;
    String last_name;
    int age;
    String department;

    public Student( int studentId,String first_name,String last_name,int age,String department){
        this.studentId=studentId;
        this.first_name=first_name;
        this.last_name=last_name;
        this.age=age;
        this.department=department;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                '}';
    }


}
