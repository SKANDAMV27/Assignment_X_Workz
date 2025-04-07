package com.XworkZ;

public class CharanDetails {
    public void details(Charan charan)
    {
        charan.branch();
        charan.college();
        charan.USN();
        charan.year();
        charan.studentName();
        if(charan instanceof Person4)
        {
            Person4 person4 = (Person4) charan;
            person4.back();
        }
    }
}
