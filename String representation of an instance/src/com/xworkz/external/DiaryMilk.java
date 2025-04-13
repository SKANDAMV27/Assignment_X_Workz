package com.xworkz.external;

import com.xworkz.internal.Chochalate;

public class DiaryMilk extends Chochalate {
    private String name;
    private int price;
    private char grade;
    public DiaryMilk(String name,int price,char grade)
    {
        this.grade=grade;
        this.name=name;
        this.price=price;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 2781;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("Null Value: ");
            if(obj instanceof DiaryMilk){
                System.out.println("Comapare: ");
                DiaryMilk diaryMilk = this;
                DiaryMilk diaryMilk1 =(DiaryMilk) obj;
                if(diaryMilk.price==diaryMilk1.price && diaryMilk.name==diaryMilk1.name && diaryMilk.grade==diaryMilk.grade){
                    System.out.println("Compare With the Things: "+(diaryMilk1==diaryMilk));
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
