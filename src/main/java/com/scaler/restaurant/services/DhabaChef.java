package com.scaler.restaurant.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class DhabaChef implements Chef{
    @Override
    public String cookKadhaiPaneer() {
        return "cooked Kadhai Paneer";
    }

    @Override
    public String cookMixVeg() {
        return "cooked Mix Veg";
    }

    @Override
    public String cookPizza() {
        return "cooked Pizza";
    }
}
