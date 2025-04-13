package com.xworkz.external;

import com.xworkz.internal.Student;

public class Amith extends Student {
    private String name;
    private int age ;
    private char grade;
    public Amith(String name,int age,char grade)
    {
        this.age=age;
        this.grade=grade;
        this.name=name;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 7400;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("NUll");
            if(obj instanceof Amith){
                System.out.println("Compare: ");
                Amith amith = this;
                Amith amith1 =(Amith) obj;
                if(amith.name==amith1.name && amith.grade==amith1.grade && amith.age==amith1.age){
                    System.out.println("Compare: "+(amith==amith1));
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
