package com.scaler.restaurant;

import com.scaler.restaurant.controllers.Waiter;
import com.scaler.restaurant.services.Chef;
import com.scaler.restaurant.services.SuperChef;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestaurantApplication {

    public static void main(String[] args) {
        Chef chef = new SuperChef();
        Waiter waiter = new Waiter();
        SpringApplication.run(RestaurantApplication.class, args);
    }

}
