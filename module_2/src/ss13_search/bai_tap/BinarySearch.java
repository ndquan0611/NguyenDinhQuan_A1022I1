package ss13_search.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    static final Scanner sc = new Scanner(System.in);

    static int binarySearch(int[] arr, int left, int right, int value) {
        while (left <= right) {
            int middle = (left + right) / 2;

            if (arr[middle] == value) {
                return middle;
            } else if (value > arr[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int size;
        System.out.print("Nhập độ dài của mảng: ");
        size = sc.nextInt();
        int[] arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
            i++;
        }

        System.out.println("Mảng ban đầu: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }

        Arrays.sort(arr);
        System.out.println("\nMảng sau khi được sắp xếp: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }

        System.out.println(binarySearch(arr, 0, arr.length - 1, 1));
    }
}
