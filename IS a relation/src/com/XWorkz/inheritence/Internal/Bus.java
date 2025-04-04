package com.XWorkz.inheritence.Internal;

public class Bus extends Vehicles{
    public Bus(){
        super();
        System.out.println("No args Constructor");
    }

    @Override
    public void Stop() {
        System.out.println("Stop Bus");
    }

    @Override
    public void Buy() {
        System.out.println("Buy Bus");
    }

    @Override
    public void Move() {
        System.out.println("Move Bus");
    }

    @Override
    public void Sell() {
        System.out.println("Sell Bus");
    }

    @Override
    public void Start() {
        System.out.println("Start Bus");
    }
}
