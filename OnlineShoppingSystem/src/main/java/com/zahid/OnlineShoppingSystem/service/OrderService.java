package com.zahid.OnlineShoppingSystem.service;

import com.zahid.OnlineShoppingSystem.dao.OrderRepository;
import com.zahid.OnlineShoppingSystem.model.OrderEntity;
import jakarta.persistence.criteria.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
   OrderRepository orderRepository;


    public OrderEntity createOrder(OrderEntity order) {
        return orderRepository.save(order);
    }
    public OrderEntity getOrderById(Integer orderId) {
        return orderRepository.findById(orderId).orElse(null);
    }
    public List<OrderEntity> getOrdersByUserId(Integer userId) {
        return orderRepository.findByUserId(userId);
    }

    public Optional<OrderEntity> getOrderByIdAndUserId(Integer orderId, Integer userId) {
        return orderRepository.findByIdAndUserId(orderId, userId);
    }
    public void deleteOrder(Integer orderId) {
        orderRepository.deleteById(orderId);
    }
}

