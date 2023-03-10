package SS16_IO_binary_file.exam.manageProduct.repository.impl;

import SS16_IO_binary_file.exam.manageProduct.common.ReadBinaryFile;
import SS16_IO_binary_file.exam.manageProduct.common.WriteBinaryFile;
import SS16_IO_binary_file.exam.manageProduct.model.Product;
import SS16_IO_binary_file.exam.manageProduct.repository.IProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static List<Product> productList = new ArrayList<>();

    @Override
    public List<Product> displayProduct() {
        productList = ReadBinaryFile.readBinaryFile("src/SS16_IO_binary_file/exam/manageProduct/data/data.txt");

       return productList;
    }

    @Override
    public void addProduct(List<Product> products) {

        WriteBinaryFile.writeBinaryFile("src/SS16_IO_binary_file/exam/manageProduct/data/data.txt",products);
    }

    @Override
    public boolean findProduct(String product) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getNameProduct().equals(product)) {
                return true;
            }
        }
        System.out.println("tên không tồn tại");
        return false;
    }
}
