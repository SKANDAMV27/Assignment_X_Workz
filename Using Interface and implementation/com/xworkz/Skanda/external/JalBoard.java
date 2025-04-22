package com.xworkz.ani.external;

import com.xworkz.ani.internal.WaterSupply;

public class JalBoard {
    WaterSupply icc;

    public JalBoard(WaterSupply icc) {
        this.icc = icc;
    }

    public void execute() {
        System.out.println("Running the execute method of JalBoard");
        if (icc != null) {
            icc.fairPlay();
        } else {
            System.out.println("icc is null, cannot execute");
        }
    }
}
