package com.Xworkz.Internal;

public interface Arun {
    void schoolRulls();
    void gameRulls();
    void examRulls();
    default void Rules(){
        System.out.println("Student Rules");
    }
}
