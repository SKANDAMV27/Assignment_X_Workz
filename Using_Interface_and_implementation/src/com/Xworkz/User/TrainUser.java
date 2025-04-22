package com.Xworkz.User;

import com.Xworkz.Internal.Train;

public class TrainUser {
    public Train train;
    public TrainUser(Train train){
        this.train=train;
        System.out.println("No Args as a Constructor");
    }
    public void deparch(){
        if(this.train!=null){
            this.train.book();
            System.out.println("Train Deparch");
        }
        else{
            System.out.println("Null Value");
        }
    }

}
