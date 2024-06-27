package com.rajlee.sampleprjct.repository;

import com.rajlee.sampleprjct.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
