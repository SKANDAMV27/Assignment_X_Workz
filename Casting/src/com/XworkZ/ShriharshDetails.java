package com.XworkZ;

public class ShriharshDetails {
    public void details(Shriharsha shriharsha)
    {
        shriharsha.branch();
        shriharsha.college();
        shriharsha.USN();
        shriharsha.year();
        shriharsha.studentName();
        if(shriharsha instanceof Person12)
        {
            Person12 person12 = (Person12) shriharsha;
            person12.back();
        }
    }
}
