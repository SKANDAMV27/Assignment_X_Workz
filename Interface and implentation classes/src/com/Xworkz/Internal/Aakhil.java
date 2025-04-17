package com.Xworkz.Internal;

public interface Aakhil {

    void homeRulls();
    void schoolRulls();
    void collegeRulls();
    default void rules(){
        System.out.println("Student Rules");
    }

}
