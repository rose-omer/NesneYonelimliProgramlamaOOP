package ÖrnekProje;

import java.awt.*;
import java.io.IOException;
import java.util.List;

public class StudentLoaderTest {

    public static void main(String[] args) throws IOException {
        String filePath = "src/ÖrnekProje/wrtite.txt";
        StudentLoader loader = new StudentLoader(filePath);
        loader.setFieldDelimiter(";");

       List<Student> studentList =loader.load();


        for (Student student : studentList) {
            System.out.println(student.getStudentId() + " " + student.getStudentName() + " " + student.getAverageMark());
        }


    }
}
