package com.xworkz.external;

import com.xworkz.internal.Hockey;

public class Match extends Hockey {
    private String name;
    private int members;
    private String Day;
    public Match(String name,int members,String Day)
    {
        this.Day=Day;
        this.members=members;
        this.name=name;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 75320;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("Null Value: ");
            if(obj instanceof Match){
                System.out.println("Comapare: ");
                Match match = this;
                Match match1 =(Match) obj;
                if(match1.Day==match.Day && match1.name==match.name && match1.members==match.members){
                    System.out.println("Compare With the Things: "+(match==match1));
                    return true;
                }
            }

        }
        return false;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name){
        this.name=name;
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

