package com.example.Flash_shop.service.cart;

import java.math.BigDecimal;

import com.example.Flash_shop.model.Cart;

public interface ICartService {
     Cart getCart(Long id);
    void clearCart(Long id);
    BigDecimal getTotalPrice(Long id);

    Long initializeNewCart();

    // Cart getCartByUserId(Long userId);
}
