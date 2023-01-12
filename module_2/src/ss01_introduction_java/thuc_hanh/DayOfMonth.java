package ss01_introduction_java.thuc_hanh;

import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month;

        System.out.print("Nhập tháng: ");
        month = sc.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.printf("Tháng %d có 31 ngày", month);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.printf("Tháng %d có 30 ngày", month);
                break;
            case 2:
                System.out.printf("Tháng %d có 28 hoặc 29 ngày", month);
                break;
            default:
                System.out.println("Vui lòng nhập lại tháng!");
        }
    }
}
