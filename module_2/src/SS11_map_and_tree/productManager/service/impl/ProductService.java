package SS11_map_and_tree.productManager.service.impl;

import SS11_map_and_tree.productManager.model.Product;
import SS11_map_and_tree.productManager.repository.IProductRepository;
import SS11_map_and_tree.productManager.repository.impl.ProductRepository;
import SS11_map_and_tree.productManager.service.IProductService;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductService implements IProductService {
    Scanner sc = new Scanner(System.in);
    private IProductRepository iProductRepository = new ProductRepository();
    ArrayList<Product> list = iProductRepository.displayAll();
    @Override
    public void displayAll() {
        if (list.size() == 0){
            System.out.println("danh sách trống");
        } else {
            for (Product product : list) {
                System.out.println(product);
            }
        }
    }

    @Override
    public void deleteProduct() {
        System.out.print("Nhập mã mà bạn muốn xóa: ");
        int deleteId = Byte.parseByte(sc.nextLine());
        for (int i = 0; i < list.size(); i++) {
            if (deleteId == list.get(i).getId()){
                System.out.println("Bạn có muốn xóa hay không? (yes/no)");
                String confirm = sc.nextLine();
                if (confirm.equals("yes")){
                    iProductRepository.deleteProduct(i);
                    System.out.println("bạn đã xóa thành công");
                } else {
                    System.out.println("bạn đã xóa thất bại");
                }
                return;
            }
        }
        System.out.println("Mã bạn nhập không tồn tại! TT");
    }

    @Override
    public void addProduct() {
        System.out.print("nhập mã sản phẩm: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("nhập tên sản phẩm: ");
        String nameProduct = sc.nextLine();
        System.out.print("nhập giá sản phẩm: ");
        int price = Integer.parseInt(sc.nextLine());
//        boolean flag = true;
//        for (int i = 0; i < list.size(); i++) {
//            if (id == list.get(i).getId()){
//                System.out.println("Mã bạn nhập không tồn tại! TT");
//                flag = false;
//            }
//        }
//        if (flag = true) {
            iProductRepository.addProduct(new Product(id, nameProduct, price));
//        }
    }

    @Override
    public void editProduct() {
//        System.out.print("nhập mã mà bạn muốn chỉnh sửa: ");
//        int editId = Integer.parseInt(sc.nextLine());
        int editId = iProductRepository.editProduct();
        for (int i = 0; i < list.size(); i++) {
            if (editId == list.get(i).getId()){
                System.out.print("nhập lại tên sản phẩm: ");
                list.get(i).setNameProduct(sc.nextLine());
//                String nameProduct = list.get(i).getNameProduct();
                System.out.print("nhập lại tên sản phẩm: ");
                list.get(i).setPrice(Integer.parseInt(sc.nextLine()));
//                int price = list.get(i).getPrice();
//                iProductRepository.editProduct(editId, nameProduct, price);
                return;
            }
        }

    }

    @Override
    public void searchProduct() {

        String searchName = iProductRepository.searchProduct();
//            for (int i = 0; i < list.size(); i++) {
//                list.get(i).getProduct();
//                return;
//            }
            for (Product product: list) {
                if (searchName.equals(product.getNameProduct())) {
                    System.out.println(product);
                    return;
                }
            }
//        } else {
            System.out.println("tên sản phẩm bạn tìm kiếm không tồn tại! TT");
//        }

    }
}
