package com.XworkZ;

public class HostelDetails {
    public void Details(Hostel hostel)
    {
        hostel.Fees();
        hostel.Food();
        hostel.location();
        hostel.sharing();
        hostel.students();
        if(hostel instanceof PG)
        {
            PG pg =(PG)hostel;
            pg.Fees();
        }
    }
}
