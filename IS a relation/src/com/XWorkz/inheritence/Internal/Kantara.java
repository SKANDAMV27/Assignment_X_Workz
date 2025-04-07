package com.XWorkz.inheritence.Internal;

public class Kantara extends Movie{
    public Kantara()
    {
        System.out.println("No args Kantara Movie Constructor");
    }
    @Override
    public void movieName()
    {
        System.out.println("Movie Name Kantara");
    }
    @Override
    public void heroName()
    {
        System.out.println("Movie Hero Name Rishab Shetty");
    }
    @Override
    public void heroinName()
    {
        System.out.println("Movie Heroin Name Sapthami Gowda");
    }
    @Override
    public void movieLocation()
    {
        System.out.println("Movie Shotting Location kundapur");
    }
    @Override
    public void rating()
    {
        System.out.println("Moving Ratting *****");
    }

}
