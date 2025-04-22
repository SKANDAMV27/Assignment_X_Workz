package com.xworkz.ani.external;

import com.xworkz.ani.internal.CyberSecurity;

public class CERT {
    CyberSecurity icc;

    public CERT(CyberSecurity icc) {
        this.icc = icc;
    }

    public void execute() {
        System.out.println("Running the execute method of CERT");
        if (icc != null) {
            icc.fairPlay();
        } else {
            System.out.println("icc is null, cannot execute");
        }
    }
}
