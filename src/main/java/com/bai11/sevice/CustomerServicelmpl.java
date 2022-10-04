package com.bai11.sevice;

import com.bai11.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServicelmpl implements ICustomerService{
    private static Map<Integer,Customer>customers=new HashMap<>();
    static {
        customers.put(1,new Customer(1,"huy","huy@.com","thai binh"));
        customers.put(2,new Customer(2,"phong","phong@.com","quang ninh"));
        customers.put(3,new Customer(3,"hung","hung@com","yenbai"));
        customers.put(4,new Customer(4,"quyet","quyet@.com","bac ninh"));
        customers.put(5,new Customer(5,"luong","luong@.com","bacminh"));
        customers.put(6,new Customer(6,"linh","linh@.com","hanoi"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(),customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
customers.put(id,customer);
    }

    @Override
    public void remove(int id) {
customers.remove(id);
    }
}
