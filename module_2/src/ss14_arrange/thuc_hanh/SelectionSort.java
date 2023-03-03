package ss14_arrange.thuc_hanh;

public class SelectionSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};

    static void selectionSort(double[] list) {
        for (int i = 0; i < list.length; i++) {
            double minValue = list[i];
            int minIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (minValue > list[j]) {
                    minValue = list[j];
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                list[minIndex] = list[i];
                list[i] = minValue;
            }
        }
    }

    public static void main(String[] args) {
        selectionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
