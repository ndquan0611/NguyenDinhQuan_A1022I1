package ss11_stack_queue_map.bai_tap.count;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập một chuỗi: ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        String[] arr = str.split(" ");

        String key = "";
        int value;

        Map<String, Integer> myMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            key = arr[i];
            if (myMap.containsKey(key)) {
                value = myMap.get(key);
                myMap.put(key, value + 1);
            } else {
                myMap.put(key, 1);
            }
        }

        for (String k : myMap.keySet()) {
            System.out.println("Từ \"" + k + "\" xuất hiện: " + myMap.get(k) + " lần.");
        }
    }
}
