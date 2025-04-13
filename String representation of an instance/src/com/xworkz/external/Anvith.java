package com.xworkz.external;

import com.xworkz.internal.Student;

public class Anvith extends Student {
    private String name;
    private int age ;
    private char grade;
    public Anvith(String name,int age,char grade)
    {
        this.age=age;
        this.grade=grade;
        this.name=name;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 108;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("NUll");
            if(obj instanceof Anvith){
                System.out.println("Compare: ");
                Anvith anvith = this;
                Anvith anvith1 =(Anvith) obj;
                if(anvith.name==anvith1.name && anvith.grade==anvith1.grade && anvith.age==anvith1.age){
                    System.out.println("Compare: "+(anvith1==anvith));
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
