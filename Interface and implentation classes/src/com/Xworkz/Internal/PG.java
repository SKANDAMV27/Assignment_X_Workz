package com.Xworkz.Internal;

public interface PG {
    void fees();
    void food();
    void admission();
    default void rules(){
        System.out.println("Rules Of Student");
    }
}
