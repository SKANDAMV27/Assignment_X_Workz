package com.xworkz.external;

import com.xworkz.internal.Car;

public class Vehicle extends Car {
    private String company;
    private int price;
    private char grade;
    private String color;
    public Vehicle(String color,String company,int price,char grade){
        this.color=color;
        this.grade=grade;
        this.company=company;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "company='" + company + '\'' +
                ", price=" + price +
                ", grade=" + grade +
                ", color='" + color + '\'' +
                '}';
    }
}
