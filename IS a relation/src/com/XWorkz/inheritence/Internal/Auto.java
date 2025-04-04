package com.XWorkz.inheritence.Internal;

public class Auto extends Vehicles
{
    public Auto()
    {
        super();
        System.out.println("No args Auto Constructor");
    }

    @Override
    public void Stop() {
        System.out.println("Stop Auto");
    }

    @Override
    public void Start() {
        System.out.println("Start Auto ");
    }

    @Override
    public void Buy() {
        System.out.println("Buy Auto");
    }

    @Override
    public void Sell() {
        System.out.println("Sell Auto");
    }

    @Override
    public void Move() {
        System.out.println("Move Auto");
    }
}
