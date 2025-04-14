package com.xworkz.external;

import com.xworkz.internal.Student;

public class Kishor extends Student {
    private String name;
    private int age ;
    private char grade;
    public Kishor(String name,int age,char grade)
    {
        this.age=age;
        this.grade=grade;
        this.name=name;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 9510;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("Null Value");
            if(obj instanceof Kishor){
                Kishor kishor = this;
                Kishor kishor1 =(Kishor) obj;
                if(kishor.age== kishor1.age&& kishor.grade== kishor1.grade&&kishor.name==kishor1.name){
                    System.out.println("Compare: "+(kishor==kishor1));
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
        return "Kishor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
