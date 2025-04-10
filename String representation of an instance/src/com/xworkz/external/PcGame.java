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
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", members=" + members +
                ", Day='" + Day + '\'' +
                '}';
    }
}
