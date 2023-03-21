package Casestudy.service.impl;

import Casestudy.common.WriteFile;
import Casestudy.model.Employee;
import Casestudy.repository.IEmployeeRepository;
import Casestudy.repository.impl.EmployeeRepository;
import Casestudy.service.IEmployeeService;
import Casestudy.validate.UserException;
import Casestudy.validate.Validate;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    Scanner sc = new Scanner(System.in);
    private IEmployeeRepository iEmployeeRepository = new EmployeeRepository();
    Validate validate = new Validate();

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
        while(codeId <= 0){
            try {
                System.out.println("nhập lại mã khách hàng:");
                codeId = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e){
                System.out.println("số bạn nhập phải là số nguyên lớn hơn 0");
            }
        }
        System.out.print("Nhập tên đầy đủ nhân viên: ");
        String fullName = sc.nextLine();
        while(fullName.length()<=0){
            try {
                System.out.println("nhập lại tên đầy đủ:");
                codeId = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e){
                System.out.println("mời bạn nhập lại tên");
            }
        }
        System.out.print("Nhập ngày sinh nhân viên: ");
        String dateOfBirth = sc.nextLine();
        while(!validate.validate(dateOfBirth)){
            try {
                System.out.print("Nhập lại ngày sinh nhân viên: ");
                dateOfBirth = sc.nextLine();
                throw new UserException("sai định dạng ngày sinh");
            } catch (UserException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.print("Nhập giới tính nhân viên: ");
        String gender = sc.nextLine();
        System.out.print("Nhập cmnd nhân viên: ");
        int cmnd = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số điện thoại nhân viên: ");
        String phoneNumber = sc.nextLine();
        while(!validate.validate(phoneNumber)){
            try {
                System.out.print("Nhập lại số điện thoại: ");
                phoneNumber = sc.nextLine();
                throw new UserException("sai định dạng");
            } catch (UserException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.print("Nhập số email nhân viên: ");
        String email = sc.nextLine();
        while(!validate.validate(email)){
            try {
                System.out.print("Nhập lại email: ");
                email = sc.nextLine();
                throw new UserException("sai định dạng email");
            } catch (UserException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.print("Nhập học vấn nhân viên: ");
        String degree = sc.nextLine();
        System.out.print("Nhập bộ phận nhân viên: ");
        String department = sc.nextLine();
        System.out.print("Nhập lương nhân viên: ");
        int salary = Integer.parseInt(sc.nextLine());
        Employee employee = new Employee(codeId, fullName, dateOfBirth,
                gender, cmnd, Integer.parseInt(phoneNumber), email , degree, department, salary);
        iEmployeeRepository.addEmployee(employee);

    }

    @Override
    public void editEmployee() {
        List<Employee> list = iEmployeeRepository.displayEmployees();
        System.out.println("nhập chứng minh thư: ");
        int searchIdCard = Integer.parseInt(sc.nextLine());
        int editEmployee = iEmployeeRepository.editEmployee(searchIdCard);
        for ( Employee element : list ) {
            if (editEmployee != -1){
                System.out.println("nhập lại tên nhân viên: ");
                String fullName = sc.nextLine();
                element.setFullName(fullName);
                list.set(editEmployee, element);
                iEmployeeRepository.addEmployee(element);
                return;
            }
        }
    }
}
