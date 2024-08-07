package ÖrnekProje;

import java.util.ArrayList;
import java.util.List;

public class SchoolTest {
    public static void main(String[] args) {


        School schoolA = new School(140, "ÖMER AKAMDEMİSİ  ");
        List<Student> studentList = new ArrayList<Student>();
        schoolA.setStudentList(studentList);

        Student student0 = new Student(341, "ÖMERKÖSE", 3.8);
        student0.setSchool(schoolA);
        schoolA.getStudentList().add(student0);

        Student student1 = new Student(342, "kübra varol", 3.9);
        student1.setSchool(schoolA);
        schoolA.getStudentList().add(student1);

        Student student2 = new Student(343, "sami erdoğ", 3.5);
        student2.setSchool(schoolA);
        schoolA.getStudentList().add(student2);

        System.out.println("Okul no "+schoolA.getSchoolId());
        System.out.println("Okul Adı "+schoolA.getSchoolName());


        for (Student student : studentList){
            System.out.println(student.getStudentId()+" "+student.getStudentName()+" "+student.getAverageMark());
        }
    }
}