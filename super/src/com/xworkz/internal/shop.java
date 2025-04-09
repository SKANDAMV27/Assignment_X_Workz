package com.xworkz.internal;

public class shop extends Coffee {
    public shop()
    {
        super();
        System.out.println("No args shop Constructor");
    }
    public void location()
    {
        System.out.println("Shop Location");
        super.hot();
        super.cold();
    }

}
