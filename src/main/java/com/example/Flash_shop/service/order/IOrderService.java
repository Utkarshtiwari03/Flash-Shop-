package com.example.Flash_shop.service.order;

import java.util.List;

import com.example.Flash_shop.dto.OrderDto;
import com.example.Flash_shop.model.Order;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);
    List<OrderDto> getUserOrders(Long userId);
    OrderDto convertToDto(Order order);
}