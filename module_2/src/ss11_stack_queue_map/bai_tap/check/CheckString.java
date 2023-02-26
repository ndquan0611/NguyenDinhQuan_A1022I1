package ss11_stack_queue_map.bai_tap.check;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CheckString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi bạn muốn kiểm tra: ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        String[] arr = str.split("");
        Queue queue = new LinkedList();

        for (int i = arr.length - 1; i >= 0; i--) {
            queue.add(arr[i]);
        }

        String reverseStr = "";
        while (!queue.isEmpty()) {
            reverseStr += queue.remove();
        }

        if (str.equals(reverseStr)) {
            System.out.println("Đây là chuỗi đối xứng.");
        } else  {
            System.out.println("Đây không phải là chuỗi đối xứng.");
        }
    }
}
