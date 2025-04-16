package com.Xworkz.Single_Level;

public class Dog extends Animal{
    public Dog(){
        super();
        System.out.println("Dog Constructor");
    }
    public void buit(){
        this.eat();
        System.out.println("Dog Buit");
    }
}
