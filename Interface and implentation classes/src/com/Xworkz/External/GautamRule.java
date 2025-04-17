package com.Xworkz.External;

import com.Xworkz.Internal.Gautam;

public class GautamRule implements Gautam {
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

    @Override
    public void Rules() {
        System.out.println("Rules Called Gautam");
    }
}
