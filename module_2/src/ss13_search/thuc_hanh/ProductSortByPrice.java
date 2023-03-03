package ss13_search.thuc_hanh;


import java.util.Comparator;

public class ProductSortByPrice implements Comparator<Product> {
    public int compare(Product o1, Product o2) {
        if (o1.getPrice() == o2.getPrice()) {
            return 0;
        } else if (o1.getPrice() > o2.getPrice()) {
            return 99;
        } else {
            return -2;
        }
    }
}
