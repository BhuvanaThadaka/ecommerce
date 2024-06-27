package com.rajlee.sampleprjct.service;
import com.rajlee.sampleprjct.model.Product;
import com.rajlee.sampleprjct.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> saveProducts(List<Product> products) {
        return productRepository.saveAll(products);
    }

    public List<Product> getProducts() {
        List<Product> products = productRepository.findAll();
        System.out.println("Getting data from db"+products);
        return products;
    }

    public Product getProductById(int id) {
        return productRepository.findById(id).orElse(null);
    }

    public Product updateProduct(Product product) {
        Product existingProduct = productRepository.findById(product.getProdId()).orElse(null);
        existingProduct.setProdName(product.getProdName());
        existingProduct.setProdDesc(product.getProdDesc());
        existingProduct.setProdPrice(product.getProdPrice());
        existingProduct.setImageUrl(product.getImageUrl());
        return productRepository.save(existingProduct);
    }

    public String deleteProduct(int id){
        productRepository.deleteById(id);
        return "product removed"+id;
    }
}

