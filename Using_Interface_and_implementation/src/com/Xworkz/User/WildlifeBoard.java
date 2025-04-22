package com.xworkz.ani.external;

import com.xworkz.ani.internal.Wildlife;

public class WildlifeBoard {
    Wildlife icc;

    public WildlifeBoard(Wildlife icc) {
        this.icc = icc;
    }

    public void execute() {
        System.out.println("Running the execute method of WildlifeBoard");
        if (icc != null) {
            icc.fairPlay();
        } else {
            System.out.println("icc is null, cannot execute");
        }
    }
}
