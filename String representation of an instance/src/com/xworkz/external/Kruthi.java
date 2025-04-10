package com.xworkz.external;

import com.xworkz.internal.Student;

public class Kruthi extends Student {
    private String name;
    private int age;
    private char grade;
    public Kruthi(String name,int age,char grade)
    {
        this.age=age;
        this.name=name;
        this.grade=grade;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 1814;
    }
    @Override
    public String toString() {
        return "Kruthi{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
