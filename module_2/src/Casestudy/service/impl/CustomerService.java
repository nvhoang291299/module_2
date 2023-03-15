package Casestudy.service.impl;

import Casestudy.model.Customer;
import Casestudy.model.Employee;
import Casestudy.repository.ICustomerRepository;
import Casestudy.repository.impl.CustomerRepository;
import Casestudy.service.ICustomerService;

import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    Scanner sc = new Scanner(System.in);
    private ICustomerRepository iCustomerRepository = new CustomerRepository();
    @Override
    public void display() {
        List<Customer> list = iCustomerRepository.display();
        if (list.size() == 0){
            System.out.println("danh sách trống");
        } else {
            for (Customer temp: list){
                System.out.println(temp);
            }
        }
    }

    @Override
    public void add() {
        System.out.print("Nhập mã khách hàng: ");
        int codeId = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập tên đầy đủ khách hàng: ");
        String fullName = sc.nextLine();
        System.out.print("Nhập ngày sinh khách hàng: ");
        String dateOfBirth = sc.nextLine();
        System.out.print("Nhập giới tính khách hàng: ");
        String gender = sc.nextLine();
        System.out.print("Nhập cmnd khách hàng: ");
        int cmnd = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số điện thoại khách hàng: ");
        int phoneNumber = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số email khách hàng: ");
        String email = sc.nextLine();
        System.out.print("Nhập loại khách hàng: ");
        String typeOfCus = sc.nextLine();
        System.out.print("Nhập địa chỉ khách hàng: ");
        String address = sc.nextLine();
        Customer customer = new Customer(codeId, fullName, dateOfBirth,
                gender, cmnd, phoneNumber, email , typeOfCus, address);
        iCustomerRepository.add(customer);
    }

    @Override
    public void edit() {
        List<Customer> list = iCustomerRepository.display();
        System.out.println("nhập chứng minh thư: ");
        int searchIdCard = Integer.parseInt(sc.nextLine());
        int editEmployee = iCustomerRepository.edit(searchIdCard);
        for ( Customer element : list ) {
            if (editEmployee != -1){
                System.out.println("nhập lại tên nhân viên: ");
                String fullName = sc.nextLine();
                element.setFullName(fullName);
                list.set(editEmployee, element);
                iCustomerRepository.add(element);
                return;
            }
        }
    }
}
