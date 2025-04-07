package com.XworkZ;

public class ISEDeatails {
    public void details(ISE ise)
    {
        ise.CR();
        ise.HOD();
        ise.location();
        ise.name();
        ise.subject();
        if(ise instanceof Branch)
        {
            Branch branch =(Branch) ise;
            branch.admission();
        }
    }
}
