package com.xworkz.external;

import com.xworkz.internal.Chochalate;

public class CocoaPowder extends Chochalate {
    private String name;
    private int price;
    private char grade;
    public CocoaPowder(String name,int price,char grade)
    {
        this.grade=grade;
        this.name=name;
        this.price=price;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 963;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("Null Value: ");
            if(obj instanceof CocoaPowder){
                System.out.println("Comapare: ");
                CocoaPowder cocoaPowder = this;
                CocoaPowder cocoaPowder1 =(CocoaPowder) obj;
                if(cocoaPowder.price==cocoaPowder1.price && cocoaPowder.name==cocoaPowder1.name && cocoaPowder.grade==cocoaPowder1.grade){
                    System.out.println("Compare With the Things: "+(cocoaPowder1==cocoaPowder));
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
