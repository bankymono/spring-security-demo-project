package com.bankymono.spring_security_demo_project.repo;

import com.bankymono.spring_security_demo_project.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
