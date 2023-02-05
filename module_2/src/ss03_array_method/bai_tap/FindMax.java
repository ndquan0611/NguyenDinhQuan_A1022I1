package ss03_array_method.bai_tap;

import java.util.Scanner;

public class FindMax {
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

        int max = arr[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }

        System.out.println("Phần tử lớn nhất trong mảng = " + max);
    }
}
