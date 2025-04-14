package com.xworkz.external;

import com.xworkz.internal.Student;

public class Bharathwaj extends Student {
    private String name;
    private int age ;
    private char grade;
    public Bharathwaj(String name,int age,char grade)
    {
        this.age=age;
        this.grade=grade;
        this.name=name;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 270;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("Null Value");
            if(obj instanceof Bharathwaj){
                Bharathwaj bharathwaj = this;
                Bharathwaj bharathwaj1 =(Bharathwaj) obj;
                if(bharathwaj.age== bharathwaj1.age&& bharathwaj.grade== bharathwaj1.grade&&bharathwaj.name==bharathwaj1.name){
                    System.out.println("Compare: "+(bharathwaj1==bharathwaj));
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
