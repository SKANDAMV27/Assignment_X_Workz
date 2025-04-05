package com.XWorkz.inheritence.Internal;

public class Appu extends Movie{
    public Appu()
    {
        super();
        System.out.println("No args Appu Movie Constructor");
    }
    @Override
    public void movieName()
    {
        System.out.println("Movie Name Arasu");
    }
    @Override
    public void heroName()
    {
        System.out.println("Hero Name Puneeth");
    }
    @Override
    public void heroinName()
    {
        System.out.println("Heroin Name Rakshitha");
    }
    @Override
    public void movieLocation()
    {
        System.out.println("Movie Shooting Location Mysoure");
    }
    @Override
    public void rating()
    {
        System.out.println("Movie Rating *****");
    }
}
