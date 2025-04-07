package com.XworkZ;

public class DharshanGDetail {
    public void details(Dhanush dhanush)
    {
        dhanush.branch();
        dhanush.college();
        dhanush.USN();
        dhanush.year();
        dhanush.studentName();
        if(dhanush instanceof Person6)
        {
            Person6 person6 = (Person6) dhanush;
            person6.back();
        }
    }
}
