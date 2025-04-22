package com.Xworkz.User;

import com.Xworkz.Internal.Car;

public class CarUser {
    public Car car;
    public CarUser(Car car){
        this.car=car;
        System.out.println("No args Car as Constructor");
    }
    public void buy(){
        if(this.car!=null){
            this.car.move();
            System.out.println("Car Buy");
        }
        else {
            System.out.println("Null Value.");
        }

    }
}
