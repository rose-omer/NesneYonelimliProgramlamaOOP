package ÖrnekProje;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentStorerTest {
    public static void main(String[] args) throws IOException {
        String filePath ="src/ÖrnekProje/wrtite.txt";
        StudentStorer studentStorer =new StudentStorer(filePath);


        List<Student> studentList =new ArrayList<>();
        Student student0 = new Student(341, "ÖMERKÖSE", 3.8);
        studentList.add(student0);
        Student student1 = new Student(342, "kübra varol", 3.9);
        studentList.add(student1);
        Student student2 = new Student(343, "sami erdoğ", 3.5);
        studentList.add(student2);

        System.out.println("Kayıt Basşarılı...");


        studentStorer.store(studentList);


    }
}
