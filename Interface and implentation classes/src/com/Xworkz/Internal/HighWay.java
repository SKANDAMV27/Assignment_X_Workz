package com.Xworkz.Internal;

public interface HighWay {
    void speedRulls();
    void drivingRulls();
    void symbolRulls();
    default void rule(){
        System.out.println("HighWay Rules");
    }
}
