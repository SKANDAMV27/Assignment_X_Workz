package com.Xworkz.Internal;

public interface Arjun {
    void schoolRulls();
    void gameRulls();
    void examRulls();
    default void rules(){
        System.out.println("Rules of Arjun");
    }
}
