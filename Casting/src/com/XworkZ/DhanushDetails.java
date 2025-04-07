package com.XworkZ;

public class DhanushDetails {
    public void details(DharshanG dharshanG)
    {
        dharshanG.branch();
        dharshanG.college();
        dharshanG.USN();
        dharshanG.year();
        dharshanG.studentName();
        if(dharshanG instanceof Person5)
        {
            Person5 person5 = (Person5) dharshanG;
            person5.back();
        }
    }
}
