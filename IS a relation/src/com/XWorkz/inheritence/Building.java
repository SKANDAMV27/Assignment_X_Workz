package com.XWorkz.inheritence;

public class Building extends Home {
    public Building(){
        super();
        System.out.println("No args of Building Constructor");
    }
    @Override
    public void bedRoom()
    {
        System.out.println("Building Consist of Bed Room");
    }
    @Override
    public void hall()
    {
        System.out.println("Building Consist of Hall");
    }
    @Override
    public void kitchen()
    {
        System.out.println("Building Consist of Kitchen");
    }
    @Override
    public void bathRoom()
    {
        System.out.println("Building Consist of BathRoom");
    }
    @Override
    public void dinningHall()
    {
        System.out.println("Building Consist of Dinning Hall");
    }
}
