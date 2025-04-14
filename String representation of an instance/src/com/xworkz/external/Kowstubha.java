package com.xworkz.external;

import com.xworkz.internal.Student;

public class Kowstubha extends Student {
    private String name;
    private int age ;
    private char grade;
    public Kowstubha(String name,int age,char grade)
    {
        this.age=age;
        this.grade=grade;
        this.name=name;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 8420;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("Null Value");
            if(obj instanceof Kowstubha){
                Kowstubha kowstubha = this;
                Kowstubha kowstubha1 =(Kowstubha) obj;
                if(kowstubha.age== kowstubha1.age&& kowstubha.grade== kowstubha1.grade&&kowstubha.name==kowstubha1.name){
                    System.out.println("Compare: "+(kowstubha1==kowstubha));
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
        return "Kowstubha{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
