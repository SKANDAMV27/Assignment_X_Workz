package com.Xworkz.Internal;

public interface Aptha {
    void teacherRulls();
    void principalRulls();
    void presidentRulls();
    default void Rules(){
        System.out.println("Student Rules");
    }
}
