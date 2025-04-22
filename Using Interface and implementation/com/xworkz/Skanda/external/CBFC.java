package com.xworkz.ani.external;

import com.xworkz.ani.internal.CinemaCensor;

public class CBFC {
    CinemaCensor icc;

    public CBFC(CinemaCensor icc) {
        this.icc = icc;
    }

    public void execute() {
        System.out.println("Running the execute method of CBFC");
        if (icc != null) {
            icc.fairPlay();
        } else {
            System.out.println("icc is null, cannot execute");
        }
    }
}
