package com.xworkz.external;

import com.xworkz.internal.Student;

public class Adash extends Student {
    private String name;
    private int age ;
    private char grade;
    public Adash(String name,int age,char grade)
    {
        this.age=age;
        this.grade=grade;
        this.name=name;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 5;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("NUll");
            if(obj instanceof Adash){
                System.out.println("Compare: ");
                Adash adash = this;
                Adash adash1 =(Adash) obj;
                if(adash.name==adash1.name && adash.grade==adash1.grade && adash.age==adash1.age){
                    System.out.println("Compare: "+(adash1==adash));
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

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public void setAge(int age) {
        this.age = age;
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
