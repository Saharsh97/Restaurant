package com.scaler.restaurant.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class GordonRamsay implements Chef{

    @Override
    public String cookKadhaiPaneer() {
        return "GordanRamsay cooked very tasty Kadhai Paneer, and he roasted the other chefs";
    }

    @Override
    public String cookMixVeg() {
        return "Gordan Ramsay cooked mix veg and he roasted the waiter";
    }

    @Override
    public String cookPizza() {
        return "Gordan Ramsay roasted the customer more than he roasted the pizza";
    }
}
