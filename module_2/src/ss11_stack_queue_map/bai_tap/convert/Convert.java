package ss11_stack_queue_map.bai_tap.convert;

import java.util.Scanner;
import java.util.Stack;

public class Convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.print("Nhập vào số thập phân: ");
        int num = sc.nextInt();
        while (num != 0) {
            int numBinary = num % 2;
            System.out.println(numBinary);
            stack.push(numBinary);
            num /= 2;
        }

        System.out.print("\nGiá trị nhị phân là: ");
        while (!(stack.isEmpty())) {
            System.out.print(stack.pop());
        }
    }
}
