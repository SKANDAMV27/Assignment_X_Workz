package com.xworkz.external;

import com.xworkz.internal.Chochalate;

public class MilkyBar extends Chochalate {
    private String name;
    private int price;
    private char grade;
    public MilkyBar(String name,int price,char grade)
    {
        this.grade=grade;
        this.name=name;
        this.price=price;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 485;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("Null Value: ");
            if(obj instanceof MilkyBar){
                System.out.println("Comapare: ");
                MilkyBar milkyBar = this;
                MilkyBar milkyBar1 =(MilkyBar) obj;
                if(milkyBar1.price==milkyBar.price && milkyBar1.name==milkyBar.name && milkyBar1.grade==milkyBar.grade){
                    System.out.println("Compare With the Things: "+(milkyBar1==milkyBar));
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
