package com.jiachengx25.springbootmall.service;

import com.jiachengx25.springbootmall.dto.CreateOrderRequest;
import com.jiachengx25.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
