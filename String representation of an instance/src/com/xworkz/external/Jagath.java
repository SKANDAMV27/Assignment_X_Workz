package com.xworkz.external;

import com.xworkz.internal.Student;

public class Jagath extends Student {
    private String name;
    private int age ;
    private char grade;
    public Jagath(String name,int age,char grade)
    {
        this.age=age;
        this.grade=grade;
        this.name=name;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 8696;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("Null:");
            if(obj instanceof Jagath){
                Jagath jagath =this;
                Jagath jagath1 = (Jagath) obj;
                if(jagath1.age==jagath.age && jagath.name==jagath1.name && jagath.grade==jagath1.grade){
                    System.out.println("Compare: "+(jagath1==jagath));
                    return true;
                }
            }
        }
        return false;
    }
    public String getName(){
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public char getGrade()
    {
        return grade;
    }
    public void setGrade(char grade){
        this.grade=grade;
    }


    @Override
    public String toString() {
        return "Jagath{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
