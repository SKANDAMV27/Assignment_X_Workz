package com.xworkz.external;

import com.xworkz.internal.Student;

public class Balu extends Student {
    private String name;
    private int age ;
    private char grade;
    public Balu(String name,int age,char grade)
    {
        this.age=age;
        this.grade=grade;
        this.name=name;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 810;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("Null Value");
            if(obj instanceof Balu){
                Balu balu = this;
                Balu balu1 =(Balu) obj;
                if(balu.age== balu1.age&& balu.grade== balu1.grade&&balu.name==balu1.name){
                    System.out.println("Compare: "+(balu1==balu));
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
