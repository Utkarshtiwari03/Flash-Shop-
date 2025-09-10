package com.example.Flash_shop.service.cart;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.Flash_shop.exception.ResourceNotFoundException;
import com.example.Flash_shop.model.Cart;
import com.example.Flash_shop.model.User;
import com.example.Flash_shop.repository.CartItemRepository;
import com.example.Flash_shop.repository.CartRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;



@Service
@RequiredArgsConstructor
public class CartService implements ICartService{
    private final CartRepository cartRepository;
    private final CartItemRepository cartItemRepository;

    @Override
    public Cart getCart(Long id) {
        Cart cart = cartRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Cart not found"));
        return cart;
    }


    @Transactional
    @Override
    public void clearCart(Long id) {
        Cart cart = getCart(id);
        cartItemRepository.deleteAllByCartId(id);
        cart.getItems().clear();
        cartRepository.deleteById(id);

    }

    @Override
    public BigDecimal getTotalPrice(Long id) {
        Cart cart = getCart(id);
        return cart.getTotalAmount();
    }

    @Override
    public Cart initializeNewCart(User user) {
        // Cart newCart = new Cart();
        // Long newCartId = cartIdGenerator.incrementAndGet();
        // newCart.setId(newCartId);
        // return cartRepository.save(newCart).getId();
        return Optional.ofNullable(getCartByUserId(user.getId()))
        .orElseGet(() ->{
            Cart cart = new Cart();
            cart.setUser(user);
            return cartRepository.save(cart);
        });

    }

    @Override
    public Cart getCartByUserId(Long userId) {
        return cartRepository.findByUserId(userId);
    }
}