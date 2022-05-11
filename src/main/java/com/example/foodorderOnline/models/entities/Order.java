package com.example.foodorderOnline.models.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "tb_order")
public class Order {

    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn(name ="food_id")
    private Food food;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private int amount;
    private Date date;
}
