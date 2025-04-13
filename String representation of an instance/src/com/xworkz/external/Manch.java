package com.xworkz.external;

import com.xworkz.internal.Chochalate;

public class Manch extends Chochalate {
    private String name;
    private int price;
    private char grade;
    public Manch(String name,int price,char grade)
    {
        this.grade=grade;
        this.name=name;
        this.price=price;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 15420;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("Null Value: ");
            if(obj instanceof Manch){
                System.out.println("Comapare: ");
                Manch manch = this;
                Manch manch1 =(Manch) obj;
                if(manch.name==manch1.name && manch.price==manch1.price && manch.grade==manch1.grade){
                    System.out.println("Compare With the Things: "+(manch1==manch));
                    return true;
                }
            }

        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
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
