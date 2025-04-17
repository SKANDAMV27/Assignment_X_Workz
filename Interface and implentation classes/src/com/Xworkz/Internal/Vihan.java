package com.Xworkz.Internal;

public interface Vihan {
    void teacherRulls();
    void principalRulls();
    void presidentRulls();
    default void Rules(){
        System.out.println("Vihan Rules");
    }
}
