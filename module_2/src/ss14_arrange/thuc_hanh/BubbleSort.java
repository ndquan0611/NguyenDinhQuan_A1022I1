package ss14_arrange.thuc_hanh;

public class BubbleSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void main(String[] args) {
        boolean isCheck = true;

        for (int i = 0; i < list.length && isCheck; i++) {
            isCheck = false;
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[i];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;

                    isCheck = true;
                }
            }
        }
    }
}
