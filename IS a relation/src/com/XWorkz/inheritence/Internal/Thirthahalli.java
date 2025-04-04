package com.XWorkz.inheritence.Internal;

public class Thirthahalli extends Place{
    public Thirthahalli()
    {
        super();
        System.out.println("No args Thirthahalli args");
    }
    @Override
    public void location()
    {
        System.out.println("Location of place");
    }
    @Override
    public void distance()
    {
        System.out.println("Place distance");
    }
    @Override
    public void nature()
    {
        System.out.println("Nature of Place");
    }
    @Override
    public void area()
    {
        System.out.println("Area of place");
    }
    @Override
    public void nearPlace()
    {
        System.out.println("Near to this place");
    }
}
