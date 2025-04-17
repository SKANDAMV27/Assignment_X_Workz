package com.Xworkz.Internal;

public interface Vivaan {
    void schoolRulls();
    void gameRulls();
    void examRulls();
    default void rules(){
        System.out.println("Rules of Vivaan");
    }
}
