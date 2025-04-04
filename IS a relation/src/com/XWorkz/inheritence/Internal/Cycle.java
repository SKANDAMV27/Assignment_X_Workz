package com.XWorkz.inheritence.Internal;

public class Cycle extends Vehicles{
    public Cycle()
    {
        super();
        System.out.println("No args Cycle Constructor");
    }

    @Override
    public void Start() {
        System.out.println("Start Cycle");
    }

    @Override
    public void Stop() {
        System.out.println("Stop Cycle");
    }

    @Override
    public void Move() {
        System.out.println("Move Cycle");
    }

    @Override
    public void Buy() {
        System.out.println("Buy Cycle");
    }

    @Override
    public void Sell() {
        System.out.println("Sell Cycle");
    }
}
