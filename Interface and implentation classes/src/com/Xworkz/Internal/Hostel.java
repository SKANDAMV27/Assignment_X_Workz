package com.Xworkz.Internal;

public interface Hostel {
    void fees();
    void food();
    void admission();
    default void rules(){
        System.out.println("Rules Student");
    }
}
