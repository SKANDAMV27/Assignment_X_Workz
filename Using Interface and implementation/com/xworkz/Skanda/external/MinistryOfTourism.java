package com.xworkz.ani.external;

import com.xworkz.ani.internal.Tourism;

public class MinistryOfTourism {
    Tourism icc;

    public MinistryOfTourism(Tourism icc) {
        this.icc = icc;
    }

    public void execute() {
        System.out.println("Running the execute method of MinistryOfTourism");
        if (icc != null) {
            icc.fairPlay();
        } else {
            System.out.println("icc is null, cannot execute");
        }
    }
}
