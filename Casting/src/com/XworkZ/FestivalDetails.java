package com.XworkZ;

public class FestivalDetails {
    public void Details(Festival festival)
    {
        festival.diwali();
        festival.ganeshaChathurthi();
        festival.Holi();
        festival.ramzan();
        festival.ugadi();
        if(festival instanceof Carnival)
        {
            Carnival carnival =(Carnival) festival;
            carnival.date();
        }
    }
}
