package com.xworkz.external;

import com.xworkz.internal.Chochalate;

public class Milka extends Chochalate {
    private String name;
    private int price;
    private char grade;
    public Milka(String name,int price,char grade)
    {
        this.grade=grade;
        this.name=name;
        this.price=price;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 526;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("Null Value: ");
            if(obj instanceof Milka){
                System.out.println("Comapare: ");
                Milka milka = this;
                Milka milka1 =(Milka) obj;
                if(milka.price==milka1.price && milka.name==milka1.name && milka.grade==milka1.grade){
                    System.out.println("Compare With the Things: "+(milka1==milka));
                    return true;
                }
            }

        }
        return false;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
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

    @Override
    public String toString() {
        return "Ferrero{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", grade=" + grade +
                '}';
    }
}
