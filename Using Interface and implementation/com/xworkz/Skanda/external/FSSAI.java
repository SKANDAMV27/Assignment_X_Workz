package com.xworkz.ani.external;

import com.xworkz.ani.internal.FoodSafety;

public class FSSAI {
    FoodSafety icc;

    public FSSAI(FoodSafety icc) {
        this.icc = icc;
    }

    public void execute() {
        System.out.println("Running the execute method of FSSAI");
        if (icc != null) {
            icc.fairPlay();
        } else {
            System.out.println("icc is null, cannot execute");
        }
    }
}
