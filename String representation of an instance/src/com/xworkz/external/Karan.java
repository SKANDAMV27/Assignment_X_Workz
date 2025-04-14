package com.xworkz.external;

import com.xworkz.internal.Student;

public class Karan extends Student {
    private String name;
    private int age ;
    private char grade;
    public Karan(String name,int age,char grade)
    {
        this.age=age;
        this.grade=grade;
        this.name=name;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 2054;
    } @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("Null Value");
            if(obj instanceof Karan){
                Karan karan = this;
                Karan karan1 =(Karan) obj;
                if(karan.age== karan1.age&& karan.grade== karan1.grade&&karan.name==karan1.name){
                    System.out.println("Compare: "+(karan==karan1));
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
        return "Karan{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
