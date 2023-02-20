package ss00_java.demo.bai_tap.add_element;

import java.util.Scanner;

public class AddElement {
    public static int[] getInsert(int[] arr, int size, int index, int e) {
        int[] newArr = new int[size + 1];
        newArr[index] = e;

        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        for (int i = index; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        return newArr;
    }

    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập độ dài: ");
            size = sc.nextInt();
            if (size > 20)
                System.out.println("Không được quá 20");
        } while (size > 20);

        int[] arr = new int[size];
        int j = 0;
        while (j < arr.length) {
            System.out.print("arr[" + j + "]: ");
            arr[j] = sc.nextInt();
            j++;
        }

        System.out.println("Mảng ban đầu: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        System.out.println("");
        System.out.print("Nhập phần tử chèn vào: ");
        int newValue = sc.nextInt();

        System.out.print("Nhập vị trí cần chèn: ");
        int positions = sc.nextInt();

        arr = getInsert(arr, size, positions, newValue);

        System.out.println("Mảng sau khi chen: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
