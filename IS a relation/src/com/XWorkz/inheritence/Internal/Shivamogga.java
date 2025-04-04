package com.XWorkz.inheritence.Internal;

public class Shivamogga extends Place{
    public Shivamogga()
    {
        super();
        System.out.println("No args Shivamogga Constructor");
    }@Override
    public void location()
    {
        System.out.println("Location of Shivamogga");
    }
    @Override
    public void distance()
    {
        System.out.println("Shivamogga distance");
    }
    @Override
    public void nature()
    {
        System.out.println("Nature of Shivamogga");
    }
    @Override
    public void area()
    {
        System.out.println("Area of Shivamogga");
    }
    @Override
    public void nearPlace()
    {
        System.out.println("Near to this shivamogga");
    }
}
