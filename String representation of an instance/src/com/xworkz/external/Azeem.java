package com.xworkz.external;

import com.xworkz.internal.Student;

public class Azeem extends Student {
    private String name;
    private int age ;
    private char grade;
    public Azeem(String name,int age,char grade)
    {
        this.age=age;
        this.grade=grade;
        this.name=name;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 99999;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("NUll");
            if(obj instanceof Azeem){
                System.out.println("Compare: ");
                Azeem azeem = this;
                Azeem azeem1 =(Azeem) obj;
                if(azeem.name==azeem1.name && azeem.grade==azeem1.grade && azeem1.age==azeem.age){
                    System.out.println("Compare: "+(azeem1==azeem));
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
