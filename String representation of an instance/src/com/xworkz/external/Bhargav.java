package com.xworkz.external;

import com.xworkz.internal.Student;

public class Bhargav extends Student {
    private String name;
    private int age ;
    private char grade;
    public Bhargav(String name,int age,char grade)
    {
        this.age=age;
        this.grade=grade;
        this.name=name;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 306;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("Null Value");
            if(obj instanceof Bhargav){
                Bhargav bhargav = this;
                Bhargav bhargav1 =(Bhargav) obj;
                if(bhargav1.age== bhargav.age&& bhargav1.grade== bhargav.grade&&bhargav1.name==bhargav.name){
                    System.out.println("Compare: "+(bhargav1==bhargav));
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
