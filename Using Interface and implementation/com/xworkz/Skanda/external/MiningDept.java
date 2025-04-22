package com.xworkz.ani.external;

import com.xworkz.ani.internal.Mining;

public class MiningDept {
    Mining icc;

    public MiningDept(Mining icc) {
        this.icc = icc;
    }

    public void execute() {
        System.out.println("Running the execute method of MiningDept");
        if (icc != null) {
            icc.fairPlay();
        } else {
            System.out.println("icc is null, cannot execute");
        }
    }
}
