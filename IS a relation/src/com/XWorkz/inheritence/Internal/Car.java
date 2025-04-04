package com.XWorkz.inheritence.Internal;

public class Car extends Vehicles{
    public Car(){
        super();
        System.out.println("No args Car Constructor");
    }

    @Override
    public void Buy() {
        System.out.println("Buy Car");
    }
    @Override
    public void Sell()
    {
        System.out.println("Sell Car");
    }

    @Override
    public void Move() {
        System.out.println("Move Car");
    }

    @Override
    public void Start() {
        System.out.println("Car Start");
    }

    @Override
    public void Stop() {
        System.out.println("Car Stop");
    }
}
