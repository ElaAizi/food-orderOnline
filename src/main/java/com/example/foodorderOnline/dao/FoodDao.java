package com.example.foodorderOnline.dao;

import com.example.foodorderOnline.models.entities.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodDao extends JpaRepository<Food, Long> {
}
