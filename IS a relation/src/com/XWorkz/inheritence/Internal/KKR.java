package com.XWorkz.inheritence.Internal;

public class KKR extends IPL{
    public  KKR()
    {
        super();
        System.out.println("No args KKR Team Constructor");
    }
    @Override
    public void captanName()
    {
        System.out.println("KKR Team Caption Name>><");
    }
    @Override
    public void win()
    {
        System.out.println("Total NUmber of Time Win 2");
    }
    @Override
    public void loss()
    {
        System.out.println("Total number of Loss 3");
    }
    @Override
    public void score()
    {
        System.out.println("Higest Score 200");
    }
}
