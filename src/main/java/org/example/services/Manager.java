package org.example.services;

import org.example.constans.StudentsContans;
import org.example.entity.Course;
import org.example.entity.Student;
import org.example.Interface.AcademicServicesI;
import org.example.exeption.SignedUp;

import java.util.*;

public class Manager implements AcademicServicesI {

    private List<Student> listStudy = new ArrayList<>();
    private List<Course> listCourse = new ArrayList<>();

    HashMap<Integer,List<Course>> seeker = new HashMap<>();

    Scanner sc = new Scanner(System.in);

    @Override
    public void studentRegistration() {

            boolean studentIsInTheSystem = false;
            int idTypebyClient = 0;

                System.out.println("please, enter your ID");
                idTypebyClient = sc.nextInt();
                int finalIdTypebyClient = idTypebyClient;
                List<Student> ArrayList = StudentsContans.REGISTERED_STUDENT.stream().toList();
                Student studentFoundInRegisters = ArrayList.stream().filter(studenttocompare -> studenttocompare.getId() == finalIdTypebyClient).findFirst().orElse(null);

                //studentFoundInRegisters es igual a nulo entonces el estdiante no existe
                //studentFoundInRegisters == null
                //studentFoundInRegisters es diferente a nulo entonces el estudiante  existe en el registro
                //studentFoundInRegisters != null

                if (studentFoundInRegisters != null) {
                    studentIsInTheSystem = true;
                    System.out.println(" The student is already registered, enter a new ID");

                } else {
                    studentIsInTheSystem = false;

                    System.out.println("please, enter your name");
                    String name = sc.next();
                    System.out.println("please, enter your Lastname");
                    String lastName = sc.next();
                    System.out.println("please, enter your date of birth DD/MM/AAAA");
                    String birthday = sc.next();
                    System.out.println("please, enter your status: enrolled, inactive, graduated");
                    String status = sc.next();

                    listStudy.add(new Student(idTypebyClient, name, lastName, birthday, status));
                    System.out.println(listStudy.toString());

                }

    }



    @Override
    public void addCourse(Course course) {
        System.out.println("please, enter  ID course");
         course.setId(sc.nextInt());


        System.out.println("please, enter name course");
        course.setName(sc.next());
        System.out.println("please, enter a description");
        course.setDescription(sc.next());
        System.out.println("please, enter  the credits");
        course.setCredits(sc.nextInt());
        System.out.println("please, enter the Course version");
        course.setVersion(sc.next());

        course = new Course (course.getId(),course.getName(),course.getDescription(),course.getCredits(),course.getVersion());
        listCourse.add(course);
        System.out.println(course);


    }

    @Override
    public void enrollStudentCourse(Student student,Course course) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Student id");

        student.setId(scanner.nextInt());

        System.out.println("Enter the Course code");
        course.setId(scanner.nextInt());


        // Verificar si el estudiante ya está en el HashMap
        List<Course> enrolledCourses = seeker.getOrDefault(student.getId(), new ArrayList<>());


        // Agregar el nuevo curso a la lista de cursos del estudiante
        enrolledCourses.add(course);


        // Actualizar el HashMap con la lista de cursos del estudiante
        seeker.put(student.getId(), enrolledCourses);

        System.out.println(seeker);
        System.out.println("" +
                ".");


    }

    @Override
    public void unsubscribeStudentCourse(int idStudent, int idCourse) {

    }
}
