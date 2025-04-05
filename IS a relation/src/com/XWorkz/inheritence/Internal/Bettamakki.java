package com.XWorkz.inheritence.Internal;

public class Bettamakki extends Place{
    public Bettamakki()
    {
        super();
        System.out.println("No args Bettamakki Constructor");
    }
    @Override
    public void location()
    {
        System.out.println("Location of Bettamakki");
    }@Override
    public void distance()
    {
        System.out.println("Bettamakki distance");
    }
    @Override
    public void nature()
    {
        System.out.println("Nature of Bettamakki");
    }
    @Override
    public void area()
    {
        System.out.println("Area of Bettamakki");
    }
    @Override
    public void nearPlace()
    {
        System.out.println("Near to this Bettamakki");
    }
}
