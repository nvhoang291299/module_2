package SS16_IO_binary_file.exam.manageProduct.controller;

import SS16_IO_binary_file.exam.manageProduct.service.IProductService;
import SS16_IO_binary_file.exam.manageProduct.service.impl.ProductService;

import java.util.Scanner;

public class ProductController {
    public void productController(){
        Scanner sc = new Scanner(System.in);
        IProductService iProductService = new ProductService();
        System.out.println("=======quản lý sản phẩm======= \n" +
                "1. Hiển thị danh sách \n" +
                "2. Thêm sản phẩm \n" +
                "3. Tìm kiếm sản phẩm \n" +
                "4.Thoát");
        byte choice;
        do {
            System.out.print("Chọn chức năng: ");
            choice = Byte.parseByte(sc.nextLine());
            switch (choice) {
                case 1:
                    iProductService.displayProduct();
                    break;
                case 2:
                    iProductService.addProduct();
                    break;
                case 3:
                    iProductService.findProduct();
            }
        } while(choice > 0 && choice <= 3);
    }

}
