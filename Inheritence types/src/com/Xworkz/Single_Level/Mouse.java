package com.Xworkz.Single_Level;

public class Mouse extends Animal{
    public Mouse(){
        super();
        System.out.println("Mouse Constructor");
    }
    public void buit(){
        this.eat();
        System.out.println("Mouse Buit");
    }
}
