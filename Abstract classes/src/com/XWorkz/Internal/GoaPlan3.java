package com.XWorkz.Internal;

import com.XWorkz.External.GoaTrip3;

public abstract class GoaPlan3 extends GoaTrip3 {

    public GoaPlan3(String name, int distance, char grade) {
        super(name, distance, grade);
        System.out.println("Details of Place:");
    }
    public void plan3(){
        this.distance=distance;
        this.grade=grade;
        this.name=name;
        System.out.println("Place Details:");
        System.out.println("Name: "+this.name+" Grade: "+this.grade+" Distance: "+this.distance);

    }
}
