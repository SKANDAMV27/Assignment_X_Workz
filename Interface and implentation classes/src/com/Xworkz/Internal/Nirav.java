package com.Xworkz.Internal;

public interface Nirav {
    void schoolRulls();
    void gameRulls();
    void examRulls();
    default void rules(){
        System.out.println("Nirav Rules");
    }
}
