package com.Xworkz.Internal;

public interface Abhi {
    void schoolRulls();
    void gameRulls();
    void examRulls();
    default void rules(){
        System.out.println("Abhi Rules");
    }
}
