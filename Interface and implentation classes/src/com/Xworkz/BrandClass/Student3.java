package com.Xworkz.BrandClass;

import com.Xworkz.Internal.School;
import com.Xworkz.Internal.Sell;

public class Student3 implements Sell, School {
    @Override
    public void documentRull() {
        System.out.println("Documents Rulls");
    }

    @Override
    public void priceRull() {
        System.out.println("Price Rulls");

    }

    @Override
    public void changeRull() {
        System.out.println("Documents change Rulls");

    }

    @Override
    public void rules() {
        System.out.println("Rule is Rule");
    }

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
}
