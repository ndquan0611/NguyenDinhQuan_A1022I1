package ss11_stack_queue_map.thuc_hanh.map;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "A");
        myMap.put(2, "B");
        myMap.put(3, "C");
        myMap.put(4, "D");
        myMap.put(5, "E");

        for (Map.Entry<Integer, String> entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        /*
        for (Integer key : myMap.keySet()) {
            System.out.println(key + " - " + myMap.get(key));
        }


        */

        /*
        Student student1 = new Student(1, "Nguyen Van A");
        Student student2 = new Student(2, "Nguyen Van B");
        Student student3 = new Student(3, "Nguyen Van C");
        Student student4 = new Student(4, "Nguyen Van D");
        Student student5 = new Student(5, "Nguyen Van E");
        Map<Student, Integer> studentMap = new HashMap<>();
        studentMap.put(student1, 11);
        studentMap.put(student2, 22);
        studentMap.put(student3, 33);
        studentMap.put(student4, 44);
        studentMap.put(student5, 55);

        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student3.hashCode());
        System.out.println(student4.hashCode());
        System.out.println(student5.hashCode());

        for (Map.Entry<Student, Integer> entry : studentMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
         */
    }
}
