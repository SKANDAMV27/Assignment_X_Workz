package com.XWorkz.inheritence.Internal;

public class Koppa extends Place {
    public Koppa()
    {
        super();
        System.out.println("No args Koppa Constructor");
    }
    @Override
    public void location()
    {
        System.out.println("Location of Koppa");
    }
    @Override
    public void distance()
    {
        System.out.println("Koppa distance");
    }
    @Override
    public void nature()
    {
        System.out.println("Nature of Koppa");
    }
    @Override
    public void area()
    {
        System.out.println("Area of Koppa");
    }
    @Override
    public void nearPlace()
    {
        System.out.println("Near to this Koppa");
    }
}
