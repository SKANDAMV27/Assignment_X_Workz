package com.Xworkz.External;

import com.Xworkz.Internal.Aptha;

public class ApthaRulls implements Aptha {
    @Override
    public void presidentRulls() {
        System.out.println("President Rulls: ");
    }

    @Override
    public void principalRulls() {
        System.out.println("Principal Rulls.");
    }

    @Override
    public void teacherRulls() {
        System.out.println("Teacher Rulls.");
    }
}
