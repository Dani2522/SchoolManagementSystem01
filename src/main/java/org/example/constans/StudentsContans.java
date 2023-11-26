package org.example.constans;

import org.example.entity.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public  class StudentsContans {

    public static List <Student> REGISTERED_STUDENT = new ArrayList<Student>(){
        { add(new Student(1,"Cristian","Cardona", "26/03/1998","inactive"));}
        {add(new Student(2,"pedro", "perez", "25/08/1945","enrolled"));}
        {add(new Student(3,"Juan", "Diaz", "02/02/1975","graduated"));}
        {add(new Student(4,"Camila", "Marino", "07/02/1995","enrolled"));}
        {add(new Student(5,"Sandra", "Lopez", "02/02/1976","inactive"));}
        {add(new Student(6,"Carlos", "Carranza", "02/02/1999","enrolled"));}
    };




}
