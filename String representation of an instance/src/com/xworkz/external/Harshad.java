package com.xworkz.external;

import com.xworkz.internal.Student;

public class Harshad extends Student {
    private String name;
    private int age ;
    private char grade;
    public Harshad(String name,int age,char grade)
    {
        this.age=age;
        this.grade=grade;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Harshad{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
