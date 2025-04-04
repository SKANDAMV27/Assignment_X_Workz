package com.XWorkz.inheritence.Internal;

public class PickUp extends Vehicles{
    public PickUp()
    {
        super();
        System.out.println("No args PickUp Constructor");
    }

    @Override
    public void Start() {
        System.out.println("Pick Up Start");
    }

    @Override
    public void Stop() {
        System.out.println("Pick Up Stop");
    }

    @Override
    public void Buy() {
        System.out.println("Pick Up Buy");
    }

    @Override
    public void Move() {
        System.out.println("Move Pick Up");
    }

    @Override
    public void Sell() {
        System.out.println("Pick Up Sell");
    }
}
