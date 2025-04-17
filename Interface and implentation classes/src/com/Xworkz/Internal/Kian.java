package com.Xworkz.Internal;

public interface Kian {
    void schoolRulls();
    void gameRulls();
    void examRulls();
    default void Rules(){
        System.out.println("Rules of the Kian");
    }
}
