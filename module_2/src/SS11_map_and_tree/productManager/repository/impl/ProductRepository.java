package SS11_map_and_tree.productManager.repository.impl;

import SS11_map_and_tree.productManager.model.Product;
import SS11_map_and_tree.productManager.repository.IProductRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductRepository implements IProductRepository {
    Scanner sc = new Scanner(System.in);
    private static ArrayList<Product> list = new ArrayList<>();
    static {
        list.add(new Product(1, "Doraemon", 20000));
        list.add(new Product(2, "Conan", 21000));
        list.add(new Product(3, "Naruto", 22000));
        list.add(new Product(4, "One piece", 23000));
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
    public String searchProduct() {
        System.out.print("nhập tên mà bạn muốn tìm kiếm: ");
        String nameProduct = sc.nextLine();
        return nameProduct;
    }

//    @Override
//    public void editProduct(int editId, String nameProduct, int price) {
//    }
    @Override
    public int editProduct() {
        System.out.print("nhập mã mà bạn muốn chỉnh sửa: ");
        int editId = Integer.parseInt(sc.nextLine());
        list.get(editId);
        return editId;
    }
}
