package com.XWorkz.inheritence.Internal;

public class Cricket extends Game{
    public Cricket()
    {
        super();
        System.out.println("No args Cricket Game Constructor");
    }
    @Override
    public void number()
    {
        System.out.println("Total Number of Players 11");
    }
    @Override
    public void team()
    {
        System.out.println("Total NUmber of Team 10");
    }
    @Override
    public void captionName()
    {
        System.out.println("Caption Name Sagar:");
    }
    @Override
    public void date()
    {
        System.out.println("Team Name Hunters");
    }
    @Override
    public void name()
    {
        System.out.println("Monday");
    }
}
