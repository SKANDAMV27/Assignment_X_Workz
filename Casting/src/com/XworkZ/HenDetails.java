package com.XworkZ;

public class HenDetails {
    public void details(Hen hen)
    {
        hen.Color();
        hen.Location();
        hen.gender();
        hen.number();
        hen.weight();
        if(hen instanceof Birds)
        {
            Birds birds = (Birds)hen;
            birds.price();
        }
    }
}
