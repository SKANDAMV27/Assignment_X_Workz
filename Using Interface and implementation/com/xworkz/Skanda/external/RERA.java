package com.xworkz.ani.external;

import com.xworkz.ani.internal.Housing;

public class RERA {
    Housing icc;

    public RERA(Housing icc) {
        this.icc = icc;
    }

    public void execute() {
        System.out.println("Running the execute method of RERA");
        if (icc != null) {
            icc.fairPlay();
        } else {
            System.out.println("icc is null, cannot execute");
        }
    }
}
