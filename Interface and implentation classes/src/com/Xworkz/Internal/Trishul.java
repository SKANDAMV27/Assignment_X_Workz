package com.Xworkz.Internal;

public interface Trishul {
    void schoolRulls();
    void gameRulls();
    void examRulls();
    default void rules(){
        System.out.println("Trishul Rules");
    }
}
