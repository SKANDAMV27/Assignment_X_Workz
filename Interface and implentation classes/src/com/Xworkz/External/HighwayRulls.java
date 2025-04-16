package com.Xworkz.External;

import com.Xworkz.Internal.HighWay;

public class HighwayRulls implements HighWay {
    @Override
    public void speedRulls() {
        System.out.println("Highway Speed Ruls");
    }

    @Override
    public void drivingRulls() {
        System.out.println("Highway Driving Rulls");
    }

    @Override
    public void symbolRulls() {
        System.out.println("Highway Signal Rulls");

    }
}
