package com.xworkz.ani.external;

import com.xworkz.ani.internal.HumanRights;

public class NHRC {
    HumanRights icc;

    public NHRC(HumanRights icc) {
        this.icc = icc;
    }

    public void execute() {
        System.out.println("Running the execute method of NHRC");
        if (icc != null) {
            icc.fairPlay();
        } else {
            System.out.println("icc is null, cannot execute");
        }
    }
}
