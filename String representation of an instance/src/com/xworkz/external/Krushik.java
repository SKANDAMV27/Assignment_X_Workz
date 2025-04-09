package com.xworkz.external;

import com.xworkz.internal.Student;

public class Krushik extends Student {
    private String name;
    private int age ;
    private char grade;
    public Krushik(String name,int age,char grade)
    {
        this.age=age;
        this.grade=grade;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Kushik{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
