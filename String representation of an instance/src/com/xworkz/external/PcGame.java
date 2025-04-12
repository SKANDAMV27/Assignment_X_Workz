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
                PcGame pcGame = this;
                PcGame pcGame1 = (PcGame) obj;
                if(pcGame.name==pcGame1.name && pcGame.members == pcGame1.members && pcGame.Day == pcGame1.Day){
                    System.out.println("Compare With Things: "+(pcGame1==pcGame));
                    return true;
                }
            }

        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    public String getDay() {
        return Day;
    }

    public void setDay(String day) {
        Day = day;
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
