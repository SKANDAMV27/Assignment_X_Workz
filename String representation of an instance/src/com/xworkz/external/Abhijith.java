package com.xworkz.external;

import com.xworkz.internal.Student;

public class Abhijith extends Student {
    private String name;
    private int age ;
    private char grade;
    public Abhijith(String name,int age,char grade)
    {
        this.age=age;
        this.grade=grade;
        this.name=name;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 9;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("NUll");
            if(obj instanceof Abhijith){
                System.out.println("Compare: ");
                Abhijith abhijith = this;
                Abhijith abhijith1 =(Abhijith)  obj;
                if(abhijith.name==abhijith1.name && abhijith.grade==abhijith1.grade && abhijith.age==abhijith1.age){
                    System.out.println("Compare: "+(abhijith1==abhijith));
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
