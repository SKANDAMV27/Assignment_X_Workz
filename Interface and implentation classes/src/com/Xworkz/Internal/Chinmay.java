package com.Xworkz.Internal;

public interface Chinmay {
    void schoolRulls();
    void gameRulls();
    void examRulls();
    default void ruls(){
        System.out.println("Student Rules");
    }
}
