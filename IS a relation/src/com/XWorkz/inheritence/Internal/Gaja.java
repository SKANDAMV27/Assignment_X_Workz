package com.XWorkz.inheritence.Internal;

public class Gaja extends Movie{
    public Gaja()
    {
        super();
        System.out.println("No args Gaja movie Constructor");
    }
    @Override
    public void movieName()
    {
        System.out.println("Movie Name Gaja");
    }
    @Override
    public void movieLocation()
    {
        System.out.println("Movie Shotting Location Koppa");
    }
    @Override
    public void heroName()
    {
        System.out.println("Hero Name Dharshan");
    }
    @Override
    public void heroinName()
    {
        System.out.println("Heroin Name Kavya");
    }
    @Override
    public void rating()
    {
        System.out.println("Movie Ratting *****");
    }
}
