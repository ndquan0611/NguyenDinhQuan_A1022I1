package ss15_exception.bai_tap;

import java.util.Scanner;

public class MyException {
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.print("Nhập cạnh a: ");
            int a = sc.nextInt();

            System.out.print("Nhập cạnh b: ");
            int b = sc.nextInt();

            System.out.print("Nhập cạnh c: ");
            int c = sc.nextInt();

            if (a < 0 || b < 0 || c < 0) {
                throw new IllegalTriangleException("Nhập lại cạnh sao cho lớn hơn 0!");
            } else if (a + b < c || a + c < b || b + c < a) {
                throw new IllegalTriangleException("Nhập tổng hai cạnh phải lớn hơn cạnh còn lại!");
            }
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }
}
