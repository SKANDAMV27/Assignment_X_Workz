package com.xworkz.external;

import com.xworkz.internal.Chochalate;

public class Ferrero extends Chochalate {
    private String name;
    private int price;
    private char grade;
    public Ferrero(String name,int price,char grade)
    {
        this.grade=grade;
        this.name=name;
        this.price=price;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 4;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("Null Value: ");
            if(obj instanceof Ferrero){
                System.out.println("Comapare: ");
                Ferrero ferrero = this;
                Ferrero ferrero1 =(Ferrero) obj;
                if(ferrero.price==ferrero1.price && ferrero.name==ferrero1.name && ferrero.grade==ferrero1.grade){
                    System.out.println("Compare With the Things: "+(ferrero1==ferrero));
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

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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
