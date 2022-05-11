package com.example.foodorderOnline.services;

import com.example.foodorderOnline.models.dto.FoodDto;

import java.util.List;

public interface FoodService {

    FoodDto save(FoodDto foodDto);

    FoodDto update(FoodDto foodDto);

    FoodDto findById(FoodDto foodDto);

    List<FoodDto> findAll(FoodDto foodDto);
}
