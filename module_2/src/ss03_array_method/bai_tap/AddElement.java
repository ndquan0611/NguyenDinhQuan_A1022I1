package ss03_array_method.bai_tap;

import java.util.Scanner;

public class AddElement {
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
            System.out.print("Nhập phần tử " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            i++;
        }

        System.out.println("Nhập giá trị mới cần chèn vào mảng");
        int newValue = sc.nextInt();

        System.out.println("Nhập vị trí chèn");
        int positions = sc.nextInt();

        System.out.println("Mảng cũ:");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }

        int[] newArr = new int[size + 1];
        for (int j = 0; j < positions; j++) {
            newArr[j] = arr[j];
        }

        newArr[positions] = newValue;

        for (int j = positions; j < arr.length; j++) {
            newArr[j + 1] = arr[j];
        }

        System.out.println("");

        System.out.println("Mảng mới");
        for (int j = 0; j < newArr.length; j++) {
            System.out.print(newArr[j] + " ");
        }
    }
}
