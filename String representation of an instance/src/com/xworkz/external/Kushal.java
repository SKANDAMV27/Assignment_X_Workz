package com.xworkz.external;

import com.xworkz.internal.Student;

public class Kushal extends Student {
    private String name;
    private int age ;
    private char grade;
    public Kushal(String name,int age,char grade)
    {
        this.age=age;
        this.grade=grade;
        this.name=name;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 84741;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("Null Value");
            if(obj instanceof Kushal){
                Kushal kushal = this;
                Kushal kushal1 =(Kushal) obj;
                if(kushal.age== kushal1.age&& kushal.grade== kushal1.grade&&kushal.name==kushal1.name){
                    System.out.println("Compare: "+(kushal1==kushal));
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
        return "Kushal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
