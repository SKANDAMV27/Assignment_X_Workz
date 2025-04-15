package com.xworkz.external;

import com.xworkz.internal.Student;

public class Imaz extends Student {
    private String name;
    private int age ;
    private char grade;
    public Imaz(String name,int age,char grade)
    {
        this.age=age;
        this.grade=grade;
        this.name=name;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 7220;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("Null:");
            if(obj instanceof Imaz){
                Imaz imaz =this;
                Imaz imaz1 = (Imaz) obj;
                if(imaz.age==imaz1.age && imaz.name==imaz1.name && imaz.grade==imaz1.grade){
                    System.out.println("Compare: "+(imaz1==imaz));
                    return true;
                }
            }
        }
        return false;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Imaz{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
