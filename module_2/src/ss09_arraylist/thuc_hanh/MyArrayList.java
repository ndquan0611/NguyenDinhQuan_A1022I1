package ss09_arraylist.thuc_hanh;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {
    public static void main(String[] args) {
        List myArr = new ArrayList();
        myArr.add(1);
        myArr.add(2);
        myArr.add(3);

        myArr.remove(0);

        for (int i = 0; i < myArr.size(); i++) {
            System.out.println(myArr.get(i));
        }
    }
}
