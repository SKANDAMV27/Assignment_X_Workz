package com.xworkz.external;

import com.xworkz.internal.Student;

public class Anvitha extends Student {
    private String name;
    private int age ;
    private char grade;
    public Anvitha(String name,int age,char grade)
    {
        this.age=age;
        this.grade=grade;
        this.name=name;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 801;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("NUll");
            if(obj instanceof Anvitha){
                System.out.println("Compare: ");
                Anvitha anvitha = this;
                Anvitha anvitha1 =(Anvitha) obj;
                if(anvitha.name==anvitha1.name && anvitha.grade==anvitha1.grade && anvitha.age==anvitha1.age){
                    System.out.println("Compare: "+(anvitha1==anvitha));
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

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public int getAge() {
        return age;
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
