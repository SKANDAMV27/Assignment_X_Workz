package com.xworkz.external;

import com.xworkz.internal.Student;

public class Kiran extends Student {
    private String name;
    private int age ;
    private char grade;
    public Kiran(String name,int age,char grade)
    {
        this.age=age;
        this.grade=grade;
        this.name=name;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 12363;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("Null Value");
            if(obj instanceof Kiran){
                Kiran kiran = this;
                Kiran kiran1 =(Kiran) obj;
                if(kiran.age== kiran1.age&& kiran.grade== kiran1.grade&&kiran.name==kiran1.name){
                    System.out.println("Compare: "+(kiran==kiran1));
                    return true;
                }
            }

        }
        return false;
    }
    @Override
    public String toString() {
        return "Kiran{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
