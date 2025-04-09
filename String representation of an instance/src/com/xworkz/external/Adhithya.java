package com.xworkz.external;

import com.xworkz.internal.Student;

public class Adhithya extends Student {
    private String name;
    private int age ;
    private char grade;
    public Adhithya(String name,int age,char grade)
    {
        this.age=age;
        this.grade=grade;
        this.name=name;
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
