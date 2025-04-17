package com.Xworkz.Internal;

public interface Appi {
    void teacherRulls();
    void principalRulls();
    void presidentRulls();
    default void rules(){
        System.out.println("Student Rules");
    }
}
