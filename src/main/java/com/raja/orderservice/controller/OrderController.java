package com.raja.orderservice.controller;

import com.raja.orderservice.model.Orders;
import com.raja.orderservice.repository.OrderRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping
    public List<Orders> getAll() {
        return orderRepository.findAll();
    }

    @PostMapping
    public Orders create(@RequestBody Orders order) {
        return orderRepository.save(order);
    }
}
