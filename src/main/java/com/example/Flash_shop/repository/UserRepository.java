package com.example.Flash_shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Flash_shop.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);

    User findByEmail(String email);
}
