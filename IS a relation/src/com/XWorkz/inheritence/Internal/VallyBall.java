package com.XWorkz.inheritence.Internal;

public class VallyBall extends Game{
    public VallyBall()
    {
        super();
        System.out.println("No Args Vally Ball Constructor");
    }
    @Override
    public void number()
    {
        System.out.println("Number Of Players 6");
    }
    @Override
    public void team()
    {
        System.out.println("Number of Team 20");
    }
    @Override
    public void captionName()
    {
        System.out.println("Caption Name Stan");
    }
    @Override
    public void name()
    {
        System.out.println("Team Name Runner");
    }
    @Override
    public void date()
    {
        System.out.println("Sunday");
    }
}
