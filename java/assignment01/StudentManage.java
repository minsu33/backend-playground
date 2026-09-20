package assignment01;

import java.util.ArrayList;

public class StudentManage {
    ArrayList<Student> students = new ArrayList<>();

    void addStudent(Student student){
        students.add(student);
    }

    void deleteStudent(Student student){
        students.remove(student);
    }

    Student findStudent(String studentId) {
        for (Student student : students) {

            if (student.studentId.equals(studentId)) {

                return student;
            }
        }
        return null;
    }

}
