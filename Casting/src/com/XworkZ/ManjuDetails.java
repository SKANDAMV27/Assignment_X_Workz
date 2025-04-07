package com.XworkZ;

public class ManjuDetails {
    public void details(Manju manju)
    {
        manju.branch();
        manju.college();
        manju.USN();
        manju.year();
        manju.studentName();
        if(manju instanceof Person9)
        {
            Person9 person9 = (Person9) manju;
            person9.back();
        }
    }
}
