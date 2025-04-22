package com.xworkz.ani.external;

import com.xworkz.ani.internal.Education;

public class NAAC {
    Education icc;

    public NAAC(Education icc) {
        this.icc = icc;
    }

    public void execute() {
        System.out.println("Running the execute method of NAAC");
        if (icc != null) {
            icc.fairPlay();
        } else {
            System.out.println("icc is null, cannot execute");
        }
    }
}
