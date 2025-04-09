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
    public String toString() {
        return "Device{" +
                "price=" + price +
                ", company='" + company + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
