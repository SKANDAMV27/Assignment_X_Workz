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
    public  void owner(){
        System.out.println("Bar Owner Name");
    }
    public void barLocation(){

        System.out.println("Bar Location");
    }
    public void beer()
    {
        System.out.println("Beer in Bar");
    }
    public void area()
    {
        System.out.println("Bar Area");
    }

}
