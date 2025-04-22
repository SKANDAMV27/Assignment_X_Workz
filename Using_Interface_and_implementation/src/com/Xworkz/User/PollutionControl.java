package com.xworkz.ani.external;

import com.xworkz.ani.internal.Environment;

public class PollutionControl {
    Environment icc;

    public PollutionControl(Environment icc) {
        this.icc = icc;
    }

    public void execute() {
        System.out.println("Running the execute method of PollutionControl");
        if (icc != null) {
            icc.fairPlay();
        } else {
            System.out.println("icc is null, cannot execute");
        }
    }
}
