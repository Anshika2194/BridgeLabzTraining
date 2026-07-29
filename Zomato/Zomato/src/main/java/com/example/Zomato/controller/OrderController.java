package com.example.Zomato.controller;

import com.example.Zomato.entity.OrderEntity;
import com.example.Zomato.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {

    @Autowired
    private OrderService service;

    @PostMapping("/order")
    public String order(@RequestBody OrderEntity order) {

        return service.order(order);
    }
}