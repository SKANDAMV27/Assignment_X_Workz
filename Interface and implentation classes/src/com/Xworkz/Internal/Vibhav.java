package com.Xworkz.Internal;

public interface Vibhav {
    void schoolRulls();
    void gameRulls();
    void examRulls();
    default void rules(){
        System.out.println("Rules of the Vibhav");
    }
}
