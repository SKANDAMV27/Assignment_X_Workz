package com.XWorkz.inheritence.Internal;

public class Kabadi extends Game{
    public Kabadi(){
        super();
        System.out.println("No args Kabadi Constructor");
    }
    @Override
    public void number()
    {
        System.out.println("Number Of Players 7");
    }
    @Override
    public void team()
    {
        System.out.println("Number of Team 7");
    }
    @Override
    public void captionName()
    {
        System.out.println("Caption Name Kiran");
    }
    @Override
    public void name()
    {
        System.out.println("Team Name Boyss");
    }
    @Override
    public void date()
    {
        System.out.println("Saturday");
    }

}
