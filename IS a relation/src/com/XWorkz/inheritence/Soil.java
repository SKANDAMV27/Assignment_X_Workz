package com.XWorkz.inheritence;

public class Soil extends Sand{
    public Soil()
    {
        super();
        System.out.println("No args Soil Constructor");
    }
    @Override
    public void type(){
        System.out.println("Type of Soil");
    }
    public void color()
    {
        System.out.println("Color of the Soil");
    }
    public void area()
    {
        System.out.println("Area to Found the Soil.");
    }
    public void quality()
    {
        System.out.println("Quality of the Soil");
    }
    public void quantity()
    {
        System.out.println("Quantity of the Soil");
    }
}
