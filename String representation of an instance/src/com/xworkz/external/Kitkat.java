package com.xworkz.external;

import com.xworkz.internal.Chochalate;

public class Kitkat extends Chochalate {
    private String name;
    private int price;
    private char grade;
    public Kitkat(String name,int price,char grade)
    {
        this.grade=grade;
        this.name=name;
        this.price=price;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 12346;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("Null Value: ");
            if(obj instanceof Kitkat){
                System.out.println("Comapare: ");
                Kitkat kitkat = this;
                Kitkat kitkat1 =(Kitkat) obj;
                if(kitkat.name==kitkat1.name && kitkat.price==kitkat1.price && kitkat.grade==kitkat1.grade){
                    System.out.println("Compare With the Things: "+(kitkat1==kitkat));
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
