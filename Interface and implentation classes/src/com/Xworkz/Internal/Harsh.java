package com.Xworkz.Internal;

public interface Harsh {

    void schoolRulls();

    void gameRulls();

    void examRulls();
    default void Rules(){
        System.out.println("Rules of Harsh");
    }
}
