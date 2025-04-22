package com.Xworkz.implem;

import com.Xworkz.Internal.Train;

public class TrainImp implements Train {
    public TrainImp(){
        System.out.println("No args Train Imp Constructor");
    }
    @Override
    public void book() {
        System.out.println("Train Booking");

    }
}
