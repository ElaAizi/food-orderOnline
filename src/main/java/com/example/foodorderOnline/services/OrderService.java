package com.example.foodorderOnline.services;

import com.example.foodorderOnline.models.dto.FoodDto;
import com.example.foodorderOnline.models.dto.OrderDto;

import java.util.List;

public interface OrderService {
    OrderDto save(OrderDto orderDto);

    OrderDto update(OrderDto orderDto);

    OrderDto findById(OrderDto orderDto);

    List<OrderDto> findAll(OrderDto orderDto);
}
