package com.XworkZ;

public class EEEDetails {
    public void Details(EEE eee){
        eee.CR();
        eee.HOD();
        eee.location();
        eee.name();
        eee.subject();
        if(eee instanceof ElectricalBranch) {
            ElectricalBranch electricalBranch = (ElectricalBranch) eee;
            electricalBranch.admission();
        }
    }
}
