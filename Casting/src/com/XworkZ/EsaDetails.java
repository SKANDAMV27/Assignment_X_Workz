package com.XworkZ;

public class EsaDetails {
    public void details(Esa esa)
    {
        esa.branch();
        esa.college();
        esa.USN();
        esa.year();
        esa.studentName();
        if(esa instanceof Person7)
        {
            Person7 person7 = (Person7) esa;
            person7.back();
        }
    }
}
