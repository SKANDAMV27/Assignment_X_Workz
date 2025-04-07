package com.XworkZ;

public class SuhasDetails {
    public void details(Suhas suhas)
    {
        suhas.branch();
        suhas.college();
        suhas.USN();
        suhas.year();
        suhas.studentName();
        if(suhas instanceof Person13)
        {
            Person13 person13 = (Person13) suhas;
            person13.back();
        }
    }
}
