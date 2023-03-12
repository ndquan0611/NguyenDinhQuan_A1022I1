package ss12_collection_framework.array_list.controller;

import ss12_collection_framework.array_list.model.Product;
import ss12_collection_framework.array_list.service.ProductService;
import ss12_collection_framework.array_list.service.ProductServiceImpl;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class ProductController {
    private static ProductService service = new ProductServiceImpl();

    static final Scanner sc = new Scanner(System.in);

    static void displayMainMethod(int select) throws IOException {
        do {
            System.out.println("-------Student Management------");
            System.out.println("1. Add new product");
            System.out.println("2. Edit product information");
            System.out.println("3. Delete product");
            System.out.println("4. Show product");
            System.out.println("5. Search product");
            System.out.println("6. Sort product");
            System.out.println("7. Exit");
            System.out.print("Please input number: ");

            int id;
            String name = "";
            long price;
            select = Integer.parseInt(sc.nextLine());

            switch (select) {
                case 1: // list
                    System.out.print("Enter id: ");
                    id = Integer.parseInt(sc.nextLine());
                    System.out.print("Enter name: ");
                    name = sc.nextLine();
                    System.out.print("Enter price: ");
                    price = Long.parseLong(sc.nextLine());

                    Product addProduct = new Product(id, name, price);
                    service.addProduct(addProduct);
                    break;
                case 2: // edit
                    System.out.print("Enter the id to edit: ");
                    int editId = Integer.parseInt(sc.nextLine());
                    System.out.print("Enter id: ");
                    id = Integer.parseInt(sc.nextLine());
                    System.out.print("Enter name: ");
                    name = sc.nextLine();
                    System.out.print("Enter price: ");
                    price = Long.parseLong(sc.nextLine());

                    Product editProduct = new Product(id, name, price);
                    service.editProduct(editId, editProduct);
                    break;
                case 3: // delete
                    System.out.print("Enter the id to delete: ");
                    int deleteId = Integer.parseInt(sc.nextLine());
                    service.deleteProduct(deleteId);
                    break;
                case 4: // show
                    List<Product> products = service.showProduct();
                    for (int i = 0; i < products.size(); i++) {
                        System.out.println(products.get(i));
                    }
                    break;
                case 5: // search
                    System.out.print("Enter a name to search: ");
                    String searchName = sc.nextLine();
                    service.searchProduct(searchName);
                    break;
                case 6: // sort
                    System.out.println("Sort");
                    System.out.println("1. Ascending price");
                    System.out.println("2. Descending price");
                    System.out.print("Choose sort product: ");
                    int type = Integer.parseInt(sc.nextLine());
                    service.sortProduct(type);
                    break;
                case 7: // exit
                    System.exit(0);
            }

        } while (true);
    }

    public static void main(String[] args) throws IOException {
        int select = 0;
        displayMainMethod(select);
    }
}
