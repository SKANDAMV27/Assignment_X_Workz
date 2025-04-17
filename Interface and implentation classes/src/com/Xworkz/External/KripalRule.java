package com.Xworkz.External;

import com.Xworkz.Internal.Kripal;

public class KripalRule implements Kripal {
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
    public void Rulls() {
        System.out.println("Rulls of the Kripal");
    }
}
