package SS11_map_and_tree.productManager.repository.impl;

import SS11_map_and_tree.productManager.model.Product;
import SS11_map_and_tree.productManager.repository.IProductRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductRepository implements IProductRepository {
    Scanner sc = new Scanner(System.in);
    private static ArrayList<Product> list = new ArrayList<>();
    static {
        list.add(new Product(1, "Doraemon", 25000));
        list.add(new Product(2, "Conan", 21000));
        list.add(new Product(3, "Naruto", 30000));
        list.add(new Product(7, "Naruto", 30000));
        list.add(new Product(8, "Naruto", 30000));
        list.add(new Product(4, "One piece", 27000));
        list.add(new Product(5, "Dragonball", 24000));
    }
    @Override
    public ArrayList<Product> displayAll() {
        return list;
    }

    @Override
    public void deleteProduct(int id) {
        list.remove(id);
    }
    @Override
    public void addProduct(Product product) {
        list.add(product);
    }
    @Override
    public boolean searchProduct(String searchName) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNameProduct().equals(searchName)) {
                return true;
            }
        }
        System.out.println("tên không tồn tại");
        return false;
    }
    @Override
    public void sortProduct() {}
    @Override
    public boolean editProduct(int editId) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == editId) {
                return true;
            }
        }
        System.out.println("mã không tồn tại");
        return false;
    }
}
