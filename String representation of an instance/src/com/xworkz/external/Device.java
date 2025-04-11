package com.xworkz.external;

import com.xworkz.internal.Laptop;

public class Device extends Laptop {
    private int price;
    private String company;
    private String color;
    public Device(int price,String company,String color)
    {
        this.color=color;
        this.price=price;
        this.company=company;
    }

    @Override
    public int hashCode()
    {
        System.out.println("Device: "+super.hashCode());
        return 262;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){

            System.out.println("No Null Value");
            if(obj instanceof Movie)
            {

                Device device = this;
                Device device1 = (Device) obj;
                if(device1.company==device.company && device1.price==device.price && device1.color==device.color){
                    System.out.println("Compare:");
                    return true;
                }
            }

        }
        return false;
    }
    public int getPrice(){
        return price;
    }
    public  void setPrice(int price){
        this.price=price;
    }
    public String getCompany()
    {
        return company;
    }
    public void setCompany(String company)
    {
        this.company=company;
    }
    public String getColor()
    {
        return color;
    }
    public void setColor(String color)
    {
        this.color=color;
    }

    @Override
    public String toString() {
        return "Device{" +
                "price=" + price +
                ", company='" + company + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
