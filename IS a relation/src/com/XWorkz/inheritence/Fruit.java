package com.XWorkz.inheritence;

public class Fruit extends Apple{
    public Fruit()
    {
        super();
        System.out.println("No args Fruit Constructor;");
    }
    @Override
    public void price()
    {
        System.out.println("Apple Price");
    }
    @Override
    public void colour()
    {
        System.out.println("Apple Colour");
    }
    @Override
    public void kg()
    {
        System.out.println("Apple Kg");
    }
    @Override
    public void type()
    {
        System.out.println("Apple Type");
    }
    @Override
    public void Size()
    {
        System.out.println("Size of Apple");
    }

}
