package ss01_introduction_java.thuc_hanh;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner sc = new Scanner(System.in);
        // Chiều rộng
        System.out.print("Nhập chiều rộng: ");
        width = sc.nextFloat();
        // Chiều cao
        System.out.print("Nhập chiều cao: ");
        height = sc.nextFloat();

        float area = width * height;

        System.out.println("Chiều cao: " + height);
        System.out.println("Chiều rộng: " + width);
        System.out.println("Diện tích: " + area);
    }
}
