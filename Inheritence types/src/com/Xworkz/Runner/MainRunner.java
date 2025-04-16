package com.Xworkz.Runner;

import com.Xworkz.Multi_Level.calf;
import com.Xworkz.Single_Level.*;

public class MainRunner {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.buit();
        Cat cat = new Cat();
        cat.buit();
        Cow cow = new Cow();
        cow.buit();
        Mouse mouse = new Mouse();
        mouse.buit();
        Rat rat = new Rat();
        rat.buit();
        Camal camal = new Camal();
        camal.buit();
        Rabbit rabbit = new Rabbit();
        rabbit.buit();
        Lion lion = new Lion();
        lion.buit();
        Tiger tiger = new Tiger();
        tiger.buit();
        Horse horse = new Horse();
        horse.buit();

        System.out.println("");
        System.out.println("Multi Value Inheritence");
        System.out.println("");
        calf Calf = new calf();
        Calf.sleep();
    }
}
