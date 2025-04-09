package com.xworkz.external;

import com.xworkz.internal.Student;

public class Gowthami extends Student {
    private String name;
    private int age ;
    private char grade;
    public Gowthami(String name,int age,char grade)
    {
        this.age=age;
        this.grade=grade;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Gowthami{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
