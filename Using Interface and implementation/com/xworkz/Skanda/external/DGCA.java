package com.xworkz.ani.external;

import com.xworkz.ani.internal.Aviation;

public class DGCA {
    Aviation icc;

    public DGCA(Aviation icc) {
        this.icc = icc;
    }

    public void execute() {
        System.out.println("Running the execute method of DGCA");
        if (icc != null) {
            icc.fairPlay();
        } else {
            System.out.println("icc is null, cannot execute");
        }
    }
}
