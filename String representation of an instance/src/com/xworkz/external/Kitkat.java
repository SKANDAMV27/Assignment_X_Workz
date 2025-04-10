package com.xworkz.external;

import com.xworkz.internal.Chochalate;

public class Kitkat extends Chochalate {
    private String name;
    private int price;
    private char grade;
    public Kitkat(String name,int price,char grade)
    {
        this.grade=grade;
        this.name=name;
        this.price=price;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 12346;
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
