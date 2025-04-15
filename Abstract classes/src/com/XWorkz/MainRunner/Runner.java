package com.XWorkz.MainRunner;

import com.XWorkz.External.*;
import com.XWorkz.Internal.*;

public class Runner {
    public static void main(String[] args) {
        GoaTrip goaTrip = new GoaPlan() {
        };
        goaTrip.plan();
        GoaTrip1 goaTrip1=new GoaPlan1();
        goaTrip1.tripPlan1();
        GoaplanFix goaplanFix = new GoaplanFix() {
            @Override
            public void plan2() {

            }
        };

        goaplanFix.tripPlane2();
        GoaTrip3 goaTrip3 = new GoaPlan3("Thirthahalli",45,'A') {
        };
        goaTrip3.plan3();
        System.out.println(goaTrip3);

        System.out.println("");
        GoaTrip4 goaTrip4 = new GoaPlan4(78,"Shivamogga",'A') {
            @Override
            public void plan4() {
                System.out.println("Details: "+this.name+" "+this.distance+" "+this.grade);


            }
        };
        goaTrip4.plan4();
        System.out.println("Result: "+goaTrip4);


    }
}