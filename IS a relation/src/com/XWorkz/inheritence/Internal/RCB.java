package com.XWorkz.inheritence.Internal;

public class RCB extends IPL{
    public RCB(){
        super();
        System.out.println("No args RCB Constructor");
    }
    @Override
    public void captanName()
    {
        System.out.println("Caption Name Virat kolhi");
    }
    @Override
    public void win()
    {
        System.out.println("Total 3 win");
    }
    @Override
    public void loss()
    {
        System.out.println("2 Match Loss");
    }
    @Override
    public void color()
    {
        System.out.println("Jurshy Color RED");
    }
    @Override
    public void score()
    {
        System.out.println("Higest Scpore 250");
    }
}
