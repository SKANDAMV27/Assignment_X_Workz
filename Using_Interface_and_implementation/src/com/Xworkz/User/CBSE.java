package com.xworkz.ani.external;

import com.xworkz.ani.internal.Education;

public class CBSE {
    Education icc;

    public CBSE(Education icc) {
        this.icc = icc;
    }

    public void execute() {
        System.out.println("Running the execute method of CBSE");
        if (icc != null) {
            icc.fairPlay();
        } else {
            System.out.println("icc is null, cannot execute");
        }
    }
}
