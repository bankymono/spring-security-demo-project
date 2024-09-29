package com.bankymono.spring_security_demo_project.service;

import com.bankymono.spring_security_demo_project.model.Product;
import com.bankymono.spring_security_demo_project.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
