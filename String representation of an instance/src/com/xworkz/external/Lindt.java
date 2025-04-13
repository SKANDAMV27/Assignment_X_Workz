package com.xworkz.external;

import com.xworkz.internal.Chochalate;

public class Lindt extends Chochalate {
    private String name;
    private int price;
    private char grade;
    public Lindt(String name,int price,char grade)
    {
        this.grade=grade;
        this.name=name;
        this.price=price;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 32669;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("Null Value: ");
            if(obj instanceof Lindt){
                System.out.println("Comapare: ");
                Lindt lindt = this;
                Lindt lindt1 =(Lindt) obj;
                if(lindt.name==lindt1.name && lindt.price==lindt1.price && lindt.grade==lindt1.grade){
                    System.out.println("Compare With the Things: "+(lindt1==lindt));
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
