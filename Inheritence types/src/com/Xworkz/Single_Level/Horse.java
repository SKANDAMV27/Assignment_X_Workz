package com.Xworkz.Single_Level;

public class Horse extends Animal{
    public Horse(){
        super();
        System.out.println("Horse Constructor");
    }
    public void buit(){
        this.eat();
        System.out.println("Horse Buit");
    }
}
