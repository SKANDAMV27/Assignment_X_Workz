package com.XworkZ;

public class PlaceDetails {
    public void Details(Place place)
    {
        place.area();
        place.nearPlace();
        place.distance();
        place.nature();
        place.location();
        if(place instanceof Shivamogga)
        {
            Shivamogga shivamogga =(Shivamogga) place;
            shivamogga.buaty();
        }
    }
}
