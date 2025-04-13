package com.xworkz.external;

import com.xworkz.internal.Chochalate;

public class Amul extends Chochalate {
    private String name;
    private int price;
    private char grade;
    public Amul(String name,int price,char grade)
    {
        this.grade=grade;
        this.name=name;
        this.price=price;
    }

    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 585;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("Null Value:");
            if(obj instanceof Amul){
                Amul amul = this;
                Amul amul1 = (Amul)obj;
                if(amul1.grade==amul.grade && amul1.name==amul.name&&amul1.price==amul.price){
                    System.out.println("Compare: "+(amul1==amul));
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
