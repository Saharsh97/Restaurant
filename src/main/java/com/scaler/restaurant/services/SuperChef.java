package com.scaler.restaurant.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
//@Primary
public class SuperChef implements Chef{
    @Override
    public String cookKadhaiPaneer() {
        return "tasty kadhai Paneer cooked by SuperChef";
    }

    @Override
    public String cookMixVeg() {
        return "tasty mix veg cooked by SuperChef";
    }

    @Override
    public String cookPizza() {
        return "tasty pizza cooked by SuperChef";
    }
}
