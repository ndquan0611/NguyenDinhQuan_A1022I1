package ss11_stack_queue_map.thuc_hanh.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MyLinkedHashMap {
    public static void main(String[] args) {
        Map<Integer, String> myMap = new LinkedHashMap<>();
        myMap.put(1, "A");
        myMap.put(2, "B");
        myMap.put(3, "C");
        myMap.put(4, "D");
        myMap.put(5, "E");
        myMap.replace(0, "SA"); // update, key ko ton tai thi ko update
        myMap.remove(1);

        for (Integer key : myMap.keySet()) {
            System.out.println(key + " - " + myMap.get(key));
        }
    }
}
