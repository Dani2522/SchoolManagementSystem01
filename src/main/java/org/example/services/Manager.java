package org.example.services;

import org.example.constans.StudentsContans;
import org.example.entity.Course;
import org.example.entity.Student;
import org.example.Interface.AcademicServicesI;

import java.util.*;

public class Manager implements AcademicServicesI {

    private List<Student> listStudy;
    private List<Course> listCourse;

    HashMap<String,List<String>> seeker;

    Service service = new Service();

    Scanner sc = new Scanner(System.in);

    @Override
    public void studentRegistration() {
        boolean studentIsInTheSystem = false;
        int idTypebyClient = 0;
        do {
            System.out.println("please, enter your ID");
             idTypebyClient = sc.nextInt();
            int finalIdTypebyClient = idTypebyClient;
            List<Student> ArrayList = StudentsContans.REGISTERED_STUDENT.stream().toList();
            Student studentFoundInRegisters =  ArrayList.stream().filter(studenttocompare -> studenttocompare.getId() == finalIdTypebyClient).findFirst().orElse(null);

            //studentFoundInRegisters es igual a nulo entonces el estdiante no existe
            //studentFoundInRegisters == null
            //studentFoundInRegisters es diferente a nulo entonces el estudiante  existe en el registro
            //studentFoundInRegisters != null

            if (studentFoundInRegisters != null) {
                studentIsInTheSystem = true;
                System.out.println("This user is already in the system, try another one");
            }else {
                studentIsInTheSystem = false;
            }
        }while (studentIsInTheSystem);

        System.out.println("please, enter your name");
        String name = sc.next();
        System.out.println("please, enter your Lastname");
        String lastName = sc.next();
        System.out.println("please, enter your date of birth DD/MM/AAAA");
        String birthday = sc.next();
        System.out.println("please, enter your status: enrolled, inactive, graduated");
        String status= sc.next();

        service.getStudentList().add(new Student(idTypebyClient,name,lastName,birthday,status));
        System.out.println(service.getStudentList().toString());

    }

    @Override
    public void addCourse(Course course) {
        System.out.println("please, enter  ID course");
        int id = sc.nextInt();
        System.out.println("please, enter name course");
        String name = sc.next();
        System.out.println("please, enter a description");
        String decription = sc.next();
        System.out.println("please, enter  the credits");
        Integer credits = sc.nextInt();
        System.out.println("please, enter the version");
        String version = sc.next();

        course = new Course (id,name,decription,credits,version);
        listCourse.add(course);

    }

    @Override
    public void enrollStudentCourse(Student student, int idCourse) {


    }

    @Override
    public void unsubscribeStudentCourse(int idStudent, int idCourse) {

    }
}
