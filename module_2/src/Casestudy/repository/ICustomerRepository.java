package Casestudy.repository;

import Casestudy.model.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> display();
    void add(Customer customer);
    int edit(int editCMND);
}
