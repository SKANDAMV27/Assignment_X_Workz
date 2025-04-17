package com.Xworkz.Internal;

public interface Traffic {
    void parkingRulls();
    void signalRulls();
    void drivingRulls();
    default void rules(){
        System.out.println("Driving Rules");
    }
}
