package ss09_arraylist.thuc_hanh;

import java.util.Arrays;

public class MyList {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
        System.out.println(elements.length);
        for (Object element : elements) {
            System.out.println(element);
        }
    }

    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
        System.out.println(elements.length);
        for (Object element : elements) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        MyList myList = new MyList();
        System.out.println("\n");
        myList.ensureCapacity();
    }
}
