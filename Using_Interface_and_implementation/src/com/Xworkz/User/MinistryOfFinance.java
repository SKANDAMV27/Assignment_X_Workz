package com.xworkz.ani.external;

import com.xworkz.ani.internal.Finance;

public class MinistryOfFinance {
    Finance icc;

    public MinistryOfFinance(Finance icc) {
        this.icc = icc;
    }

    public void execute() {
        System.out.println("Running the execute method of MinistryOfFinance");
        if (icc != null) {
            icc.fairPlay();
        } else {
            System.out.println("icc is null, cannot execute");
        }
    }
}
