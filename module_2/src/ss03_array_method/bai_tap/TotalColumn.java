package ss03_array_method.bai_tap;

import java.util.Scanner;

public class TotalColumn {
    public static void main(String[] args) {
        int m, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số dòng: ");
        m = sc.nextInt();
        System.out.print("Nhập số cột: ");
        n = sc.nextInt();

        int[][] arr = new int[m][n];
        System.out.println("Nhập các phần tử cho mảng");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println(" ");
        }

        System.out.println("Tính tổng cột nào xin mời nhập: ");
        int column = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][column - 1];
        }

        System.out.println("Tổng: " + sum);
    }
}
