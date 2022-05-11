package com.example.foodorderOnline.mappers;

import com.example.foodorderOnline.models.dto.FoodDto;
import com.example.foodorderOnline.models.entities.Food;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface FoodMapper {
    FoodMapper INSTANCE = Mappers.getMapper(FoodMapper.class);

    Food foodDtoToFood(FoodDto foodDto);

    FoodDto foodToFoodDto(Food food);

    List<Food> foodDtoListToFoodList(List<FoodDto> foodDtos);

    List<FoodDto> foodListToFoodDtoList(List<Food> foods);
}
