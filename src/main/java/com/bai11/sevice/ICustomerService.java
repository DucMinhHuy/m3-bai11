package com.bai11.sevice;

import com.bai11.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer>findAll();
    void save(Customer customer);
    Customer findById(int id);
    void update(int id,Customer customer);
    void remove(int id);
}
