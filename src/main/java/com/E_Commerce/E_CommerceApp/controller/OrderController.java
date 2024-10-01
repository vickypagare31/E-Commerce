package com.E_Commerce.E_CommerceApp.controller;

import com.E_Commerce.E_CommerceApp.entity.Order;
import com.E_Commerce.E_CommerceApp.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping()
    public ResponseEntity<Order>saveOrder(@RequestBody Order order)
    {
        Order savedOrder=orderService.saveOrder(order);
        return new ResponseEntity<>(savedOrder, HttpStatus.ACCEPTED);
    }

    @GetMapping()
    public List<Order>getAllOrders()
    {
        return orderService.getAllOrders();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order>getOrderById(Long id)
    {
        Optional<Order>getOrder=orderService.getOrderById(id);
        return getOrder.map(ResponseEntity::ok).orElseGet(()-> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
