package com.xworkz.ani.external;

import com.xworkz.ani.internal.Weather;

public class IMD {
    Weather icc;

    public IMD(Weather icc) {
        this.icc = icc;
    }

    public void execute() {
        System.out.println("Running the execute method of IMD");
        if (icc != null) {
            icc.fairPlay();
        } else {
            System.out.println("icc is null, cannot execute");
        }
    }
}
