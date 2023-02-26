package ss11_stack_queue_map.bai_tap.reverse;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> wStack = new Stack();

        System.out.print("Nhập một chuỗi: ");
        String mWord = sc.nextLine();
        String[] arrWord = mWord.split("");

        // Mảng ban đầu:
        System.out.print("Mảng ban đầu: ");
        for (int i = 0; i < arrWord.length; i++) {
            System.out.print(arrWord[i]);
            wStack.push(arrWord[i]);
        }

        for (int i = 0; i < arrWord.length; i++) {
            arrWord[i] = wStack.pop();
        }

        // Mảng đảo ngược
        System.out.print("\nMảng đảo ngược: ");
        for (int i = 0; i < arrWord.length; i++) {
            System.out.print(arrWord[i]);
        }

    }
}
