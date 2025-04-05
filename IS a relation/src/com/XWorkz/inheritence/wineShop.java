package com.XWorkz.inheritence;

public class wineShop extends Bar{
    public wineShop(){
        super();
        System.out.println("No args wineShop");
    }
    @Override
    public void brand(){

        System.out.println("Type of Brand in Wine Shop");
    }
    @Override
    public  void owner(){
        System.out.println("Wine Shop Owner Name");

    }
    @Override
    public void barLocation(){

        System.out.println("Wine Shop Location");
    }
    @Override
    public void beer()
    {
        System.out.println("Beer in Wine Shop");
    }
    @Override
    public void area()
    {
        System.out.println("Wine shop Area");
    }

}
