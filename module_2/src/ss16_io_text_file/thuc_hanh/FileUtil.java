package ss16_io_text_file.thuc_hanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileUtil {
    private static final String FILE_PATH = "E:\\Workspace\\codegym\\module_2\\src\\ss16_io_text_file\\thuc_hanh\\student.csv";
    private static List<Student> studentList = new ArrayList<>();


    public static List<Student> readCSV() throws IOException {
        FileReader fileReader = new FileReader(FILE_PATH);
        BufferedReader buff = new BufferedReader(fileReader);
        String line = "";
        String temp[];
        Student student;

        while ((line = buff.readLine()) != null) {
            temp = line.split(",");
            int id = Integer.parseInt(temp[0]);
            String name = temp[1];
            float point = Float.parseFloat(temp[2]);

            student = new Student(id, name, point);
            studentList.add(student);
        }
        buff.close();
        return studentList;
    }

    public static void writeCSV(Student student) throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_PATH, true);
        BufferedWriter buff = new BufferedWriter(fileWriter);
        buff.write(student.getId() + "," + student.getName() + "," + student.getPoint() + "\n");
        buff.close();
    }

    public static void main(String[] args) throws IOException {
        List<Student> studentList = readCSV();
        for (Student student : studentList) {
            System.out.println(student);
        }

//        Student student = new Student(3, "Nam", 300);
//        writeCSV(student);
    }
}
