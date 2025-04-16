package com.Xworkz.External;

import com.Xworkz.Internal.Hotel;

public class HotelRulls implements Hotel {
    @Override
    public void iteamRulls() {
        System.out.println("Item Rulls");
    }

    @Override
    public void billRulls() {
        System.out.println("Bill Rulls");

    }

    @Override
    public void orderRulls() {
        System.out.println("Order Rulls");

    }
}
