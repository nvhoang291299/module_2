package SS11_map_and_tree.productManager.repository;

import SS11_map_and_tree.productManager.model.Product;

import java.util.ArrayList;

public interface IProductRepository {
    ArrayList<Product> displayAll();
    void deleteProduct(int id);
    void addProduct(Product product);
    boolean editProduct(int editId);
    boolean searchProduct(String searchName);
    void sortProduct();
}
