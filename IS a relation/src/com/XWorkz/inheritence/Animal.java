package com.XWorkz.inheritence;

public class Animal extends Cow {
    public Animal(){
        super();
        System.out.println("No args Animal Constructor");
    }
    @Override
    public void cowName()
    {
        System.out.println("Name of Animal is cow");
    }
    @Override
    public void cowBread()
    {
        System.out.println("Breed of Cow");
    }
    @Override
    public void cowColour()
    {
        System.out.println("Cow Colour");
    }
    @Override
    public void cowSize()
    {
        System.out.println("Cow Size.");
    }
    @Override
    public void cowPrice()
    {
        System.out.println("Cow Cost");
    }
}
