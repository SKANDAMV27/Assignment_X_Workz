package com.xworkz.ani.external;

import com.xworkz.ani.internal.LabourLaws;

public class LabourDept {
    LabourLaws icc;

    public LabourDept(LabourLaws icc) {
        this.icc = icc;
    }

    public void execute() {
        System.out.println("Running the execute method of LabourDept");
        if (icc != null) {
            icc.fairPlay();
        } else {
            System.out.println("icc is null, cannot execute");
        }
    }
}
