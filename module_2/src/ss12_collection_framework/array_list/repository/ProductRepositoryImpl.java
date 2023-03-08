package ss12_collection_framework.array_list.repository;

import ss12_collection_framework.array_list.model.Product;

import java.util.*;

public class ProductRepositoryImpl implements ProductRepository {
    private static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "Quần", 130000));
        productList.add(new Product(2, "Áo", 200000));
        productList.add(new Product(3, "Nón", 100000));
        productList.add(new Product(4, "Áo khoác", 230000));
        productList.add(new Product(5, "Giày", 400000));
    }

    @Override
    public void addProduct(Product product) {
        productList.add(product);
    }

    @Override
    public void editProduct(int id, Product product) {
        for (int i = 0; i < productList.size(); i++) {
            if ((productList.get(i).getId()) == id) {
                productList.set(i, product);
            }
        }
    }

    @Override
    public void deleteProduct(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if ((productList.get(i).getId()) == id) {
                productList.remove(i);
            }
        }
    }

    @Override
    public List<Product> showProduct() {
        return new ArrayList<>(productList);
    }

    @Override
    public void searchProduct(String name) {
        for (int i = 0; i < productList.size(); i++) {
            if (name.equals(productList.get(i).getName())) {
                System.out.print(productList.get(i));
            }
        }
    }

    @Override
    public void sortProduct(int type) {
        if (type == 1) {
            Collections.sort(productList, Comparator.comparing(Product::getPrice));
        } else if (type == 2) {
            Comparator<Product> comparator = Comparator.comparing(Product::getPrice);
            Collections.sort(productList,comparator.reversed());
        } else {
            System.out.println("Please, only type 1 or 2");
        }
    }
}
