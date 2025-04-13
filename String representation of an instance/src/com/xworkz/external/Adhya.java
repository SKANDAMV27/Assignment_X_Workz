package com.xworkz.external;

import com.xworkz.internal.Student;

public class Adhya extends Student {
    private String name;
    private int age ;
    private char grade;
    public Adhya(String name,int age,char grade)
    {
        this.age=age;
        this.grade=grade;
        this.name=name;
    }

    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 185;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("NUll");
            if(obj instanceof Adhya){
                System.out.println("Compare: ");
                Adhya adhya = this;
                Adhya adhya1 =(Adhya) obj;
                if(adhya.name==adhya1.name && adhya.grade==adhya1.grade && adhya.age==adhya1.age){
                    System.out.println("Compare: "+(adhya1==adhya));
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
