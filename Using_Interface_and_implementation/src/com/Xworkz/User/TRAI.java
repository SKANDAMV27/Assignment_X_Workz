package com.xworkz.ani.external;

import com.xworkz.ani.internal.Telecom;

public class TRAI {
    Telecom icc;

    public TRAI(Telecom icc) {
        this.icc = icc;
    }

    public void execute() {
        System.out.println("Running the execute method of TRAI");
        if (icc != null) {
            icc.fairPlay();
        } else {
            System.out.println("icc is null, cannot execute");
        }
    }
}
