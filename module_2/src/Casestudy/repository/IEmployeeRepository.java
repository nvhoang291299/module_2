package Casestudy.repository;

import Casestudy.model.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> displayEmployees();
    void addEmployee(Employee employee);

    void editEmployee(String searchName);
}
