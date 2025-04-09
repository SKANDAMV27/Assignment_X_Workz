package com.xworkz.external;

import com.xworkz.internal.Dog;

public class Animal extends Dog {
    private String name;
    private int weight;
    private String avaliable;

    public Animal(String name,int weight,String avaliable){
        this.avaliable=avaliable;
        this.name=name;
        this.weight=weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", avaliable='" + avaliable + '\'' +
                '}';
    }
}
