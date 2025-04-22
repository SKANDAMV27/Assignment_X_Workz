package com.xworkz.ani.external;

import com.xworkz.ani.internal.Healthcare;

public class WHO {
    Healthcare icc;

    public WHO(Healthcare icc) {
        this.icc = icc;
    }

    public void execute() {
        System.out.println("Running the execute method of WHO");
        if (icc != null) {
            icc.fairPlay();
        } else {
            System.out.println("icc is null, cannot execute");
        }
    }
}
