package com.service;

import com.model.Customer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImple implements CustomerService {
    private static Map<Integer, Customer> customer;

    static{
        customer = new HashMap<>();
        customer.put(1, new Customer(1,"John","john@codegym.com","Hanoi"));
        customer.put(2, new Customer(2,"Bill","bill@gmail.com","Danang"));
        customer.put(3, new Customer(3,"Alex","alex@gmail.com","Saigon"));
        customer.put(4, new Customer(4,"Adam","adam@gmail.com","Beijin"));
        customer.put(5, new Customer(5,"Sophia","sophia@gmail.com","Miami"));
        customer.put(6, new Customer(6,"Rose","rose@gmail.com","Newyork"));
    }


    @Override
    public List<Customer> findAll() {
        return null;
    }

    @Override
    public void save(Customer customer) {

    }

    @Override
    public Customer findById(int id) {
        return null;
    }

    @Override
    public void update(int id, Customer customer) {

    }

    @Override
    public void remove(int id) {

    }
}
