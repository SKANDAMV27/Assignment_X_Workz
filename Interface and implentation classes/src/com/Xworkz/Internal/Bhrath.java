package com.Xworkz.Internal;

public interface Bhrath {
    void schoolRulls();
    void gameRulls();
    void examRulls();
    default void rules(){
        System.out.println("Student Rules");
    }
}
