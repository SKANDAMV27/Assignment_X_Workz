package com.xworkz.ani.external;

import com.xworkz.ani.internal.CivicBody;

public class BBMP {
    CivicBody icc;

    public BBMP(CivicBody icc) {
        this.icc = icc;
    }

    public void execute() {
        System.out.println("Running the execute method of BBMP");
        if (icc != null) {
            icc.fairPlay();
        } else {
            System.out.println("icc is null, cannot execute");
        }
    }
}
