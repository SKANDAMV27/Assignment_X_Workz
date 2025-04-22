package com.Xworkz.implem;

import com.Xworkz.Internal.Bike;

public class BikeImp implements Bike {
    public BikeImp(){
        System.out.println("No args Constructor");
    }

    @Override
    public void buy() {
        System.out.println("Buy Bike");

    }
}
