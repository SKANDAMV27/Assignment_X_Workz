package com.XWorkz.inheritence.Internal;

public class Mad extends Movie{
    public Mad()
    {
        super();
        System.out.println("No args as Mad Movie Constructor");
    }
    @Override
    public void movieName()
    {
        System.out.println("Movie Name Mad");
    }
    @Override
    public void heroName()
    {
        System.out.println("Hero Name");
    }
    @Override
    public void heroinName()
    {
        System.out.println("heroin Name");
    }
    @Override
    public void movieLocation()
    {
        System.out.println("Movie Location Shivamogga");
    }
    @Override
    public void rating()
    {
        System.out.println("Movie Ratting");
    }
    public void Collection()
    {
        System.out.println("Mad Movie Collection");
    }
}
