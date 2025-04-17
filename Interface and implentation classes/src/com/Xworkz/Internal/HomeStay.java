package com.Xworkz.Internal;

public interface HomeStay {
    void iteamRulls();
    void billRulls();
    void orderRulls();
    default void rules(){
        System.out.println("Rules Of Home Stay");
    }

}
