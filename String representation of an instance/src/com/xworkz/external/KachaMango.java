package com.xworkz.external;

import com.xworkz.internal.Chochalate;

public class KachaMango extends Chochalate {
    private String name;
    private int price;
    private char grade;
    public KachaMango(String name,int price,char grade)
    {
        this.grade=grade;
        this.name=name;
        this.price=price;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 7412;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("Null Value: ");
            if(obj instanceof KachaMango){
                System.out.println("Comapare: ");
                KachaMango kachaMango = this;
                KachaMango kachaMango1 =(KachaMango) obj;
                if(kachaMango1.price==kachaMango.price && kachaMango1.name==kachaMango.name && kachaMango1.grade==kachaMango.grade){
                    System.out.println("Compare With the Things: "+(kachaMango1==kachaMango));
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
