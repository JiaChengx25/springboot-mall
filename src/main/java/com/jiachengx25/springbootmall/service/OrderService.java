package com.jiachengx25.springbootmall.service;

import com.jiachengx25.springbootmall.dto.CreateOrderRequest;
import com.jiachengx25.springbootmall.dto.OrderQueryParams;
import com.jiachengx25.springbootmall.model.Order;

import java.util.List;

public interface OrderService {
    Integer countOrder(OrderQueryParams orderQueryParams);
    List<Order> getOrders(OrderQueryParams orderQueryParams);
    Order getOrderById(Integer orderId);
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
