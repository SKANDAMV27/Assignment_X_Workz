package com.Xworkz.BrandClass;

import com.Xworkz.Internal.Gautam;
import com.Xworkz.Internal.Harsh;
import com.Xworkz.Internal.Harvith;

public class Student4 implements Gautam, Harsh, Harvith {
    @Override
    public void schoolRulls() {
        System.out.println("School Rulls for Student.");
    }

    @Override
    public void gameRulls() {
        System.out.println("Game Rulls For Student.");

    }

    @Override
    public void examRulls() {
        System.out.println("Exam Rulls for Student.");

    }

}
