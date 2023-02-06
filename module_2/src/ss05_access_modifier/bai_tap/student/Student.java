package ss05_access_modifier.bai_tap.student;

public class Student {
    private String name;
    private String classes;

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public Student() {
        this("John", "C02");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
