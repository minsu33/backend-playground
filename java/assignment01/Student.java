package assignment01;

import java.util.HashMap;

public class Student {
    HashMap<String, Integer> score = new HashMap<>();

    String name;
    String studentId;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }
}

