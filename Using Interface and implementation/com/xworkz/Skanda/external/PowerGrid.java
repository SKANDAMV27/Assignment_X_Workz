package com.xworkz.ani.external;

import com.xworkz.ani.internal.Electricity;

public class PowerGrid {
    Electricity icc;

    public PowerGrid(Electricity icc) {
        this.icc = icc;
    }

    public void execute() {
        System.out.println("Running the execute method of PowerGrid");
        if (icc != null) {
            icc.fairPlay();
        } else {
            System.out.println("icc is null, cannot execute");
        }
    }
}
