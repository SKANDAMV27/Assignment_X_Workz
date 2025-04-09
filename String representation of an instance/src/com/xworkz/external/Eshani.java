package com.xworkz.external;

import com.xworkz.internal.Student;

public class Eshani extends Student {
    private String name;
    private int age ;
    private char grade;
    public Eshani(String name,int age,char grade)
    {
        this.age=age;
        this.grade=grade;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Eshani{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
