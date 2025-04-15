package com.XWorkz.Internal;

import com.XWorkz.External.GoaTrip;

public abstract class GoaPlan extends GoaTrip {
    @Override
    public void plan() {
        super.plan();
        System.out.println("plan For The Day:");
    }
}
