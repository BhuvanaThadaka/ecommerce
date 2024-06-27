package com.rajlee.sampleprjct.repository;

import com.rajlee.sampleprjct.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
