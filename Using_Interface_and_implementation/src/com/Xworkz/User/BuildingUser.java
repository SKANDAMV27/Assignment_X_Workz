package com.Xworkz.User;

import com.Xworkz.Internal.Building;

public class BuildingUser {
    public Building building;
    public BuildingUser(Building building){
        this.building=building;
        System.out.println("No args as Buliding Usre Constructor");
    }
    public void base(){
        if(this.building!=null){
            this.building.floor();
            System.out.println("Building Basement");
        }else{
            System.out.println("Null Value.");
        }
    }
}
