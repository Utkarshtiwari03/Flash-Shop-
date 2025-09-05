package com.example.Flash_shop.repository;

import com.example.Flash_shop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}