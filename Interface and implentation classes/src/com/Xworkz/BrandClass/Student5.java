package com.Xworkz.BrandClass;

import com.Xworkz.Internal.Hostel;
import com.Xworkz.Internal.PG;

public class Student5 implements PG, Hostel {
    @Override
    public void fees() {
        System.out.println("PG Fees Rulls");
    }

    @Override
    public void food() {
        System.out.println("PG Food Rulls");

    }

    @Override
    public void admission() {
        System.out.println("Pg Admission Rulls");

    }
}
