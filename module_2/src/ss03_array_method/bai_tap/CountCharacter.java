package ss03_array_method.bai_tap;

import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập một chuỗi:");
        String str = sc.next();
        System.out.println("Nhập vào 1 ký tự cần tìm kiếm:");
        char c = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        System.out.print(count);
    }
}
