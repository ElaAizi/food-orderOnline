package com.example.foodorderOnline.dao;

import com.example.foodorderOnline.models.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDao extends JpaRepository<Order, Long> {
}
