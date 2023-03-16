package Casestudy.repository.impl;

import Casestudy.common.ReadFile;
import Casestudy.common.WriteFile;
import Casestudy.model.Customer;
import Casestudy.repository.ICustomerRepository;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    @Override
    public List<Customer> display() {
        List<String> list = ReadFile.read("src/Casestudy/data/customers.csv");
        List<Customer> customers = new ArrayList<>();
        for (String str: list) {
            String[] temp = str.split(",");
            Customer customer = new Customer(Integer.parseInt(temp[0]), temp[1],temp[2],temp[3],
                    Integer.parseInt(temp[4]),Integer.parseInt(temp[5]),temp[6],temp[7], temp[8]);
            customers.add(customer);
        }
        return customers;
    }

    @Override
    public void add(Customer customer) {
        WriteFile.write("src/Casestudy/data/customers.csv",customer.toCSV());
    }

    @Override
    public int edit(int editCMND) {
        List<Customer> list = display();
        for (int i = 0; i < list.size(); i++) {
            if (editCMND == list.get(i).getIdentityCard()){
                return i;
            }
        }
        System.out.println("không tìm thấy");
        return -1;
    }
}
