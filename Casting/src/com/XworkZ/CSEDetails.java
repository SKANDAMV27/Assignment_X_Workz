package com.XworkZ;

public class CSEDetails {
    public void Details(CSE cse)
    {
        cse.CR();
        cse.HOD();
        cse.location();
        cse.name();
        cse.subject();
        if(cse instanceof MainBranch){
            MainBranch mainBranch = (MainBranch)cse;
            mainBranch.admission();
        }
    }
}
