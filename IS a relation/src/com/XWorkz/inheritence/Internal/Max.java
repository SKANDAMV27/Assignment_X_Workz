package com.XWorkz.inheritence.Internal;

public class Max extends Movie{
    public Max()
    {
        super();
        System.out.println("No args Max Movie Constructor");
    }
    @Override
    public void movieName()
    {
        System.out.println("Movie Name");
    }
    @Override
    public void heroName()
    {
        System.out.println("Hero Name Sudeep");
    }
    @Override
    public void heroinName()
    {
        System.out.println("Heroin name...");
    }
    @Override
    public void rating()
    {
        System.out.println("Movie Ratting 5");
    }
    @Override
    public void movieLocation()
    {
        System.out.println("Movie Location Thirthahalli");
    }
}
