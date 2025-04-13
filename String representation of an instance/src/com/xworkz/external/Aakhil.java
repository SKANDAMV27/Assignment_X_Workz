package com.xworkz.external;

import com.xworkz.internal.Student;

public class Aakhil extends Student {
    private String name;
    private int age ;
    private char grade;
    public Aakhil(String name,int age,char grade)
    {
        this.age=age;
        this.grade=grade;
        this.name=name;

    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 87;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("NUll");
            if(obj instanceof Aakhil){
                System.out.println("Compare: ");
                Aakhil aakhil = this;
                Aakhil aakhil1 =(Aakhil) obj;
                if(aakhil.name==aakhil1.name && aakhil.grade==aakhil1.grade && aakhil.age==aakhil1.age){
                    System.out.println("Compare: "+(aakhil1==aakhil));
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
