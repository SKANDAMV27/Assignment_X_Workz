package com.XWorkz.inheritence.Internal;

public class Abhi extends Movie{
    public Abhi()
    {
        System.out.println("No args Abhi Movie Constructor");
    }
    @Override
    public void movieName()
    {
        System.out.println("Movie Name ABHI");
    }
    @Override
    public void movieLocation()
    {
        System.out.println("Movie Shooting Location Joga");
    }
    @Override
    public void heroName()
    {
        System.out.println("Hero Name Sudeep");
    }
    @Override
    public void heroinName()
    {
        System.out.println("Hero in Name Ramya");
    }
    @Override
    public void rating()
    {
        System.out.println("Movie rating 4");
    }
}
