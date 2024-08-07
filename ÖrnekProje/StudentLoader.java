package ÖrnekProje;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class StudentLoader {
    private String filePath;
    private String fieldDelimiter = ";";

    public StudentLoader(String filePath) {
        this.filePath = filePath;
    }

    public List<Student> load() throws IOException {
        List<Student> studentList = new ArrayList<Student>();
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            Student student = parse(line);
            studentList.add(student);
        }
        bufferedReader.close();
        return studentList;
    }

    private Student parse(String line) {
        StringTokenizer tokenizer = new StringTokenizer(line, fieldDelimiter);
        long studentId = Long.parseLong(tokenizer.nextToken());
        String studentName = tokenizer.nextToken();
        double averageMark = Double.parseDouble(tokenizer.nextToken());
        return new Student(studentId, studentName, averageMark);
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFieldDelimiter() {
        return fieldDelimiter;
    }

    public void setFieldDelimiter(String fieldDelimiter) {
        this.fieldDelimiter = fieldDelimiter;
    }
}
