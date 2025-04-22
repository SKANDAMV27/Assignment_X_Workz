package com.xworkz.ani.external;

import com.xworkz.ani.internal.PovertyRelief;

public class NREGA {
    PovertyRelief icc;

    public NREGA(PovertyRelief icc) {
        this.icc = icc;
    }

    public void execute() {
        System.out.println("Running the execute method of NREGA");
        if (icc != null) {
            icc.fairPlay();
        } else {
            System.out.println("icc is null, cannot execute");
        }
    }
}
