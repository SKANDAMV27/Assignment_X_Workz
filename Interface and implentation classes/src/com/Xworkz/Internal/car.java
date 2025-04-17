package com.Xworkz.Internal;

public interface car {
    void drivingRulls();
    void speedRulls();
    void rulls();
    default void carRules(){
        System.out.println("Rules of Car");
    }
}
