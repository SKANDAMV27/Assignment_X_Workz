package com.Xworkz.Internal;

public interface Hotel {
    void iteamRulls();
    void billRulls();
    void orderRulls();
    default void rules(){
        System.out.println("Rules:");
    }
}
