package com.XWorkz.inheritence.Internal;

public class Panipuri extends Food{
    public Panipuri()
    {
        System.out.println("No agrs Panipuri Constructor");
    }
    @Override
    public void items()
    {
        System.out.println("Food Puri");
    }
    @Override
    public void teast()
    {
        System.out.println("Food Teast");
    }
    @Override
    public void price()
    {
        System.out.println("Food Price");
    }
    @Override
    public void name()
    {
        System.out.println("Food Name");
    }
    @Override
    public void type()
    {
        System.out.println("Type of Food");
    }
}
