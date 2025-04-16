package com.Xworkz.Single_Level;

public class Rat extends Animal{
    public Rat(){
        super();
        System.out.println("Rat Constructor");
    }
    public void buit(){
        this.eat();
        System.out.println("Rat Buit");
    }
}
