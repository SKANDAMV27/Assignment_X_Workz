package com.xworkz.ani.external;

import com.xworkz.ani.internal.FireSafety;

public class FireDept {
    FireSafety icc;

    public FireDept(FireSafety icc) {
        this.icc = icc;
    }

    public void execute() {
        System.out.println("Running the execute method of FireDept");
        if (icc != null) {
            icc.fairPlay();
        } else {
            System.out.println("icc is null, cannot execute");
        }
    }
}
