package com.Xworkz.External;

import com.Xworkz.Internal.Traffic;

public class TrafficRulls implements Traffic {
    @Override
    public void drivingRulls() {
        System.out.println("Draving Rulls:");
    }

    @Override
    public void signalRulls() {
        System.out.println("Signal Rulls in Traffic: ");
    }

    @Override
    public void parkingRulls() {
        System.out.println("Parking Rulls");
    }

    @Override
    public void rules() {
        System.out.println("Rules Driving");
    }
}
