package com.XworkZ;

public class CowDetails {
    public void detail(Cow cow)
    {
        cow.cowColour();
        cow.cowBread();
        cow.cowName();
        cow.cowPrice();
        cow.cowSize();
        if(cow instanceof Animal)
        {
            Animal animal =(Animal) cow;
            animal.weight();

        }
    }
}
