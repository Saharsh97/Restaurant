package com.scaler.restaurant.controllers;

import com.scaler.restaurant.services.Chef;
import com.scaler.restaurant.services.DhabaChef;
import com.scaler.restaurant.services.GordonRamsay;
import com.scaler.restaurant.services.SuperChef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Waiter {
    // a waiter only cares about forwarding the request to chef.
    // who is the exact chef, does that really matter to the waiter?

    // its just that, from the perspective of the waiter,
    // whoever is the chef, they should be ABLE TO COOK the food, thats it!
    // whoever is the chef, they should be able to COMPLETE THE REQUEST
    // whoever is the chef, they should KNOW how to cook the menu items.

    // looking at the above definition, chef should be _________??

    @Autowired
    Chef chef;

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
