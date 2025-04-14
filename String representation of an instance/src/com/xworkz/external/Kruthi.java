package com.xworkz.external;

import com.xworkz.internal.Student;

public class Kruthi extends Student {
    private String name;
    private int age;
    private char grade;
    public Kruthi(String name,int age,char grade)
    {
        this.age=age;
        this.name=name;
        this.grade=grade;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 1814;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("Null Value");
            if(obj instanceof Kruthi){
                Kruthi kruthi = this;
                Kruthi kruthi1 =(Kruthi) obj;
                if(kruthi.age== kruthi1.age&& kruthi.grade== kruthi1.grade&&kruthi.name==kruthi1.name){
                    System.out.println("Compare: "+(kruthi1==kruthi));
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
        return "Kruthi{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
