package com.Xworkz.Single_Level;

public class Lion extends Animal{
    public  Lion(){
        super();
        System.out.println("Lion Constructor");
    }
    public void buit(){
        this.eat();
        System.out.println("Lion Buit");
    }
}
