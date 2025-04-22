package com.xworkz.ani.external;

import com.xworkz.ani.internal.SportsBoard;

public class IOA {
    SportsBoard icc;

    public IOA(SportsBoard icc) {
        this.icc = icc;
    }

    public void execute() {
        System.out.println("Running the execute method of IOA");
        if (icc != null) {
            icc.fairPlay();
        } else {
            System.out.println("icc is null, cannot execute");
        }
    }
}
