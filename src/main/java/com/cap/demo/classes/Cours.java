package com.cap.demo.classes;

import java.util.ArrayList;
import java.util.List;

public class Cours {
    private String courseName;
    private List<Student> students = new ArrayList<>();

    public Cours(String courseName) {
        this.courseName = courseName;
    }

    public int addStudentToClass(Student student){
        if (student.getAge() < 15)
            return 0;
        else {
            this.students.add(student);
            return 1;
        }
    }
    public int getAll(){
        return this.students.size();
    }
}
