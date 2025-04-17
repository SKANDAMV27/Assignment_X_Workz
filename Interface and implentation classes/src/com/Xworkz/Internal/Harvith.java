package com.Xworkz.Internal;

public interface Harvith {
    void schoolRulls();
    void gameRulls();
    void examRulls();
    default void rules()
    {
        System.out.println("Rules of Harvith");
    }
}
