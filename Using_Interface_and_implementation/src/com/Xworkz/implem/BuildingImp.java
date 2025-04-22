package com.Xworkz.implem;

import com.Xworkz.Internal.Building;

public class BuildingImp implements Building {
    public BuildingImp(){
        System.out.println("No args Constructor Building Imp");
    }
    @Override
    public void floor() {
        System.out.println("Floor Buling");

    }
}
