package org.example.services;

import org.example.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class Service {

    private List<Student> studentList;

    public List<Student> getStudentList() {
        return studentList;
    }

    public Service() {
        studentList = new ArrayList<>();
    }


}
