package com.example.foodorderOnline.controllers;

import com.example.foodorderOnline.models.dto.FoodDto;
import com.example.foodorderOnline.models.entities.Food;
import com.example.foodorderOnline.services.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/food")
public class FoodController {

    @Autowired
    private FoodService foodService;


    @PostMapping("/save")
    public FoodDto save(@RequestBody FoodDto foodDto){
        return foodService.save(foodDto);
    }

    @PutMapping("/update")
    public FoodDto update(@RequestBody FoodDto foodDto){
        return foodService.update(foodDto);
    }

    @GetMapping("/get")
    public FoodDto findById(@RequestParam Long id){
        return foodService.findById(findById(id));
    }

    @GetMapping("/list")
    public List<FoodDto> findAll(){
        return null;
    }

}
