package com.example.foodorderOnline.dao;

import com.example.foodorderOnline.models.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
}
