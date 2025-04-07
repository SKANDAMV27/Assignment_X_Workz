package com.XworkZ;

public class SoilDetails {
    public void SoilDetails(Sand sand)
    {
        sand.area();
        sand.color();
        sand.quality();
        sand.type();
        sand.quantity();
        if(sand instanceof Soil)
        {
            Soil soil =(Soil) sand;
            soil.price();
        }
    }
}
