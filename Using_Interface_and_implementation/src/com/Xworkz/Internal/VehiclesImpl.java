package com.Xworkz.implem;

import com.Xworkz.Internal.Vehicles;

public class VehiclesImpl implements Vehicles {
    public VehiclesImpl(){
        System.out.println("No args Vehicles Construction");
    }
    @Override
    public void car() {
        System.out.println("Car Runner...");
    }
}
