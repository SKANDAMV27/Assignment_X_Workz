package com.Xworkz.Internal;

public interface Arav {
    void teacherRulls();
    void principalRulls();
    void presidentRulls();
    default void Rules(){
        System.out.println("Arav Rules");
    }
}
