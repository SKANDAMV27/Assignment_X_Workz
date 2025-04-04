package com.XWorkz.inheritence.Internal;

public class Train extends Vehicles{
    public Train()
    {
        super();
        System.out.println("No args Train Constructor");
    }

    @Override
    public void Start() {
        System.out.println("Star Train");
    }

    @Override
    public void Sell() {
        System.out.println("Sell Train");
    }

    @Override
    public void Move() {
        System.out.println("Move Train");
    }

    @Override
    public void Buy() {
        System.out.println("Buy Train");
    }

    @Override
    public void Stop() {
        System.out.println("Stop Train");
    }
}
