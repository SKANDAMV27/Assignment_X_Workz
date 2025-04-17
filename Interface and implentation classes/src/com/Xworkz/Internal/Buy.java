package com.Xworkz.Internal;

public interface Buy {
    void documentRull();
    void priceRull();
    void changeRull();
    default void rule(){
        System.out.println("Rule of Buy");
    }
}
