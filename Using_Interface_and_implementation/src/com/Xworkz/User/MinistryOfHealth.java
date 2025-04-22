package com.xworkz.ani.external;

import com.xworkz.ani.internal.PublicHealth;

public class MinistryOfHealth {
    PublicHealth icc;

    public MinistryOfHealth(PublicHealth icc) {
        this.icc = icc;
    }

    public void execute() {
        System.out.println("Running the execute method of MinistryOfHealth");
        if (icc != null) {
            icc.fairPlay();
        } else {
            System.out.println("icc is null, cannot execute");
        }
    }
}
