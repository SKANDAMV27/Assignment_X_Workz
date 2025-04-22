package com.xworkz.ani.external;

import com.xworkz.ani.internal.Broadcast;

public class PrasarBharati {
    Broadcast icc;

    public PrasarBharati(Broadcast icc) {
        this.icc = icc;
    }

    public void execute() {
        System.out.println("Running the execute method of PrasarBharati");
        if (icc != null) {
            icc.fairPlay();
        } else {
            System.out.println("icc is null, cannot execute");
        }
    }
}
