package com.bankymono.spring_security_demo_project.repo;

import com.bankymono.spring_security_demo_project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findUserByUsername(String u);
}
