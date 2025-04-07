package com.XworkZ;

public class AppleDetails {
    public void Details(Apple apple)
    {
        apple.kg();
        apple.colour();
        apple.price();
        apple.Size();
        apple.type();
        if(apple instanceof Fruit)
        {
            Fruit fruit = new Fruit();
            fruit.model();
        }
    }
}
