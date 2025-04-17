package com.Xworkz.Internal;

public interface Reyansh {
    void schoolRulls();
    void gameRulls();
    void examRulls();
    default void rules(){
        System.out.println("Reyansh Rules;");
    }
}
