package ss09_arraylist.thuc_hanh;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedList {
    public static void main(String[] args) {
        List myArr = new LinkedList();
        myArr.add(1);
        myArr.add(4);
        myArr.add(3);


        for (int i = 0; i < myArr.size(); i++) {
            System.out.println(myArr.get(i));
        }




    }
}
