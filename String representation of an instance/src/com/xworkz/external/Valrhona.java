package com.xworkz.external;

import com.xworkz.internal.Chochalate;

public class Valrhona extends Chochalate {
    private String name;
    private int price;
    private char grade;
    public Valrhona(String name,int price,char grade)
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
            if(obj instanceof Valrhona){
                System.out.println("Comapare: ");
                Valrhona valrhona = this;
                Valrhona valrhona1 =(Valrhona) obj;
                if(valrhona.name==valrhona1.name && valrhona.price==valrhona1.price && valrhona.grade==valrhona1.grade){
                    System.out.println("Compare With the Things: "+(valrhona1==valrhona));
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
