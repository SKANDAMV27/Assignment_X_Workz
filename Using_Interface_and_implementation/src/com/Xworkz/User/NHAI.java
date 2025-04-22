package com.xworkz.ani.external;

import com.xworkz.ani.internal.TrafficInfra;

public class NHAI {
    TrafficInfra icc;

    public NHAI(TrafficInfra icc) {
        this.icc = icc;
    }

    public void execute() {
        System.out.println("Running the execute method of NHAI");
        if (icc != null) {
            icc.fairPlay();
        } else {
            System.out.println("icc is null, cannot execute");
        }
    }
}
