package SS16_IO_binary_file.exam.manageProduct.service.impl;

import SS16_IO_binary_file.exam.manageProduct.common.WriteBinaryFile;
import SS16_IO_binary_file.exam.manageProduct.model.Product;
import SS16_IO_binary_file.exam.manageProduct.repository.IProductRepository;
import SS16_IO_binary_file.exam.manageProduct.repository.impl.ProductRepository;
import SS16_IO_binary_file.exam.manageProduct.service.IProductService;
import exam.managerCodegym.model.Teacher;
import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import static SS16_IO_binary_file.exam.manageProduct.common.ReadBinaryFile.readBinaryFile;
import static SS16_IO_binary_file.exam.manageProduct.common.WriteBinaryFile.writeBinaryFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ProductService implements IProductService {
    Scanner sc = new Scanner(System.in);
    private IProductRepository iProductRepository = new ProductRepository();
    @Override
    public void displayProduct() {
        List<Product> list = iProductRepository.displayProduct();

        if (list.size() == 0){
            System.out.println("danh sách trống");
        } else {
            for (Product temp: list) {
                System.out.println(temp);
            }
        }
    }

    @Override
    public void addProduct() {
        List<Product> productList = new ArrayList<>();
        System.out.print("nhập mã: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("nhập tên sản phẩm: ");
        String name = sc.nextLine();
        System.out.print("nhập giá: ");
        int price = Integer.parseInt(sc.nextLine());
        System.out.print("nhập nhà sản xuat: ");
        String producer = sc.nextLine();
        System.out.print("nội dung: ");
        String description = sc.nextLine();
        Product newProduct = new Product(id, name, price, producer, description);
        productList.add(newProduct);
        iProductRepository.addProduct(productList);
    }

    @Override
    public void findProduct() {
        List<Product> list = iProductRepository.displayProduct();

        System.out.print("nhập tên tìm kiếm: ");
        String searchName = sc.nextLine();
        boolean confirmName = iProductRepository.findProduct(searchName);;
        if (confirmName) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getNameProduct().equals(searchName)){
                    System.out.println(list.get(i));
                }
            }
        }
    }
}
