package com.Xworkz.User;

import com.Xworkz.Internal.Hospital;

public class HospitalUser {
    public Hospital hospital;
    public HospitalUser(Hospital hospital){
        this.hospital=hospital;
        System.out.println("No args Hospital User Constructor");
    }
    public void doctor(){
        if(this.hospital!=null){
            this.hospital.medican();
            System.out.println("Doctor Runner");
        }
        else {
            System.out.println("Null Value");
        }
    }
}
