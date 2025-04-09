package com.xworkz.external;

import com.xworkz.internal.Chochalate;

public class Puls extends Chochalate {
    private String name;
    private int price;
    private char grade;
    public Puls(String name,int price,char grade)
    {
        this.grade=grade;
        this.name=name;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Manch{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", grade=" + grade +
                '}';
    }

}
