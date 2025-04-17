package com.Xworkz.Internal;

public interface Pranav {
    void schoolRulls();

    void gameRulls();

    void examRulls();
    default void rules(){
        System.out.println("Rules of the rules");
    }
}
