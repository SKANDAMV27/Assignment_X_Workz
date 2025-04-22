package com.xworkz.ani.external;

import com.xworkz.ani.internal.Commerce;

public class SEBI {
    Commerce icc;

    public SEBI(Commerce icc) {
        this.icc = icc;
    }

    public void execute() {
        System.out.println("Running the execute method of SEBI");
        if (icc != null) {
            icc.fairPlay();
        } else {
            System.out.println("icc is null, cannot execute");
        }
    }
}
