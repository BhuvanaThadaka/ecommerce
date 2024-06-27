package com.rajlee.sampleprjct.controller;


import com.rajlee.sampleprjct.model.Product;
import com.rajlee.sampleprjct.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;


    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products) {
        return productService.saveProducts(products);
    }

    @GetMapping("/product/{id}")
    public Product findById(@PathVariable("id") int id) {
        return productService.getProductById(id);
    }

    @GetMapping("/products")
    public List<Product> findAllProducts() {
        return productService.getProducts();
    }

    @PutMapping("/updateProduct")
    public Product updateProduct(@RequestBody Product product) {
        return productService.updateProduct(product);
    }


    @DeleteMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable int id) {
        return productService.deleteProduct(id);
    }
}