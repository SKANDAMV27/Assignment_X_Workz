package com.XworkZ;

public class BrandDetails {
    public void Details(Brand brand)
    {
        brand.BP();
        brand.Beer();
        brand.MC();
        brand.OMR();
        brand.RS();
        if(brand instanceof Counter)
        {
            Counter counter = (Counter) brand;
            counter.linces();
        }
    }
}
