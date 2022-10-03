package com.bai11.sevice;

import com.bai11.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServicelmpl implements ICustomerService{
    private static Map<Integer,Customer>customer=new HashMap<>();
    static {
        customer.put(1,new Customer(1,"huy","huy@.com","thai binh"));
        customer.put(2,new Customer(2,"phong","phong@.com","quang ninh"));
        customer.put(3,new Customer(3,"hung","hung@com","yenbai"));
        customer.put(4,new Customer(4,"quyet","quyet@.com","bac ninh"));
        customer.put(5,new Customer(5,"luong","luong@.com","bacminh"));
        customer.put(6,new Customer(6,"linh","linh@.com","hanoi"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customer.values());
    }

    @Override
    public void save(Customer customer) {
        customer.put(customer.getId(),customer);
    }

    @Override
    public Customer findById(int id) {
        return customer.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
customer.put(id,customer);
    }

    @Override
    public void remove(int id) {
customer.remove(id);
    }
}
