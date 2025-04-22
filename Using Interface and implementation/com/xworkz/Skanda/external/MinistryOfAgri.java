package com.xworkz.ani.external;

import com.xworkz.ani.internal.Agriculture;

public class MinistryOfAgri {
    Agriculture icc;

    public MinistryOfAgri(Agriculture icc) {
        this.icc = icc;
    }

    public void execute() {
        System.out.println("Running the execute method of MinistryOfAgri");
        if (icc != null) {
            icc.fairPlay();
        } else {
            System.out.println("icc is null, cannot execute");
        }
    }
}
