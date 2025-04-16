package com.Xworkz.Single_Level;

public class Rabbit extends Animal{
    public Rabbit(){
        super();
        System.out.println("Rabbit Constructor");
    }
    public void buit(){
        this.eat();
        System.out.println("Rabbit Buit");
    }
}
