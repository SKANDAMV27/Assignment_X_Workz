package com.xworkz.external;

import com.xworkz.internal.Student;

public class Abhi extends Student {
    private String name;
    private int age ;
    private char grade;
    public Abhi(String name,int age,char grade)
    {
        this.age=age;
        this.grade=grade;
        this.name=name;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 45;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("NUll");
            if(obj instanceof Abhi){
                System.out.println("Compare: ");
                Abhi abhi = this;
                Abhi abhi1 =(Abhi) obj;
                if(abhi.name==abhi1.name && abhi.grade==abhi1.grade && abhi.age==abhi1.age){
                    System.out.println("Compare: "+(abhi1==abhi));
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Arun{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
