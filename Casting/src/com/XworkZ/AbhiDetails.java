package com.XworkZ;

public class AbhiDetails {
    public void details(Abhi abhi)
    {
        abhi.branch();
        abhi.college();
        abhi.USN();
        abhi.year();
        abhi.studentName();
        if(abhi instanceof Person)
        {
            Person person = (Person) abhi;
            person.back();
        }
    }
}
