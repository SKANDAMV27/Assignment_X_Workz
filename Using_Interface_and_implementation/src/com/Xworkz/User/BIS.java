package com.xworkz.ani.external;

import com.xworkz.ani.internal.Standards;

public class BIS {
    Standards icc;

    public BIS(Standards icc) {
        this.icc = icc;
    }

    public void execute() {
        System.out.println("Running the execute method of BIS");
        if (icc != null) {
            icc.fairPlay();
        } else {
            System.out.println("icc is null, cannot execute");
        }
    }
}
