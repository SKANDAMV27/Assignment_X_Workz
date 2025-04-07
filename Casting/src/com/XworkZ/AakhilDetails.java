package com.XworkZ;

public class AakhilDetails {
    public void details(Aakhil aakhil)
    {
        aakhil.branch();
        aakhil.college();
        aakhil.USN();
        aakhil.year();
        aakhil.studentName();
        if(aakhil instanceof Person1)
        {
            Person1 person1 = (Person1) aakhil;
            person1.background();
        }
    }
}
