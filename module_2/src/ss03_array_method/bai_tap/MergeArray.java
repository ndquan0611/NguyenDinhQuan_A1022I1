package ss03_array_method.bai_tap;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều dài mảng 1");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Nhập giá trị mảng tại vị trí " + i);
            arr1[i] = sc.nextInt();
        }

        System.out.print("Nhập chiều dài mảng 2");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];

        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Nhập giá trị mảng tại vị trí " + i);
            arr2[i] = sc.nextInt();
        }

        int size3 = size1 + size2;
        int[] arr3 = new int[size3];

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            arr3[i + size1] = arr2[i];
        }

        System.out.println("Mảng 1:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println("");

        System.out.println("Mảng 2:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        System.out.println("");

        System.out.println("Mảng 3:");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
