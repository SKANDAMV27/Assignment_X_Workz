package com.XWorkz.inheritence.Internal;

public class GT extends IPL{
    public GT()
    {
        super();
        System.out.println("No args GT Team Constructor");
    }
    @Override
    public void captanName()
    {
        System.out.println("GT Caption Name Abhi");
    }
    @Override
    public void win()
    {
        System.out.println("Total Time Wine 3");
    }
    @Override
    public void loss()
    {
        System.out.println("Number Time Loss 2");
    }
    @Override
    public void color()
    {
        System.out.println("Team Color Green");
    }
    @Override
    public void score()
    {
        System.out.println("Higest Score 180");
    }
}
