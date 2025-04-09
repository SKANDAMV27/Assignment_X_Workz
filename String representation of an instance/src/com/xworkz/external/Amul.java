package com.xworkz.external;

import com.xworkz.internal.Chochalate;

public class Amul extends Chochalate {
    private String name;
    private int price;
    private char grade;
    public Amul(String name,int price,char grade)
    {
        this.grade=grade;
        this.name=name;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Ferrero{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", grade=" + grade +
                '}';
    }
}
