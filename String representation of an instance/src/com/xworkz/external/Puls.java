package com.xworkz.external;

import com.xworkz.internal.Chochalate;

public class Puls extends Chochalate {
    private String name;
    private int price;
    private char grade;
    public Puls(String name,int price,char grade)
    {
        this.grade=grade;
        this.name=name;
        this.price=price;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 745;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("Null Value: ");
            if(obj instanceof Puls){
                System.out.println("Comapare: ");
                Puls puls = this;
                Puls puls1 =(Puls) obj;
                if(puls.price==puls1.price && puls.name==puls1.name && puls.grade==puls1.grade){
                    System.out.println("Compare With the Things: "+(puls1==puls));
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
