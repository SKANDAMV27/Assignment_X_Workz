package com.XworkZ;

public class SkandaMVDetails {
    public void details(Skanda skanda)
    {
        skanda.branch();
        skanda.college();
        skanda.USN();
        skanda.year();
        skanda.studentName();
        if(skanda instanceof Person10)
        {
            Person10 person10 = (Person10) skanda;
            person10.back();
        }
    }
}
