package com.Xworkz.Internal;

public interface Room {
    void rentRull();
    void cleanRulls();
    void lockRulls();
    default void rules()
    {
        System.out.println("Rules of Room");
    }
}
