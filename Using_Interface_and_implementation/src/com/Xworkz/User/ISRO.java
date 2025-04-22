package com.xworkz.ani.external;

import com.xworkz.ani.internal.Science;

public class ISRO {
    Science icc;

    public ISRO(Science icc) {
        this.icc = icc;
    }

    public void execute() {
        System.out.println("Running the execute method of ISRO");
        if (icc != null) {
            icc.fairPlay();
        } else {
            System.out.println("icc is null, cannot execute");
        }
    }
}
