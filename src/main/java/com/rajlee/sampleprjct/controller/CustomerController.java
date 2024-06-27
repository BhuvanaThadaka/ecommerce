package com.rajlee.sampleprjct.controller;

import com.rajlee.sampleprjct.model.Customer;
import com.rajlee.sampleprjct.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import java.util.List;

@RestController

public class CustomerController {

    @Autowired
    private CustomerService customerService;


    @PostMapping("/addCustomer")
    public Customer addCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }

    @PostMapping("/addCustomers")
    public List<Customer> addCustomers(@RequestBody List<Customer> customers) {
        return customerService.saveCustomers(customers);
    }

    @GetMapping("/customer/{id}")
    public Customer findById(@PathVariable("id") int id) {
        return customerService.getCustomerById(id);
    }

    @GetMapping("/customers")
    public List<Customer> findAllCustomers() {
        return customerService.getCustomers();
    }

    @PutMapping("/update")
    public Customer updateCustomer(@RequestBody Customer customer) {
        return customerService.updateCustomer(customer);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return customerService.deleteCustomer(id);
    }
}