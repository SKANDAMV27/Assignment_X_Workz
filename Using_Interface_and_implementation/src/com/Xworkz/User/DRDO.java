package com.xworkz.ani.external;

import com.xworkz.ani.internal.Defense;

public class DRDO {
    Defense icc;

    public DRDO(Defense icc) {
        this.icc = icc;
    }

    public void execute() {
        System.out.println("Running the execute method of DRDO");
        if (icc != null) {
            icc.fairPlay();
        } else {
            System.out.println("icc is null, cannot execute");
        }
    }
}
