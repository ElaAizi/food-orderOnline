package com.example.foodorderOnline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FoodOrderOnlineApplication {

	public static void main(String[] args) {

		SpringApplication.run(FoodOrderOnlineApplication.class, args);
		System.out.println("Ваш заказ принят!");
	}



}
