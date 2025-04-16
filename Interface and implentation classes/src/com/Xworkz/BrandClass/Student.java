package com.Xworkz.BrandClass;

import com.Xworkz.Internal.Buy;
import com.Xworkz.Internal.Sell;

public class Student implements Buy, Sell {
    @Override
    public void documentRull() {
        System.out.println("Document Rule: ");

    }

    @Override
    public void priceRull() {
        System.out.println("Price Rule");

    }

    @Override
    public void changeRull() {
        System.out.println("Change Rule: ");

    }
}
