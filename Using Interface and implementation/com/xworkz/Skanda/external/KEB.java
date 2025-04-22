package com.xworkz.ani.external;

import com.xworkz.ani.internal.Electricity;

public class KEB {
    Electricity icc;

    public KEB(Electricity icc) {
        this.icc = icc;
    }

    public void execute() {
        System.out.println("Running the execute method of KEB");
        if (icc != null) {
            icc.fairPlay();
        } else {
            System.out.println("icc is null, cannot execute");
        }
    }
}
