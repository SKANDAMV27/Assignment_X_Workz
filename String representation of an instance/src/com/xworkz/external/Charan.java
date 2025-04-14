package com.xworkz.external;

import com.xworkz.internal.Student;

public class Charan extends Student {
    private String name;
    private int age ;
    private char grade;
    public Charan(String name,int age,char grade)
    {
        this.age=age;
        this.grade=grade;
        this.name=name;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 890;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("Null Value");
            if(obj instanceof Charan){
                Charan charan = this;
                Charan charan1 =(Charan) obj;
                if(charan.age== charan1.age&& charan.grade== charan1.grade&&charan.name==charan1.name){
                    System.out.println("Compare: "+(charan1==charan));
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
