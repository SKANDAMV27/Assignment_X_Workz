package com.Xworkz.Internal;

public interface Raghav {
    void schoolRulls();
    void gameRulls();
    void examRulls();
    default void rules(){
        System.out.println("Rules of Raghav");
    }

}
