package com.xworkz.external;

import com.xworkz.internal.Chochalate;

public class Ghirardelli extends Chochalate {
    private String name;
    private int price;
    private char grade;
    public Ghirardelli(String name,int price,char grade)
    {
        this.grade=grade;
        this.name=name;
        this.price=price;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 523;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("Null Value: ");
            if(obj instanceof Ghirardelli){
                System.out.println("Comapare: ");
                Ghirardelli ghirardelli = this;
                Ghirardelli ghirardelli1 =(Ghirardelli) obj;
                if(ghirardelli.price==ghirardelli1.price && ghirardelli.name==ghirardelli1.name && ghirardelli.grade==ghirardelli1.grade){
                    System.out.println("Compare With the Things: "+(ghirardelli1==ghirardelli));
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
