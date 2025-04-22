package com.xworkz.ani.external;

import com.xworkz.ani.internal.TaxRules;

public class IncomeTaxDept {
    TaxRules icc;

    public IncomeTaxDept(TaxRules icc) {
        this.icc = icc;
    }

    public void execute() {
        System.out.println("Running the execute method of IncomeTaxDept");
        if (icc != null) {
            icc.fairPlay();
        } else {
            System.out.println("icc is null, cannot execute");
        }
    }
}
