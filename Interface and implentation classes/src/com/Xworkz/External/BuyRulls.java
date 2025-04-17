package com.Xworkz.External;

import com.Xworkz.Internal.Buy;

public class BuyRulls implements Buy {
    @Override
    public void documentRull() {
        System.out.println("Buy Document Rulls");
    }

    @Override
    public void priceRull() {
        System.out.println("Price Rulls");
    }

    @Override
    public void changeRull() {
        System.out.println("Change Rulls");
    }

    @Override
    public void rule() {
        System.out.println("Rule");
    }
}
