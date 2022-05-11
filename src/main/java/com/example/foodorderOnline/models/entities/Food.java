package com.example.foodorderOnline.models.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "tb_food")
public class Food {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int cost;


}
