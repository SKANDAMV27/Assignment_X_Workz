package com.Xworkz.Internal;

public interface Manan {
    void schoolRulls();
    void gameRulls();
    void examRulls();
    default void rules(){
        System.out.println("Rules of Manan");
    }
}
