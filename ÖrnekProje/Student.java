package ÖrnekProje;

public class Student {
    private long studentId;

    private String studentName;
    private double averageMark;

    private  School school;

    public Student(long studentId, String studentName, double averageMark) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.averageMark = averageMark;
    }

    public Student() {
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
