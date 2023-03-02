package SS11_map_and_tree.productManager.controller;

import SS11_map_and_tree.productManager.service.IProductService;
import SS11_map_and_tree.productManager.service.impl.ProductService;

import java.util.Scanner;

public class ProductController {
    private IProductService iProductService = new ProductService();
    int num;
    public void productController(){
        Scanner sc = new Scanner(System.in);
        System.out.println("==========Quản lý sản phẩm==========");
        System.out.println(
                "1. Thêm sản phẩm \n" +
                "2. Sửa sản phẩm \n" +
                "3. Xóa sản phẩm \n" +
                "4. Hiển thị danh sách sản phẩm \n" +
                "5. Tìm kiếm sản phẩm \n" +
                "6. Sắp xếp sản phẩm theo tăng dần \n" +
                "7. Thoát \n");
        System.out.println("=====================================");

         do {
            System.out.print("Mời bạn chọn chức năng: ");
            num = sc.nextInt();
            switch (num) {
                case 1:
                    iProductService.addProduct();
                    break;
                case 2:
                    iProductService.editProduct();
                    break;
                case 3:
                    iProductService.deleteProduct();
                    break;
                case 4:
                    iProductService.displayAll();
                    break;
                case 5:
                    iProductService.searchProduct();
                    break;
                case 6:
                    System.out.println("bạn dã thoát hệ thống");
            }
        } while(num >= 1 && num <= 5);
    }
}
