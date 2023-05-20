package com.jiachengx25.springbootmall.service;

import com.jiachengx25.springbootmall.dto.CreateOrderRequest;

public interface OrderService {

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
