package com.Xworkz.External;

import com.Xworkz.Internal.Sell;

public class SellRull implements Sell {
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
}
