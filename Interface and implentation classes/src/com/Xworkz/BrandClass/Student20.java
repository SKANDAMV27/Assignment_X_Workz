package com.Xworkz.BrandClass;

import com.Xworkz.Internal.Hostel;
import com.Xworkz.Internal.PG;

public class Student20 implements PG, Hostel {
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

    @Override
    public void rules() {
        System.out.println("Rules is the Rules");
    }
}
