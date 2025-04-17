package com.Xworkz.External;

import com.Xworkz.Internal.Lodge;

public class LodgeRulls implements Lodge {
    @Override
    public void amountRulls() {
        System.out.println("Lodge Amount Rulls");
    }

    @Override
    public void stayRulls() {
        System.out.println("Lodge Stay Rulls");
    }

    @Override
    public void admissionRulls() {
        System.out.println("Lodge Admission Rulls");
    }

    @Override
    public void rules() {
        System.out.println("Rules");
    }
}
