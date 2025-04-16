package com.Xworkz.BrandClass;

import com.Xworkz.Internal.Tarun;
import com.Xworkz.Internal.Tejas;

public class Student12 implements Tarun, Tejas {
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

