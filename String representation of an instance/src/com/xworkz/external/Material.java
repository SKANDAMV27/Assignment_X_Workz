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
    public String toString() {
        return "Material{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", grade=" + grade +
                '}';
    }
}
