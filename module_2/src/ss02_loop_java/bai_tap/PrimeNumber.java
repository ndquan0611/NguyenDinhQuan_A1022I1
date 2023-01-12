package ss02_loop_java.bai_tap;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng số nguyên: ");
        int numbers = sc.nextInt();
        int count = 0;
        int N = 2;
        if (numbers <= 0) {
            System.out.println("Vui lòng nhập giá trị nguyên dương!");
        } else {
            while (count < numbers) {
                boolean isBoolean = true;
                for (int i = 2; i <= Math.sqrt(N); i++) {
                    if (N % i == 0) {
                        isBoolean = false;
                        break;
                    }
                }
                if (isBoolean) {
                    count++;
                    System.out.print(N + ", ");
                }
                N++;
            }
        }
    }
}
