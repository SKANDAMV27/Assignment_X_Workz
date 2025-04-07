package com.XworkZ;

public class MaruthiDetails {
    public void details(Maruthi maruthi)
    {
        maruthi.branch();
        maruthi.college();
        maruthi.USN();
        maruthi.year();
        maruthi.studentName();
        if(maruthi instanceof Person8)
        {
            Person8 person8 = (Person8) maruthi;
            person8.back();
        }
    }
}
