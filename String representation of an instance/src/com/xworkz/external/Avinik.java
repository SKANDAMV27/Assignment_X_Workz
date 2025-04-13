package com.xworkz.external;

import com.xworkz.internal.Student;

public class Avinik extends Student {
    private String name;
    private int age ;
    private char grade;
    public Avinik(String name,int age,char grade)
    {
        this.age=age;
        this.grade=grade;
        this.name=name;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 999;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("NUll");
            if(obj instanceof Avinik){
                System.out.println("Compare: ");
                Avinik avinik = this;
                Avinik avinik1 =(Avinik) obj;
                if(avinik.name==avinik1.name && avinik.grade==avinik1.grade && avinik.age==avinik1.age){
                    System.out.println("Compare: "+(avinik1==avinik));
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
        return "Arun{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
