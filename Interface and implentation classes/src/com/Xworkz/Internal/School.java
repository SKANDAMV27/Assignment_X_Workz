package com.Xworkz.Internal;

public interface School {
    void timeRulls();
    void gameRulls();
    void subRulls();
    default void rules(){
        System.out.println("Rules");
    }
}
