package com.Xworkz.User;

import com.Xworkz.Internal.Vehicles;

public class VehiclesUser {
    protected Vehicles vehicles;
    public VehiclesUser(Vehicles vehicles){
        this.vehicles=vehicles;
        System.out.println("No args Vehicles user Constructor");
    }
    public void sell(){
        if(this.vehicles!=null){
            this.vehicles.car();
            System.out.println("Sell Runner");
        }
        else
        {
            System.out.println("Null Value");
        }
    }
}
