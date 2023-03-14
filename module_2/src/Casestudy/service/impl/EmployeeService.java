package Casestudy.service.impl;

import Casestudy.model.Employee;
import Casestudy.repository.IEmployeeRepository;
import Casestudy.repository.impl.EmployeeRepository;
import Casestudy.service.IEmployeeService;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    Scanner sc = new Scanner(System.in);
    private IEmployeeRepository iEmployeeRepository = new EmployeeRepository();
    @Override
    public void displayEmployees() {
        List<Employee> list = iEmployeeRepository.displayEmployees();
        if (list.size() == 0){
            System.out.println("danh sách trống");
        } else {
            for (Employee temp: list){
                System.out.println(temp);
            }
        }
    }
    public void addEmployee(){
        System.out.print("Nhập mã nhân viên: ");
        int codeId = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập tên đầy đủ nhân viên: ");
        String fullName = sc.nextLine();
        System.out.print("Nhập ngày sinh nhân viên: ");
        String dateOfBirth = sc.nextLine();
        System.out.print("Nhập giới tính nhân viên: ");
        String gender = sc.nextLine();
        System.out.print("Nhập cmnd nhân viên: ");
        int cmnd = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số điện thoại nhân viên: ");
        int phoneNumber = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số email nhân viên: ");
        String email = sc.nextLine();
        System.out.print("Nhập học vấn nhân viên: ");
        String degree = sc.nextLine();
        System.out.print("Nhập bộ phận nhân viên: ");
        String department = sc.nextLine();
        System.out.print("Nhập lương nhân viên: ");
        int salary = Integer.parseInt(sc.nextLine());
        Employee employee = new Employee(codeId, fullName, dateOfBirth,
                gender, cmnd, phoneNumber, email , degree, department, salary);
        iEmployeeRepository.addEmployee(employee);

    }

    @Override
    public void findEmployee() {
        System.out.println("nhập tên bạn muốn tìm kiếm: ");
        String searchName = sc.nextLine();
        iEmployeeRepository.findEmployee(searchName);
    }
}
