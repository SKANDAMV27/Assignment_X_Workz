package com.XworkZ;

public class ArunDetails {
    public void details(Arun arun)
    {
        arun.branch();
        arun.college();
        arun.USN();
        arun.year();
        arun.studentName();
        if(arun instanceof Person2)
        {
            Person2 person2 = (Person2) arun;
            person2.back();
        }
    }
}
