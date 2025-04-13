package com.xworkz.external;

import com.xworkz.internal.Chochalate;

public class Dark extends Chochalate {
    private String name;
    private int price;
    private char grade;
    public Dark(String name,int price,char grade)
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
            if(obj instanceof Dark){
                System.out.println("Comapare: ");
                Dark dark = this;
                Dark dark1 =(Dark) obj;
                if(dark.price==dark1.price && dark.name==dark1.name && dark.grade==dark1.grade){
                    System.out.println("Compare With the Things: "+(dark1==dark));
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
