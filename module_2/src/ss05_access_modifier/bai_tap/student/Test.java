package ss05_access_modifier.bai_tap.student;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Quan");
        student.setClasses("A1022I1");

        System.out.println(student.getName());
        System.out.println(student.getClasses());
    }
}
