package com.xworkz.external;

import com.xworkz.internal.Student;

public class Aniketh extends Student {
    private String name;
    private int age ;
    private char grade;
    public Aniketh(String name,int age,char grade)
    {
        this.age=age;
        this.grade=grade;
        this.name=name;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 90;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("NUll");
            if(obj instanceof Aniketh){
                System.out.println("Compare: ");
                Aniketh aniketh = this;
                Aniketh aniketh1 =(Aniketh) obj;
                if(aniketh.name==aniketh1.name && aniketh.grade==aniketh1.grade && aniketh.age==aniketh1.age){
                    System.out.println("Compare: "+(aniketh1==aniketh));
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
