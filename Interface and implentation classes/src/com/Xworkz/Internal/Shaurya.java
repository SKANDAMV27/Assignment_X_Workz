package com.Xworkz.Internal;

public interface Shaurya {
    void schoolRulls();
    void gameRulls();
    void examRulls();
    default void rules(){
        System.out.println("No Rules Shaurya");
    }
}
