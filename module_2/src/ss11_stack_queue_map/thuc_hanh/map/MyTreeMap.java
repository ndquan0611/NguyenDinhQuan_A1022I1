package ss11_stack_queue_map.thuc_hanh.map;

import java.util.Map;
import java.util.TreeMap;

public class MyTreeMap {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Nguyen Van A");
        Student student2 = new Student(2, "Nguyen Van B");
        Student student3 = new Student(3, "Nguyen Van C");
        Student student4 = new Student(4, "Nguyen Van D");
        Student student5 = new Student(5, "Nguyen Van E");
        Map<Student, Integer> studentMap = new TreeMap<>();
        studentMap.put(student1, 11);
        studentMap.put(student2, 22);
        studentMap.put(student3, 33);
        studentMap.put(student4, 44);
        studentMap.put(student5, 55);

        for (Student key : studentMap.keySet()) {
            System.out.println(key + " - " + studentMap.get(key));
        }

    }
}
