package com.Xworkz.Internal;

public interface Pranay {
    void schoolRulls();
    void gameRulls();
    void examRulls();
    default void rules(){
        System.out.println("Rules Pranay of the Things");
    }
}
