package com.example.Flash_shop.repository;

import com.example.Flash_shop.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}