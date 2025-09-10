package com.example.Flash_shop.service.cart;

import java.math.BigDecimal;

import com.example.Flash_shop.model.Cart;
import com.example.Flash_shop.model.User;

public interface ICartService {
     Cart getCart(Long id);
    void clearCart(Long id);
    BigDecimal getTotalPrice(Long id);

    Cart initializeNewCart(User user);

    Cart getCartByUserId(Long userId);
}
