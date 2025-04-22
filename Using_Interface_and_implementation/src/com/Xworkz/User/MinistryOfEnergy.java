package com.xworkz.ani.external;

import com.xworkz.ani.internal.Energy;

public class MinistryOfEnergy {
    Energy icc;

    public MinistryOfEnergy(Energy icc) {
        this.icc = icc;
    }

    public void execute() {
        System.out.println("Running the execute method of MinistryOfEnergy");
        if (icc != null) {
            icc.fairPlay();
        } else {
            System.out.println("icc is null, cannot execute");
        }
    }
}
