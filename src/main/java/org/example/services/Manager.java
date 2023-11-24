package org.example.services;

import org.example.Entity.Course;
import org.example.Entity.Student;
import org.example.services.Interface.AcademicServicesI;

import java.util.HashMap;
import java.util.List;

public class Manager implements AcademicServicesI {

    private List<Student> listStudy;
    private List<Course> listCourse;

    HashMap<String,List<String>> seeker;

    @Override
    public void studentRegistration(Student student) {

    }

    @Override
    public void addCourse(Course course) {

    }

    @Override
    public void enrollStudentCourse(Student student, int idCourse) {

    }

    @Override
    public void unsubscribeStudentCourse(int idStudent, int idCourse) {

    }
}
