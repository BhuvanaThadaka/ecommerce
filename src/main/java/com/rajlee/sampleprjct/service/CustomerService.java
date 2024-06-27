package com.rajlee.sampleprjct.service;

import com.rajlee.sampleprjct.model.Customer;
import com.rajlee.sampleprjct.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public List<Customer> saveCustomers(List<Customer> customers) {
        return customerRepository.saveAll(customers);
    }

    public List<Customer> getCustomers() {
        List<Customer> customers = customerRepository.findAll();
        System.out.println("Getting data from db"+customers);
        return customers;
    }

    public Customer getCustomerById(int id) {
        return customerRepository.findById(id).orElse(null);
    }

    public Customer updateCustomer(Customer customer) {
        Customer existingCustomer = customerRepository.findById(customer.getCustomerId()).orElse(null);
        existingCustomer.setCustomerName(customer.getCustomerName());
        existingCustomer.setCustomerAddress(customer.getCustomerAddress());
        return customerRepository.save(existingCustomer);
    }

    public String deleteCustomer(int id){
        customerRepository.deleteById(id);
        return "customer removed"+id;
    }

}

