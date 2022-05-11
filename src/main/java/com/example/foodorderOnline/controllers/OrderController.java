package com.example.foodorderOnline.controllers;

import com.example.foodorderOnline.models.dto.OrderDto;
import com.example.foodorderOnline.services.FoodService;
import com.example.foodorderOnline.services.OrderService;
import com.example.foodorderOnline.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private UserService userService;
    @Autowired
    private FoodService foodService;

    @PostMapping("/save")
    public OrderDto save(@RequestBody OrderDto orderDto){
        return orderService.save(orderDto);
    }
    @PutMapping("/update")
    public OrderDto update(@RequestBody OrderDto orderDto){
        return orderService.update(orderDto);
    }
    @GetMapping("/get")
    public OrderDto findById(@RequestParam Long id){
        return orderService.findById(findById(id));
    }
    @GetMapping("/list")
    public List<OrderDto> findAll(@RequestParam Long orderId){
        OrderDto orderDto = orderService.findById(findById(orderId));
        return orderService.findAll(orderDto);
    }
}
