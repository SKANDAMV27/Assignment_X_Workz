package com.XWorkz.inheritence.Internal;

public class Troctor extends Vehicles {
    public Troctor()
    {
        super();
        System.out.println("No args Troctor Constructor");
    }

    @Override
    public void Start() {
        System.out.println("Troctor Start");
    }

    @Override
    public void Move() {
        System.out.println("Move Troctor");
    }

    @Override
    public void Sell() {
        System.out.println("Troctor Sell");
    }

    @Override
    public void Buy() {
        System.out.println("Buy Troctor");
    }

    @Override
    public void Stop() {
        System.out.println("Troctor Stop");
    }
}
