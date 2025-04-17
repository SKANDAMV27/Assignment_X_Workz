package com.Xworkz.External;

import com.Xworkz.Internal.School;

public class schoolRulls implements School {
    @Override
    public void timeRulls() {
        System.out.println("Time Rulls");
    }

    @Override
    public void gameRulls() {
        System.out.println("Game Rulls");

    }

    @Override
    public void subRulls() {
        System.out.println("Subject Rulls.");

    }

    @Override
    public void rules() {
        System.out.println("Rules");
    }
}
