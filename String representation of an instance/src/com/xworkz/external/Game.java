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
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", members=" + members +
                ", Day='" + Day + '\'' +
                '}';
    }
}
