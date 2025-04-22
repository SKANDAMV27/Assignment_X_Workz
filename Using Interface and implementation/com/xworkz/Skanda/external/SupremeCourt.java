package com.xworkz.ani.external;

import com.xworkz.ani.internal.Justice;

public class SupremeCourt {
    Justice icc;

    public SupremeCourt(Justice icc) {
        this.icc = icc;
    }

    public void execute() {
        System.out.println("Running the execute method of SupremeCourt");
        if (icc != null) {
            icc.fairPlay();
        } else {
            System.out.println("icc is null, cannot execute");
        }
    }
}
