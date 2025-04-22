package com.xworkz.ani.external;

import com.xworkz.ani.internal.Railways;

public class IRCTC {
    Railways icc;

    public IRCTC(Railways icc) {
        this.icc = icc;
    }

    public void execute() {
        System.out.println("Running the execute method of IRCTC");
        if (icc != null) {
            icc.fairPlay();
        } else {
            System.out.println("icc is null, cannot execute");
        }
    }
}
