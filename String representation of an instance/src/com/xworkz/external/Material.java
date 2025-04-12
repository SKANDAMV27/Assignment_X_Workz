package com.xworkz.external;

import com.xworkz.internal.Iron;

public class Material extends Iron {
    private String name;
    private int weight;
    private char grade;
    public Material(String name,int weight,char grade)
    {
        this.grade=grade;
        this.name=name;
        this.grade=grade;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 154236;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            System.out.println("Null");
            if(obj instanceof Material){
                Material material = this;
                Material material1 = (Material) obj;
                if(material1.name==material.name && material1.weight==material.weight && material.grade==material1.grade){
                    System.out.println("Compare :"+(material1==material));
                    return false;
                }
            }

        }
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Material{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", grade=" + grade +
                '}';
    }
}
