package com.example.Flash_shop.repository;

import com.example.Flash_shop.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}