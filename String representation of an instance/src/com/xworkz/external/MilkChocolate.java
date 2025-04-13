package com.xworkz.external;

import com.xworkz.internal.Chochalate;

public class MilkChocolate extends Chochalate {
    private String name;
    private int price;
    private char grade;
    public MilkChocolate(String name,int price,char grade)
    {
        this.grade=grade;
        this.name=name;
        this.price=price;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 41;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("Null Value: ");
            if(obj instanceof MilkChocolate){
                System.out.println("Comapare: ");
                MilkChocolate milkChocolate = this;
                MilkChocolate milkChocolate1 =(MilkChocolate) obj;
                if(milkChocolate.price==milkChocolate1.price && milkChocolate.name==milkChocolate1.name && milkChocolate.grade==milkChocolate1.grade){
                    System.out.println("Compare With the Things: "+(milkChocolate1==milkChocolate));
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
