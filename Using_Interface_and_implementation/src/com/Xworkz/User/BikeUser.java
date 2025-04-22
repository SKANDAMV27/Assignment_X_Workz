package com.Xworkz.User;

import com.Xworkz.Internal.Bike;

public class BikeUser {
    public Bike bike;
    public BikeUser(Bike bike){
        this.bike=bike;
        System.out.println("No args Bike User Constructor");
    }
    public void sell(){
        if(this.bike!=null){
            this.bike.buy();
            System.out.println("Bike Sell");
        }
        else{
            System.out.println("Null Value");
        }
    }
}
