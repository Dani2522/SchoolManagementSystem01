package org.example.services.Interface;

import org.example.Entity.Course;
import org.example.Entity.Student;

public interface AcademicServicesI {
    void studentRegistration(Student student);
    void addCourse(Course course);
    void enrollStudentCourse(Student student,int idCourse);
    void unsubscribeStudentCourse(int idStudent, int idCourse);
    

}
