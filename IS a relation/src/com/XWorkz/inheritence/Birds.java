package com.XWorkz.inheritence;

public class Birds extends Parrot {
    public Birds()
    {
        super();
        System.out.println("No args of Birds Constructor");
    }
    @Override
    public void number()
    {
        System.out.println("Number of Birds");
    }
    @Override
    public void gender()
    {
        System.out.println("Gender of Parrots");
    }
    @Override
    public void parrotColor()
    {
        System.out.println("Birds Colour");
    }
    @Override
    public void weight()
    {
        System.out.println("Weight of Birds");
    }
    @Override
    public void parrotLocation()
    {
        System.out.println("Location of Birds");
    }
}
