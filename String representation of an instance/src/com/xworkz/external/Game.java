package com.xworkz.external;

import com.xworkz.internal.Kabadi;

public class Game extends Kabadi {
    private String name;
    private int members;
    private String Day;
    public Game(String name,int members,String Day)
    {
       this.Day=Day;
       this.members=members;
       this.name=name;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 5623;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            System.out.println("Null");
            if(obj instanceof Game){
                Game game = this;
                Game game1 = (Game) obj;
                if(game1.name==game.name && game1.members==game.members && game1.Day==game.Day){
                    System.out.println("Compare :"+(game==game1));
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

    public String getDay() {
        return Day;
    }

    public void setDay(String day) {
        Day = day;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
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
