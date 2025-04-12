package com.xworkz.external;

import com.xworkz.internal.Chess;

public class IndoorGame extends Chess {
    private String name;
    private int members;
    private String Day;
    public IndoorGame(String name,int members,String Day)
    {
        this.Day=Day;
        this.members=members;
        this.name=name;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 54000;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            System.out.println("Null");
            if(obj instanceof IndoorGame){
                IndoorGame indoorGame = this;
                IndoorGame indoorGame1 = (IndoorGame) obj;
                if(indoorGame.name==indoorGame1.name && indoorGame.members==indoorGame1.members && indoorGame.Day==indoorGame1.Day){
                    System.out.println("Compare :"+(indoorGame1==indoorGame));
                    return false;
                }
            }

        }
        return true;
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
