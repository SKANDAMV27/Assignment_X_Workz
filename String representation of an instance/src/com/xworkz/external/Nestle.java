package com.xworkz.external;

import com.xworkz.internal.Chochalate;

public class Nestle extends Chochalate {
    private String name;
    private int price;
    private char grade;
    public Nestle(String name,int price,char grade)
    {
        this.grade=grade;
        this.name=name;
        this.price=price;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 802;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("Null Value: ");
            if(obj instanceof Nestle){
                System.out.println("Comapare: ");
                Nestle nestle = this;
                Nestle nestle1 =(Nestle) obj;
                if(nestle.name==nestle1.name && nestle.price==nestle1.price && nestle.grade==nestle1.grade){
                    System.out.println("Compare With the Things: "+(nestle==nestle1));
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
