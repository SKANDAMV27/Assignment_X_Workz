package com.Xworkz.Internal;

public interface Viraj {
    void schoolRulls();
    void gameRulls();
    void examRulls();
    default void rules(){
        System.out.println("Rules of Viraj.");
    }
}
