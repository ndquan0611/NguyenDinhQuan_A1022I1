package ss14_arrange.bai_tap;

import java.util.Scanner;

public class InsertionSort {
    static final Scanner sc = new Scanner(System.in);

    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int currentEle = arr[i];
            int k = i - 1;
            for (; k >= 0 && arr[k] > currentEle; k--) {
                arr[k + 1] = arr[k];
            }

            arr[k + 1] = currentEle;
        }
    }

    public static void main(String[] args) {
        int size;
        do {
            System.out.print("Nhập độ dài của mảng: ");
            size = sc.nextInt();
            if (size > 20)
                System.out.println("Độ dài đã vượt quá điều kiện của mảng!");
        } while (size > 20);

        int[] arr = new int[size];
        int k = 0;
        while (k < arr.length) {
            System.out.print("arr[" + k + "] = ");
            arr[k] = sc.nextInt();
            k++;
        }

        // Mảng ban đầu
        System.out.println("Mảng ban đầu: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        System.out.println("");
        insertionSort(arr);
        // Mảng sắp xếp
        System.out.println("Mảng sắp xếp: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
