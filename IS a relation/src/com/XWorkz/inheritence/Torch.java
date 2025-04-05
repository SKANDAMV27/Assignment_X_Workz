package com.XWorkz.inheritence;

public class Torch extends Battery{
    public Torch()
    {
        super();
        System.out.println("No args Torch Constructor");
    }
    @Override
    public void singleLight()
    {
        System.out.println("Single Light Tourch");
    }
    @Override
    public void charge()
    {
        System.out.println("Charging Battery and Tourch");
    }
    @Override
    public void Shell()
    {
        System.out.println("Sell Tourch");
    }
    @Override
    public void batterColor()
    {
        System.out.println("Tourch Color");
    }
    @Override
    public void batterCost()
    {
        System.out.println("Tourch Cost.");
    }
}
