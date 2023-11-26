package org.example.entity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Student extends Person{

    private ArrayList<Student> studentList;

    private String status;

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public Student (){}

    public Student(int id, String name, String lastName, String birthday, String status) {
        super(id, name, lastName, birthday);
        this.status = status;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String toString() {
        return String.format("%-10s| %-10s | %-10s | %-10s |  %s",
                getId(), getName(),getLastName() ,getBirthday(), getStatus());

    }
}


