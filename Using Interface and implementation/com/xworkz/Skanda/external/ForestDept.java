package com.xworkz.ani.external;

import com.xworkz.ani.internal.ForestLaws;

public class ForestDept {
    ForestLaws icc;

    public ForestDept(ForestLaws icc) {
        this.icc = icc;
    }

    public void execute() {
        System.out.println("Running the execute method of ForestDept");
        if (icc != null) {
            icc.fairPlay();
        } else {
            System.out.println("icc is null, cannot execute");
        }
    }
}
