package com.xworkz.external;

import com.xworkz.internal.Student;

public class Bhavanth extends Student {
    private String name;
    private int age ;
    private char grade;
    public Bhavanth(String name,int age,char grade)
    {
        this.age=age;
        this.grade=grade;
        this.name=name;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 909;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("Null Value");
            if(obj instanceof Bhavanth){
                Bhavanth bhavanth = this;
                Bhavanth bhavanth1 =(Bhavanth) obj;
                if(bhavanth.age== bhavanth1.age&& bhavanth.grade== bhavanth1.grade&&bhavanth.name==bhavanth1.name){
                    System.out.println("Compare: "+(bhavanth1==bhavanth));
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
