package com.XWorkz.inheritence;

public class Canteen extends Hotel{
    public Canteen()
    {
        super();
        System.out.println("No args Canteen Constructor");
    }
    @Override
    public void plate()
    {
        System.out.println("Number of Plate in Canteen");
    }
    @Override
    public void menu()
    {
        System.out.println("Canteen Menu");
    }
    @Override
    public void dosa()
    {
        System.out.println("Dosa in Canteen");
    }
    @Override
    public void supplear()
    {
        System.out.println("Canteen Suppler");
    }
    @Override
    public void business()
    {
        System.out.println("Canteen Business");
    }
}
