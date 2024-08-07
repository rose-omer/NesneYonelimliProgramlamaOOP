package ÖrnekProje;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class StudentStorer {
    private String filePath;
    private  String fieldDelimiter =";";
    private  String newLine="\n\r";

    public StudentStorer() {
    }

    public StudentStorer(String filePath) {
        this.filePath = filePath;
    }

    public void store(List<Student> studentList) throws IOException {
        FileWriter fw =new FileWriter(filePath);
        BufferedWriter bw =new BufferedWriter(fw);
        for(Student student : studentList){
            String line =format(student);
            bw.write(line+"\r\n");
        }
        bw.close();
    }

    private String format(Student student) {
        StringBuilder builder =new StringBuilder();
        builder.append(student.getStudentId()).append(";");
        builder.append(student.getStudentName()).append(";");
        builder.append(student.getAverageMark()).append(";");
        return builder.toString();
    }


    public String getFieldDelimiter() {
        return fieldDelimiter;
    }

    public void setFieldDelimiter(String fieldDelimiter) {
        this.fieldDelimiter = fieldDelimiter;
    }

    public String getNewLine() {
        return newLine;
    }

    public void setNewLine(String newLine) {
        this.newLine = newLine;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
