package com.Xworkz.Internal;

public interface Viresh {
    void schoolRulls();
    void gameRulls();
    void examRulls();
    default void rules(){
        System.out.println("Rules of Viresh");
    }
}
