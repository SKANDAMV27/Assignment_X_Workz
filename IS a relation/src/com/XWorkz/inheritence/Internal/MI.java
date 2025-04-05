package com.XWorkz.inheritence.Internal;

public class MI extends IPL{
    public MI()
    {
        super();
        System.out.println("No args MI Team Constructor");
    }
    @Override
    public void captanName()
    {
        System.out.println("Caption Name Rohith Sharma");
    }
    @Override
    public void win()
    {
        System.out.println("Total Number of Win 3");
    }
    @Override
    public void loss()
    {
        System.out.println("Total Number of Loss 2");
    }
    @Override
    public void color()
    {
        System.out.println("Color Blue");
    }
    @Override
    public void score()
    {
        System.out.println("Higest Score 210");
    }
}
