package com.xworkz.external;

import com.xworkz.internal.Student;

public class Bharath extends Student {
    private String name;
    private int age ;
    private char grade;
    public Bharath(String name,int age,char grade)
    {
        this.age=age;
        this.grade=grade;
        this.name=name;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 207;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("Null Value");
            if(obj instanceof Bharath){
                Bharath bharath = this;
                Bharath bharath1 =(Bharath) obj;
                if(bharath.age== bharath1.age&& bharath.grade== bharath1.grade&&bharath.name==bharath1.name){
                    System.out.println("Compare: "+(bharath1==bharath));
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
