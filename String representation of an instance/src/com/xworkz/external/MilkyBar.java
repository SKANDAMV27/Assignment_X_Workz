package com.xworkz.external;

import com.xworkz.internal.Chochalate;

public class MilkyBar extends Chochalate {
    private String name;
    private int price;
    private char grade;
    public MilkyBar(String name,int price,char grade)
    {
        this.grade=grade;
        this.name=name;
        this.price=price;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 485;
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
