package com.xworkz.external;

import com.xworkz.internal.Chochalate;

public class Richart extends Chochalate {
    private String name;
    private int price;
    private char grade;
    public Richart(String name,int price,char grade)
    {
        this.grade=grade;
        this.name=name;
        this.price=price;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 854;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("Null Value: ");
            if(obj instanceof Richart){
                System.out.println("Comapare: ");
                Richart richart = this;
                Richart richart1 =(Richart) obj;
                if(richart.name==richart1.name && richart.price==richart1.price && richart.grade==richart1.grade){
                    System.out.println("Compare With the Things: "+(richart1==richart));
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
