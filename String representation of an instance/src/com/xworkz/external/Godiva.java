package com.xworkz.external;

import com.xworkz.internal.Chochalate;

public class Godiva extends Chochalate {
    private String name;
    private int price;
    private char grade;
    public Godiva(String name,int price,char grade)
    {
        this.grade=grade;
        this.name=name;
        this.price=price;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 4521;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("Null Value: ");
            if(obj instanceof Godiva){
                System.out.println("Comapare: ");
                Godiva godiva = this;
                Godiva godiva1 =(Godiva) obj;
                if(godiva.name==godiva1.name && godiva.price==godiva1.price && godiva.grade==godiva1.grade){
                    System.out.println("Compare With the Things: "+(godiva1==godiva));
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
