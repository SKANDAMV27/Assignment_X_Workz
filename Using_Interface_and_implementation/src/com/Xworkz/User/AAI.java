package com.xworkz.ani.external;

import com.xworkz.ani.internal.AirTraffic;

public class AAI {
    AirTraffic icc;

    public AAI(AirTraffic icc) {
        this.icc = icc;
    }

    public void execute() {
        System.out.println("Running the execute method of AAI");
        if (icc != null) {
            icc.fairPlay();
        } else {
            System.out.println("icc is null, cannot execute");
        }
    }
}
