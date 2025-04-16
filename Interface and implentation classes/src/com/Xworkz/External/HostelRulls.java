package com.Xworkz.External;

import com.Xworkz.Internal.Hostel;

public class HostelRulls implements Hostel {
    @Override
    public void fees() {
        System.out.println("Hostel Fees Rulls");
    }

    @Override
    public void food() {
        System.out.println("Hostel Food Rulls");

    }

    @Override
    public void admission() {
        System.out.println("Hostel Admission Rulls");

    }
}
