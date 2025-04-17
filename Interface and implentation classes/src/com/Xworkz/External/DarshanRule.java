package com.Xworkz.External;

import com.Xworkz.Internal.Darshan;

public class DarshanRule implements Darshan {
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
        System.out.println("Rules of the Things");
    }
}
