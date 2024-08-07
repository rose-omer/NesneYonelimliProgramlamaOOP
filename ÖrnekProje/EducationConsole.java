package ÖrnekProje;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class EducationConsole {
    private final static String STUDENT_FILE = "src/ÖrnekProje/write.txt";
    private static Scanner scanner = new Scanner(System.in);
    private static School school = new School(911, "Kübrakolej");
    private static StudentStorer storer = new StudentStorer(STUDENT_FILE);
    private static StudentLoader loader = new StudentLoader(STUDENT_FILE);

    private static void printMenu() {
        System.out.println("1 , Listele ");
        System.out.println("2 , Ekle  ");
        System.out.println("3 , Güncelle ");
        System.out.println("4 , Sil ");
        System.out.println("5 , Göster ");
        System.out.println("6 , Yükle  ");
        System.out.println("7 , Sakla ");
        System.out.println("0 , Çık ");
    }

    private static int scanChoice() {
        System.out.println("LÜTFEN SEÇİM YAPINIZ ..");
        int choice = scanner.nextInt();
        System.out.println("Seçiminiz " + choice);
        return choice;
    }

    public static void handleCommand(int choice) {
        System.out.println("İşlenen komut ..." + choice);
        switch (choice) {
            case 1: listStudents(); break;
            case 2: insertStudents(); break;
            case 3: updateStudents(); break;
            case 4: deleteStudents(); break;
            case 5: showStudents(); break;
            case 6: loadStudents(); break;
            case 7: storeStudents(); break;
            case 0: exitStudents(); break;
            default: System.out.println("Geçersiz seçim...");
        }
    }

    private static void listStudents() {
        System.out.println("LİSTELENİYOR...");
        for (Student student : school.getStudentList()) {
            System.out.println(student.getStudentId() + " " + student.getStudentName() + " " + student.getAverageMark());
        }
        System.out.println("Öğrenci sayısı: " + school.getStudentList().size());
    }

    private static void insertStudents() {
        System.out.println("EKLENİYOR...");
        System.out.println("Öğrenci no: ");
        long studentId = scanner.nextLong();
        System.out.println("Öğrenci adı: ");
        String studentName = scanner.next();
        System.out.println("Öğrenci ortalama not: ");
        double averageMark = scanner.nextDouble();
        Student student = new Student(studentId, studentName, averageMark);
        school.getStudentList().add(student);
    }

    private static void storeStudents() {
        System.out.println("SAKLANIYOR...");
        try {
            storer.store(school.getStudentList());
            System.out.println("Öğrenciler başarıyla saklandı.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void showStudents() {
        System.out.println("GÖSTERİLİYOR...");
        listStudents();
    }

    private static void exitStudents() {
        System.out.println("ÇIKILIYOR...");
        exitConsole();
    }

    private static void loadStudents() {
        System.out.println("YÜKLENİYOR...");
        try {
            List<Student> students = loader.load();
            school.setStudentList(students);
            System.out.println("Öğrenciler başarıyla yüklendi.");
        } catch (IOException e) {
            System.err.println("Öğrenciler yüklenirken hata oluştu: " + e.getMessage());
        }
    }

    private static void selectStudents() {
        System.out.println("SEÇİLİYOR...");
        System.out.println("Öğrenci no: ");
        long studentId = scanner.nextLong();
        for (Student student : school.getStudentList()) {
            if (student.getStudentId() == studentId) {
                System.out.println("Seçilen öğrenci: " + student.getStudentId() + " " + student.getStudentName() + " " + student.getAverageMark());
                return;
            }
        }
        System.out.println("Öğrenci bulunamadı.");
    }

    private static void deleteStudents() {
        System.out.println("SİLİNİYOR...");
        System.out.println("Öğrenci no: ");
        long studentId = scanner.nextLong();
        school.getStudentList().removeIf(student -> student.getStudentId() == studentId);
        System.out.println("Öğrenci silindi.");
    }

    private static void updateStudents() {
        System.out.println("GÜNCELLENİYOR...");
        System.out.println("Güncellenecek öğrenci no: ");
        long studentId = scanner.nextLong();
        for (Student student : school.getStudentList()) {
            if (student.getStudentId() == studentId) {
                System.out.println("Yeni öğrenci adı: ");
                String studentName = scanner.next();
                System.out.println("Yeni öğrenci ortalama not: ");
                double averageMark = scanner.nextDouble();
                student.setStudentName(studentName);
                student.setAverageMark(averageMark);
                System.out.println("Öğrenci güncellendi.");
                return;
            }
        }
        System.out.println("Öğrenci bulunamadı.");
    }

    private static void exitConsole() {
        System.exit(0);
    }

    public static void main(String[] args) {
        while (true) {
            printMenu();
            int choice = scanChoice();
            handleCommand(choice);
        }
    }
}
