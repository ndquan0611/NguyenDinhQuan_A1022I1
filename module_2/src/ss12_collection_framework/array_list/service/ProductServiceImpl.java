package ss12_collection_framework.array_list.service;

import ss12_collection_framework.array_list.model.Product;
import ss12_collection_framework.array_list.repository.ProductRepository;
import ss12_collection_framework.array_list.repository.ProductRepositoryImpl;

import java.util.List;


public class ProductServiceImpl implements ProductService {
    private ProductRepository repository = new ProductRepositoryImpl();

    @Override
    public void addProduct(Product product) {
        repository.addProduct(product);
    }

    @Override
    public void editProduct(int id, Product product) {
        repository.editProduct(id, product);
    }

    @Override
    public void deleteProduct(int id) {
        repository.deleteProduct(id);
    }

    @Override
    public List<Product> showProduct() {
        return repository.showProduct();
    }

    @Override
    public void searchProduct(String name) {
        repository.searchProduct(name);
    }

    @Override
    public void sortProduct(int type) {
        repository.sortProduct(type);
    }
}
