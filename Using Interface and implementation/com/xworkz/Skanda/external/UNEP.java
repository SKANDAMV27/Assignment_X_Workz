package com.xworkz.ani.external;

import com.xworkz.ani.internal.Environmental;

public class UNEP {
    Environmental icc;

    public UNEP(Environmental icc) {
        this.icc = icc;
    }

    public void execute() {
        System.out.println("Running the execute method of UNEP");
        if (icc != null) {
            icc.fairPlay();
        } else {
            System.out.println("icc is null, cannot execute");
        }
    }
}
