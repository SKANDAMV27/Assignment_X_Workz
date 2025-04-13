package com.xworkz.external;

import com.xworkz.internal.Chochalate;

public class KinderJoy extends Chochalate {
    private String name;
    private int price;
    private char grade;
    public KinderJoy(String name,int price,char grade)
    {
        this.grade=grade;
        this.name=name;
        this.price=price;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 85220;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("Null Value: ");
            if(obj instanceof KinderJoy){
                System.out.println("Comapare: ");
                KinderJoy kinderJoy = this;
                KinderJoy kinderJoy1 =(KinderJoy) obj;
                if(kinderJoy.price==kinderJoy1.price && kinderJoy.name==kinderJoy1.name && kinderJoy.grade==kinderJoy1.grade){
                    System.out.println("Compare With the Things: "+(kinderJoy1==kinderJoy));
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
        return "Manch{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", grade=" + grade +
                '}';
    }
}
