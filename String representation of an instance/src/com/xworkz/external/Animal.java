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
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 80;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            System.out.println("Null");
            if(obj instanceof Animal){
                Animal animal = this;
                Animal animal1 = (Animal) obj;
                if(animal1.name==animal.name && animal1.weight==animal.weight && animal1.avaliable==animal.avaliable){
                    System.out.println("Compare :"+(animal1==animal));
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

    public String getAvaliable() {
        return avaliable;
    }

    public void setAvaliable(String avaliable) {
        this.avaliable = avaliable;
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
