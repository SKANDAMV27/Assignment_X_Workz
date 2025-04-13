package com.xworkz.external;

import com.xworkz.internal.Chochalate;

public class BittersweetChocolate extends Chochalate {
    private String name;
    private int price;
    private char grade;
    public BittersweetChocolate(String name,int price,char grade)
    {
        this.grade=grade;
        this.name=name;
        this.price=price;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 720;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("Null Value:");
            if(obj instanceof BittersweetChocolate){
                BittersweetChocolate bittersweetChocolate = this;
                BittersweetChocolate bittersweetChocolate1 = (BittersweetChocolate) obj;
                if(bittersweetChocolate.grade==bittersweetChocolate1.grade && bittersweetChocolate.name==bittersweetChocolate1.name&&bittersweetChocolate.price==bittersweetChocolate1.price){
                    System.out.println("Compare: "+(bittersweetChocolate1==bittersweetChocolate));
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
