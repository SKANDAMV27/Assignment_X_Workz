package com.XworkZ;

public class BharathDetails {
    public void details(Bharath bharath)
    {
        bharath.branch();
        bharath.college();
        bharath.USN();
        bharath.year();
        bharath.studentName();
        if(bharath instanceof Person3)
        {
            Person3 person3 = (Person3) bharath;
            person3.back();
        }
    }
}
