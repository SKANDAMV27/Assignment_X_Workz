package com.xworkz.ani.external;

import com.xworkz.ani.internal.Education;

public class University {
    Education icc;

    public University(Education icc) {
        this.icc = icc;
    }

    public void execute() {
        System.out.println("Running the execute method of University");
        if (icc != null) {
            icc.fairPlay();
        } else {
            System.out.println("icc is null, cannot execute");
        }
    }
}
