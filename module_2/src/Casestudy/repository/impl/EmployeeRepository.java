package Casestudy.repository.impl;

import Casestudy.common.ReadFile;
import Casestudy.model.Employee;
import Casestudy.repository.IEmployeeRepository;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private static List<Employee> productList = new ArrayList<>();

    @Override
    public List<Employee> displayEmployees() {
        productList = ReadFile.read("src/Casestudy/data/employees.csv");
        return productList;
    }
}
