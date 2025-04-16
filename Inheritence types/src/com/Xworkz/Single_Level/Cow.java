package com.Xworkz.Single_Level;

public class Cow extends Animal{
    public Cow(){
        super();
        System.out.println("Cow Constructor");
    }
    public void buit(){
        this.eat();
        System.out.println("Cow Buit");
    }
}
