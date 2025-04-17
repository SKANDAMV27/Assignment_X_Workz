package com.Xworkz.Internal;

public interface Krishna {

    void schoolRulls();
    void gameRulls();
    void examRulls();
    default void rules(){
        System.out.println("Rules of the Krishna");
    }
}
