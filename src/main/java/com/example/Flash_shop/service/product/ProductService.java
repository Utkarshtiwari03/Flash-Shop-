package com.example.Flash_shop.service.product;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Flash_shop.exception.ResourceNotFoundException;
import com.example.Flash_shop.model.Product;
import com.example.Flash_shop.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService implements IProductService {

    private final ProductRepository productRepository;

    @Override
    public Product getProductById(Long id) {
               return productRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Product not found!")); 
    }

    @Override
    public void deleteProductById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteProductById'");
    }

    @Override
    public List<Product> getAllProducts() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllProducts'");
    }

    @Override
    public List<Product> getProductsByCategory(String category) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProductsByCategory'");
    }

    @Override
    public List<Product> getProductsByBrand(String brand) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProductsByBrand'");
    }

    @Override
    public List<Product> getProductsByCategoryAndBrand(String category, String brand) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProductsByCategoryAndBrand'");
    }

    @Override
    public List<Product> getProductsByName(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProductsByName'");
    }

    @Override
    public List<Product> getProductsByBrandAndName(String category, String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProductsByBrandAndName'");
    }

    @Override
    public Long countProductsByBrandAndName(String brand, String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'countProductsByBrandAndName'");
    }
    
}
