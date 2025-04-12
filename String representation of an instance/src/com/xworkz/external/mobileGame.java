package com.xworkz.external;

import com.xworkz.internal.Pubg;

public class mobileGame extends Pubg
{
    private String name;
    private int members;
    private String Day;
    public mobileGame(String name,int members,String Day)
    {
        this.Day=Day;
        this.members=members;
        this.name=name;
    }
    @Override
    public int hashCode()
    {
        System.out.println(super.hashCode());
        return 400;
    }
    public boolean equals(Object obj) {
        if (obj!=null){
            System.out.println("Null");
            if(obj instanceof mobileGame){
                mobileGame Moblegame = this;
                mobileGame Moblegame1 = (mobileGame) obj;
                if(Moblegame.name==Moblegame1.name && Moblegame.members==Moblegame1.members && Moblegame.Day==Moblegame1.Day){
                    System.out.println("Compare :"+(Moblegame==Moblegame1));
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
