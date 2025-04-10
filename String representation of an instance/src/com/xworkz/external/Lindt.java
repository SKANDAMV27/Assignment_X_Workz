package com.xworkz.external;

import com.xworkz.internal.Chochalate;

public class Lindt extends Chochalate {
    private String name;
    private int price;
    private char grade;
    public Lindt(String name,int price,char grade)
    {
        this.grade=grade;
        this.name=name;
        this.price=price;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 32669;
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
