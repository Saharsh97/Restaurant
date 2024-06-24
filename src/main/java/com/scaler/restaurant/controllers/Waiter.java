package com.scaler.restaurant.controllers;

import com.scaler.restaurant.services.Chef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class Waiter {

    Chef chef;

    @Autowired
    public Waiter(Chef chef){
        this.chef = chef;
    }

    @GetMapping("/kadhaiPaneer")
    public String orderKadhaiPaneer(){
        String food = chef.cookKadhaiPaneer();
        return food;
    }

    @GetMapping("/mixVeg")
    public String orderMixVeg(){
        String food = chef.cookMixVeg();
        return food;
    }

    @GetMapping("/pizza")
    public String orderPizza(){
        String food = chef.cookPizza();
        return food;
    }
}
