package com.xworkz.ani.external;

import com.xworkz.ani.internal.PostalRules;

public class IndiaPost {
    PostalRules icc;

    public IndiaPost(PostalRules icc) {
        this.icc = icc;
    }

    public void execute() {
        System.out.println("Running the execute method of IndiaPost");
        if (icc != null) {
            icc.fairPlay();
        } else {
            System.out.println("icc is null, cannot execute");
        }
    }
}
