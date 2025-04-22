package com.xworkz.ani.external;

import com.xworkz.ani.internal.Cleanliness;

public class SwachhBharat {
    Cleanliness icc;

    public SwachhBharat(Cleanliness icc) {
        this.icc = icc;
    }

    public void execute() {
        System.out.println("Running the execute method of SwachhBharat");
        if (icc != null) {
            icc.fairPlay();
        } else {
            System.out.println("icc is null, cannot execute");
        }
    }
}
