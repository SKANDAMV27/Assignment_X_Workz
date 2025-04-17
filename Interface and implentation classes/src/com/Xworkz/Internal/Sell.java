package com.Xworkz.Internal;

public interface Sell {
    void documentRull();
    void priceRull();
    void changeRull();
    default void rules(){
        System.out.println("Rules to Sell");
    }
}
