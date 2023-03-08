package ss12_collection_framework.array_list.repository;

import ss12_collection_framework.array_list.model.Product;

import java.util.List;

public interface ProductRepository {
    void addProduct(Product product);
    void editProduct(int id, Product product);
    void deleteProduct(int id);
    List<Product> showProduct();
    void searchProduct(String name);
    void sortProduct(int type);
}
