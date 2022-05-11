package com.example.foodorderOnline.mappers;

import com.example.foodorderOnline.models.dto.FoodDto;
import com.example.foodorderOnline.models.dto.OrderDto;
import com.example.foodorderOnline.models.entities.Food;
import com.example.foodorderOnline.models.entities.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    Order orderDtoToFood(OrderDto orderDto);

    OrderDto orderToFoodDto(Order order);

    List<Order> orderDtoListToOrderList(List<OrderDto> OrderDtos);

    List<OrderDto> orderListToOrderDtoList(List<Order> orders);
}
