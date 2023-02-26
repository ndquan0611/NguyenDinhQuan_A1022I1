package ss00_java.demo.thuc_hanh;

public class Second {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.year);
        System.out.println("Graduation Year: " + student.year);
        student.study(); // call abstract method
    }
}
