package com.xworkz.external;

import com.xworkz.internal.Student;

public class Arun extends Student {
    private String name;
    private int age ;
    private char grade;
    public Arun(String name,int age,char grade)
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
            if(obj instanceof Arun){
                System.out.println("Compare: ");
                Arun arun = this;
                Arun arun1 =(Arun) obj;
                if(arun1.name==arun.name && arun.grade==arun1.grade && arun1.age==arun.age){
                    System.out.println("Compare: "+(arun1==arun));
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
