package com.xworkz.external;

import com.xworkz.internal.YCT;

public class PcGame extends YCT {
    private String name;
    private int members;
    private String Day;
    public PcGame(String name,int members,String Day)
    {
        this.Day=Day;
        this.members=members;
        this.name=name;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 754;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("Null Value: ");
            if(obj instanceof PcGame)
            {
                System.out.println("compare: ");
                PcGame p = this;
                PcGame place1 = (Place) obj;
                if(place1.placeName==place.placeName && place.grade == place1.grade && place.distance == place1.distance){
                    System.out.println("Compare With Things: "+(place1==place));
                    return true;
                }
            }

        }
        return false;
    }
    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", members=" + members +
                ", Day='" + Day + '\'' +
                '}';
    }
}
