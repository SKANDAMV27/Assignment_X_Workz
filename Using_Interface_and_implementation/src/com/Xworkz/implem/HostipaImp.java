package com.Xworkz.implem;

import com.Xworkz.Internal.Hospital;

public class HostipaImp implements Hospital {
    public HostipaImp(){
        System.out.println("No arhs Hostpital Constructor");
    }
    @Override
    public void medican() {
        System.out.println("Runner Medican");
    }
}
