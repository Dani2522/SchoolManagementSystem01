package org.example;

import org.example.entity.Course;
import org.example.entity.Student;
import org.example.services.Manager;

public class Main {
    public static void main(String[] args) {

        Manager manager = new Manager();
        manager.studentRegistration();

        Course course = new Course();
        manager.addCourse(course);

        Student student = new Student();
        manager.enrollStudentCourse(student,course);


    }
}