package com.Xworkz.Internal;

public interface Krishiv {
    void schoolRulls();
    void gameRulls();
    void examRulls();
    default void rules(){
        System.out.println("Rules of the Krishiv");
    }
}
