package org.example.Interface;

import org.example.entity.Course;
import org.example.entity.Student;

public interface AcademicServicesI {
    void studentRegistration();
    void addCourse(Course course);
    void enrollStudentCourse(Student student,int idCourse);
    void unsubscribeStudentCourse(int idStudent, int idCourse);


}
