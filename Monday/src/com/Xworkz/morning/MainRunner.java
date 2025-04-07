package com.Xworkz.morning;

public class MainRunner {
    public static void main(String[] args) {
        Rubber rubber = new Tyer();
        rubber.price();
        Tyer tyer = new Tyer();
        tyer.price();
        tyer.Compress();
        MRF mrf = new MRF();
        mrf.Compress();
        mrf.price();
        Rubber rubber1 = new Rubber();
        rubber1.price();
        ArmyVehicle armyVehicle = new ArmyVehicle();
        armyVehicle.price(rubber);
        armyVehicle.price(tyer);
        armyVehicle.price(mrf);
        armyVehicle.price(rubber1);

    }
}
