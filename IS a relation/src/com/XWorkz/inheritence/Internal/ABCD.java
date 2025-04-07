package com.XWorkz.inheritence.Internal;

public class ABCD extends Movie{
    public ABCD()
    {
        super();
        System.out.println("No args ABCD Constructor");
    }
    @Override
    public void movieName()
    {
        System.out.println("Movie Name ABCD");
    }
    @Override
    public void movieLocation()
    {
        System.out.println("Movie Shooting Location");
    }
    @Override
    public void heroName()
    {
        System.out.println("Hero name Puneeth");
    }
    @Override
    public void heroinName()
    {
        System.out.println("Heroin name Radika Pandith");
    }
    @Override
    public void rating()
    {
        System.out.println("Movie Ratting");
    }
    public void collection()
    {
        System.out.println("Movie Collection");
    }
}
