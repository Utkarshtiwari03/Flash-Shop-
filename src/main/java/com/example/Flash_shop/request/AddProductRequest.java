package com.example.Flash_shop.request;

import java.math.BigDecimal;

import com.example.Flash_shop.model.Category;

import lombok.Data;

@Data
public class AddProductRequest {
    private Long id;
    private String name;
    private String brand;
    private BigDecimal price;
    private int inventory;
    private String description;
    private Category category;
}
