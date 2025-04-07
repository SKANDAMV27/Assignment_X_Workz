package com.XworkZ;

public class PantDetails {
    public void Details(Pant pant)
    {
        pant.color();
        pant.kid();
        pant.company();
        pant.price();
        pant.size();
        if(pant instanceof Cloths)
        {
            Cloths cloths =(Cloths) pant;
            cloths.Company();
        }
    }
}
