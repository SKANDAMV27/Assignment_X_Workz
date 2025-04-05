package com.XWorkz.inheritence.Internal;

public class FootBall extends Game {
    public FootBall()
    {
        System.out.println("No args Foot Ball Constructor");
    }
    @Override
    public void number()
    {
        System.out.println("Number Of Players 8");
    }
    @Override
    public void team()
    {
        System.out.println("Number of Team 10");
    }
    @Override
    public void captionName()
    {
        System.out.println("Caption Name Kannan");
    }
    @Override
    public void name()
    {
        System.out.println("Team Name JNNCE");
    }
    @Override
    public void date()
    {
        System.out.println("Friday");
    }
}
