package com.XworkZ;

public class PravithDetails {
    public void details(Pravith pravith)
    {
        pravith.branch();
        pravith.college();
        pravith.USN();
        pravith.year();
        pravith.studentName();
        if(pravith instanceof Person14)
        {
            Person14 person14 = (Person14)pravith;
            person14.back();
        }
    }
}
