package com.xworkz.ani.external;

import com.xworkz.ani.internal.TrafficRules;

public class PoliceDept {
    TrafficRules icc;

    public PoliceDept(TrafficRules icc) {
        this.icc = icc;
    }

    public void execute() {
        System.out.println("Running the execute method of PoliceDept");
        if (icc != null) {
            icc.fairPlay();
        } else {
            System.out.println("icc is null, cannot execute");
        }
    }
}
