package com.Xworkz.implem;

import com.Xworkz.Internal.Car;

public class CarImp implements Car {
    public CarImp(){
        System.out.println("No Args Constructor CarImp");
    }
    @Override
    public void move() {
        System.out.println("Car Move: ");
    }
}
