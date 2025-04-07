package com.XworkZ;

public class HomeDetails {
    public void details(Home home)
    {
        home.bathRoom();
        home.bedRoom();
        home.dinningHall();
        home.kitchen();
        home.hall();
        if(home instanceof Building)
        {
            Building building = (Building) home;
        }
    }
}
