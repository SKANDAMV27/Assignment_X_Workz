package com.Xworkz.Internal;

public interface Lodge {
    void amountRulls();
    void stayRulls();
    void admissionRulls();
    default void rules(){
        System.out.println("Rules of Lodge");
    }
}
