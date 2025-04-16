package com.Xworkz.External;

import com.Xworkz.Internal.Student1;

public class Student1Rulls implements Student1 {
    @Override
    public void schoolRulls() {
        System.out.println("Student1 School Rulls");
    }

    @Override
    public void gameRulls() {
        System.out.println("Student1 Game Rulls");
    }

    @Override
    public void examRulls() {
        System.out.println("Student1 Exam Rulls");
    }
}
