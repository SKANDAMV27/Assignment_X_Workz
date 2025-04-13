package com.xworkz.external;

import com.xworkz.internal.Chochalate;

public class FiveStar extends Chochalate {
    private String name;
    private int price;
    private char grade;
    public FiveStar(String name,int price,char grade)
    {
        this.grade=grade;
        this.name=name;
        this.price=price;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 720;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("Null Value: ");
            if(obj instanceof FiveStar){
                System.out.println("Comapare: ");
                FiveStar fiveStar = this;
                FiveStar fiveStar1 =(FiveStar) obj;
                if(fiveStar.price==fiveStar1.price && fiveStar.name==fiveStar1.name && fiveStar.grade==fiveStar1.grade){
                    System.out.println("Compare With the Things: "+(fiveStar1==fiveStar));
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
