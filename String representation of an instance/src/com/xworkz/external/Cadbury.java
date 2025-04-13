package com.xworkz.external;

import com.xworkz.internal.Chochalate;

public class Cadbury extends Chochalate {
    private String name;
    private int price;
    private char grade;
    public Cadbury(String name,int price,char grade)
    {
        this.grade=grade;
        this.name=name;
        this.price=price;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 8026;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("Null Value:");
            if(obj instanceof Cadbury){
                Cadbury cadbury = this;
                Cadbury cadbury1 = (Cadbury) obj;
                if(cadbury.grade==cadbury1.grade && cadbury.name==cadbury1.name&&cadbury.price==cadbury1.price){
                    System.out.println("Compare: "+(cadbury1==cadbury));
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
        return "Ferrero{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", grade=" + grade +
                '}';
    }
}
