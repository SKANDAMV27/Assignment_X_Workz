package com.xworkz.external;

import com.xworkz.internal.Student;

public class Bhargavi extends Student {
    private String name;
    private int age ;
    private char grade;
    public Bhargavi(String name,int age,char grade)
    {
        this.age=age;
        this.grade=grade;
        this.name=name;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 784;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("Null Value");
            if(obj instanceof Bhargavi){
                Bhargavi bhargavi = this;
                Bhargavi bhargavi1 =(Bhargavi) obj;
                if(bhargavi1.age== bhargavi.age&& bhargavi1.grade== bhargavi.grade&&bhargavi1.name==bhargavi.name){
                    System.out.println("Compare: "+(bhargavi==bhargavi1));
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
