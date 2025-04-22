package com.xworkz.ani.external;

import com.xworkz.ani.internal.Trade;

public class MinistryOfTrade {
    Trade icc;

    public MinistryOfTrade(Trade icc) {
        this.icc = icc;
    }

    public void execute() {
        System.out.println("Running the execute method of MinistryOfTrade");
        if (icc != null) {
            icc.fairPlay();
        } else {
            System.out.println("icc is null, cannot execute");
        }
    }
}
