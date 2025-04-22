package com.xworkz.ani.external;

import com.xworkz.ani.internal.Technology;

public class MinistryOfIT {
    Technology icc;

    public MinistryOfIT(Technology icc) {
        this.icc = icc;
    }

    public void execute() {
        System.out.println("Running the execute method of MinistryOfIT");
        if (icc != null) {
            icc.fairPlay();
        } else {
            System.out.println("icc is null, cannot execute");
        }
    }
}
