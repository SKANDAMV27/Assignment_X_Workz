package com.Xworkz.External;

import com.Xworkz.Internal.Vibhav;

public class VibhavRule implements Vibhav {
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
    public void rules() {
        System.out.println("Rules of the Vibhav.");
    }
}
