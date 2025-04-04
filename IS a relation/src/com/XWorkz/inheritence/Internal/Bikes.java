package com.XWorkz.inheritence.Internal;

public class Bikes extends Vehicles{
    public Bikes(){
        super();
        System.out.println("No agrs Bikes Constructor");
    }

    @Override
    public void Stop() {
        System.out.println("Stop Bike");
    }

    @Override
    public void Move() {
        System.out.println("Bike Move");
    }

    @Override
    public void Buy() {
        System.out.println("Buy Bike");
    }

    @Override
    public void Sell() {
        System.out.println("Bike Sell");
    }

    @Override
    public void Start() {
        System.out.println("Start Bike");
    }
}
