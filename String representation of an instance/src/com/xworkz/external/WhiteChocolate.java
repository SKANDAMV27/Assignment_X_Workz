package com.xworkz.external;

import com.xworkz.internal.Chochalate;

public class WhiteChocolate extends Chochalate {
    private String name;
    private int price;
    private char grade;
    public WhiteChocolate(String name,int price,char grade)
    {
        this.grade=grade;
        this.name=name;
        this.price=price;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 421;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("Null Value: ");
            if(obj instanceof WhiteChocolate){
                System.out.println("Comapare: ");
                WhiteChocolate whiteChocolate = this;
                WhiteChocolate whiteChocolate1 =(WhiteChocolate) obj;
                if(whiteChocolate.price==whiteChocolate1.price && whiteChocolate.name==whiteChocolate1.name && whiteChocolate.grade==whiteChocolate1.grade){
                    System.out.println("Compare With the Things: "+(whiteChocolate1==whiteChocolate));
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
