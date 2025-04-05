package com.XWorkz.inheritence.Internal;

public class Banglure extends Place {
    public Banglure(){
        super();
        System.out.println("No args Banglure Constructor");
    }
    @Override
    public void location()
    {
        System.out.println("Location of Banglure");
    }
    @Override
    public void distance()
    {
        System.out.println("Banglure distance");
    }
    @Override
    public void nature()
    {
        System.out.println("Nature of Banglure");
    }
    @Override
    public void area()
    {
        System.out.println("Area of Banglure");
    }
    @Override
    public void nearPlace()
    {
        System.out.println("Near to Banglure Tourist");
    }
}
