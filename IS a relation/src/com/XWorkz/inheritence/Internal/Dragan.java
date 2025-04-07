package com.XWorkz.inheritence.Internal;

public class Dragan extends Movie{
    public Dragan()
    {
        super();
        System.out.println("no args as a Dragran Movie Constructor");
    }
    @Override
    public void heroName()
    {
        System.out.println("Movie Name Dragan");
    }
    @Override
    public void movieName()
    {
        System.out.println("Hero name Sagar");
    }
    @Override
    public void heroinName()
    {
        System.out.println("Heroin name....");
    }
    @Override
    public void movieLocation()
    {
        System.out.println("Movie Shotting Location");
    }
    @Override
    public void rating()
    {
        System.out.println("Movie Ratting");
    }
    public void Collection()
    {
        System.out.println("Dragan Movie Collection");
    }
}
