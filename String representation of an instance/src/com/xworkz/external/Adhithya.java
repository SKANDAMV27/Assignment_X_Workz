package com.xworkz.external;

import com.xworkz.internal.Student;

public class Adhithya extends Student {
    private String name;
    private int age ;
    private char grade;
    public Adhithya(String name,int age,char grade)
    {
        this.age=age;
        this.grade=grade;
        this.name=name;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 100;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("NUll");
            if(obj instanceof Adhithya){
                System.out.println("Compare: ");
                Adhithya adhithya = this;
                Adhithya adhithya1 =(Adhithya) obj;
                if(adhithya.name==adhithya1.name && adhithya.grade==adhithya1.grade && adhithya.age==adhithya1.age){
                    System.out.println("Compare: "+(adhithya1==adhithya));
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
        return "Adhithya{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
