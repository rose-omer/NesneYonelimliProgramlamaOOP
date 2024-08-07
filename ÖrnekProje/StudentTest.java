package ÖrnekProje;

public class StudentTest {

    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentId(320);
        student.setStudentName("Neget Ertag");
        student.setAverageMark(3.9);

        System.out.println("Öğrenci no " + student.getStudentId());
        System.out.println("Öğrenci adı  " + student.getStudentName());
        System.out.println("Öğrenci not   " + student.getAverageMark());

        Student student1 = new Student(321, "MUHSİN TOPRAK", 3.6);
        System.out.printf("%10d %20s %10.2f\r\n",
                student1.getStudentId(),
                student1.getStudentName(),
                student1.getAverageMark());
    }

}
