package Casestudy.service.impl;

import Casestudy.model.Employee;
import Casestudy.repository.IEmployeeRepository;
import Casestudy.repository.impl.EmployeeRepository;
import Casestudy.service.IEmployeeService;

import java.util.List;

public class EmployeeService implements IEmployeeService {
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
}
