package Casestudy.repository.impl;

import Casestudy.common.ReadFile;
import Casestudy.common.WriteFile;
import Casestudy.model.Employee;
import Casestudy.repository.IEmployeeRepository;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {

    @Override
    public List<Employee> displayEmployees() {
        List<String> list = ReadFile.read("src/Casestudy/data/employees.csv");
        List<Employee> employees = new ArrayList<>();
        for (String str: list) {
            String[] temp = str.split(",");
            Employee employee = new Employee(Integer.parseInt(temp[0]), temp[1],temp[2],temp[3],
                    Integer.parseInt(temp[4]),Integer.parseInt(temp[5]),temp[6],temp[7], temp[8], Integer.parseInt(temp[9]));
            employees.add(employee);
        }
        return employees;
    }

    @Override
    public void addEmployee(Employee employee) {
        WriteFile.write("src/Casestudy/data/employees.csv",employee.toCSV());
    }

    @Override
    public int editEmployee(int editCMND) {
        List<Employee> list = displayEmployees();
        for (int i = 0; i < list.size(); i++) {
            if (editCMND == list.get(i).getIdentityCard()){
                return i;
            }
        }
        System.out.println("không tìm thấy");
        return -1;
    }
}
