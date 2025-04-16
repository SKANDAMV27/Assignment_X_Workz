package com.Xworkz.Multi_Level;

public class Cat extends Animal{
    public Cat(){
        super();
        System.out.println("Cat Constructor");
    }
    public void buit(){
        this.eat();
        System.out.println("Cat Buit");
    }
}
