package ss00_java.demo.bai_tap.delete_element;

import java.util.Scanner;

public class DeleteElement {
    public static int getLocation(int[] arr, int e) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == e) {
                index = i;
            }
        }
        return index;
    }

    public static int[] getDeleteEl(int[] arr, int index, int size) {
        int[] newArr = new int[size];
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        for (int i = index + 1; i < arr.length; i++) {
            newArr[i - 1] = arr[i];
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

        System.out.println(" ");
        System.out.print("Nhập phần tử cần xóa: ");
        int delete = sc.nextInt();
        int locationDel = getLocation(arr, delete);

        if (locationDel == -1) {
            System.out.println("Phần tử không có ở trong mảng!");
        } else {
            arr = getDeleteEl(arr, locationDel, size);
        }

        System.out.println("Mảng sau khi xóa: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
