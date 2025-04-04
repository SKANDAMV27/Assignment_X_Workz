package com.XWorkz.inheritence.Internal;

import com.XWorkz.inheritence.Sand;

public class Tillar extends Vehicles{
    public Tillar()
    {
        super();
        System.out.println("No args Tiller Constructor");
    }

    @Override
    public void Move() {
        System.out.println("Move Tiller");
    }

    @Override
    public void Sell() {
        System.out.println("Sell Tiller");
    }

    @Override
    public void Buy() {
        System.out.println("Buy Tiller");
    }

    @Override
    public void Start() {
        System.out.println("Start Tiller");
    }

    @Override
    public void Stop() {
        System.out.println("Stop Tiller");
    }
}
