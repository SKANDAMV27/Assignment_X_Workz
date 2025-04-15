package com.XWorkz.Internal;

import com.XWorkz.External.GoaTrip4;

public abstract class GoaPlan4 extends GoaTrip4 {
    public GoaPlan4(int distance, String name, char grade) {
        super(distance, name, grade);
    }
    public void plan4(){
        this.grade='A';
        this.name="Thirthahalli";
        this.distance=87;
    }
}
