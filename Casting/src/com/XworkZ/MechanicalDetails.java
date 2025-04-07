package com.XworkZ;

public class MechanicalDetails {
    public void Details(Mechnical mechnical){
        mechnical.CR();
        mechnical.HOD();
        mechnical.location();
        mechnical.name();
        mechnical.subject();
        if(mechnical instanceof CoreBranch) {
            CoreBranch coreBranch = (CoreBranch) mechnical;
            coreBranch.admission();
        }
    }
}
