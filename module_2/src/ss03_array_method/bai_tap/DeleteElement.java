package ss03_array_method.bai_tap;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập độ dài: ");
            size = sc.nextInt();
            if (size > 20)
                System.out.println("Không được quá 20");
        } while (size > 20);

        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.print("Nhập phần tử cần xóa " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            i++;
        }

        System.out.print("Nhập phần tử cần xóa: ");
        int deleteEle = sc.nextInt();
        int index = -1;

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == deleteEle) {
                index = j;
            }
        }

        System.out.print("Arr: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }

        for (int j = index; j < arr.length - 1; j++) {
            arr[j] = arr[j + 1];
        }
        arr[size - 1] = 0;

        System.out.println(" ");
        System.out.print("New Arr: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
