package ss11_stack_queue_map.bai_tap.reverse;

import java.util.Scanner;
import java.util.Stack;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> myStack = new Stack<>();
        int size;
        do {
            System.out.print("Nhập độ dài: ");
            size = sc.nextInt();
            if (size > 20)
                System.out.println("Độ dài vượt quá 20!");
        } while (size > 20);

        int[] arr = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
            myStack.push(arr[i]);
            i++;
        }

        // Mảng ban đầu:
        System.out.print("Mảng ban đầu: ");
        for (int j = 0; j < size; j++) {
            System.out.print(arr[j] + "\t");
        }

        for (int j = 0; j < size; j++) {
            arr[j] = myStack.pop();
        }

        // Mảng đảo ngược:
        System.out.print("\nMảng đảo ngược: ");
        for (int j = 0; j < size; j++) {
            System.out.print(arr[j] + "\t");
        }
    }
}
