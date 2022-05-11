package com.example.foodorderOnline.models.dto;

import lombok.Data;

import java.util.Date;

@Data
public class OrderDto {
    private Long id;
    private String name;
    private int amount;
    private Date date;
}
