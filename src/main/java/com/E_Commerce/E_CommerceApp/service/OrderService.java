package com.E_Commerce.E_CommerceApp.service;

import com.E_Commerce.E_CommerceApp.entity.Order;
import com.E_Commerce.E_CommerceApp.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order saveOrder(Order order)
    {
        return orderRepository.save(order);
    }

    public List<Order>getAllOrders()
    {
        return orderRepository.findAll();
    }

    public Optional<Order>getOrderById(Long id)
    {
        return orderRepository.findById(id);
    }


}
