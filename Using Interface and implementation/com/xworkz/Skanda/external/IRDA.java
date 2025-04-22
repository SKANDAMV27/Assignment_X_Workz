package com.xworkz.ani.external;

import com.xworkz.ani.internal.Insurance;

public class IRDA {
    Insurance icc;

    public IRDA(Insurance icc) {
        this.icc = icc;
    }

    public void execute() {
        System.out.println("Running the execute method of IRDA");
        if (icc != null) {
            icc.fairPlay();
        } else {
            System.out.println("icc is null, cannot execute");
        }
    }
}
