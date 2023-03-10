package SS16_IO_binary_file.exam.manageProduct.repository;

import SS16_IO_binary_file.exam.manageProduct.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> displayProduct();
    void addProduct(List<Product> products);
    boolean findProduct(String products);
}
