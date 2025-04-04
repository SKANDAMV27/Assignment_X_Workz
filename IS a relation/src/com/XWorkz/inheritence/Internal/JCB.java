package com.XWorkz.inheritence.Internal;

public class JCB extends Vehicles {
    public JCB() {
        super();
        System.out.println("No args JCB Constructor");
    }

    @Override
    public void Start() {
        System.out.println("Start JCB");
    }

    @Override
    public void Sell() {
        System.out.println("Sell JCB");
    }

    @Override
    public void Buy() {
        System.out.println("Buy JCB");
    }

    @Override
    public void Move() {
        System.out.println("Move JCB");
    }

    @Override
    public void Stop() {
        System.out.println("Stop JCB");
    }
}