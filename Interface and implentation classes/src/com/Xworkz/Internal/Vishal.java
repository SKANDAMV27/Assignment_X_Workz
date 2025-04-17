package com.Xworkz.Internal;

public interface Vishal {
    void schoolRulls();
    void gameRulls();
    void examRulls();
    default void rules(){
        System.out.println("Rules of Vishal");
    }
}
